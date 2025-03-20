package mx.petcalli.app.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	public static void main(String[] args) {
		System.out.println( new BCryptPasswordEncoder().encode("123")  );
	}
	@Bean
	SecurityFilterChain filterChain( HttpSecurity http) throws Exception {

		return http
				.authorizeHttpRequests( authorize -> authorize
						.requestMatchers("/", "index.html", "/assets/**").permitAll()
						.requestMatchers(HttpMethod.POST, "/api/v1/users").permitAll()
						.requestMatchers(HttpMethod.GET, "/api/v1/products","/api/v1/products/**").permitAll()
						.requestMatchers("/api/v1/users", "/api/v1/roles/**").hasRole("ADMIN")
						.requestMatchers("/api/v1/users/**",
										"/api/v1/order-has-products/**"
								).hasAnyRole("ADMIN","CUSTOMER")
						.anyRequest().authenticated()						
						)
				.csrf( csrf-> csrf.disable() )
				.httpBasic( withDefaults() ) 
				.build();
		
		}
	@Bean
		AuthenticationManager authManager(
            HttpSecurity httpSecurity,
            PasswordEncoder passwordEncoder,
            UserDetailsService userDetailsService
        
        ) throws Exception {
    
			AuthenticationManagerBuilder authManagerBuilder = httpSecurity
					.getSharedObject( AuthenticationManagerBuilder.class  );
    
			authManagerBuilder
			.userDetailsService( userDetailsService ) 
			.passwordEncoder( passwordEncoder );
    
			return authManagerBuilder.build();
			}
}


package mx.petcalli.app.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import mx.petcalli.app.model.Role;
import mx.petcalli.app.model.User;


//STEP 5 Convertir un tipo Customer a UserDetails
	public class UserDetailsImpl implements UserDetails {

		private User user; 
		
		public UserDetailsImpl(User user) {
			this.user = user;
		}
		
		// ajustar lo del 26 para petcalli
		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			List<GrantedAuthority> authorities = new ArrayList<>();
			//Tenemos que evaluar el tipo de relacion many to many o many to one 
			//for( Role role : user.getRoles() ) {
				authorities.add( new SimpleGrantedAuthority("ROLE_" + role.getRole().toUpperCase() ));
			//}
			
			return authorities;
		}

		@Override
		public String getPassword() {
			return user.getPassword();
		}

		@Override
		public String getUsername() {
			return user.getEmail();
		}
		
	}
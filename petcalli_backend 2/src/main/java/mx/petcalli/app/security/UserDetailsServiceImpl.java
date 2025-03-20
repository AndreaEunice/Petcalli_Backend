package mx.petcalli.app.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import mx.petcalli.app.model.User;
import mx.petcalli.app.service.UserService;

//STEP 4 Leer el usuario de la DB
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	// ajustar la 17 y 19 para petcalli 
	
	private final UserService userService;

	public UserDetailsServiceImpl(UserService userService) {
		
		this.userService = userService;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			
		User existingUser = userService.getUserByEmail(username);
		
		// Convertir mi Customer al tipo UserDetails
		UserDetails user = new UserDetailsImpl( existingUser  );
		
		return user;
	}
	
}

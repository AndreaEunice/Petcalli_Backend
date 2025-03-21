/* package mx.petcalli.app.service.impl;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import mx.petcalli.app.model.User;
//import mx.petcalli.app.model.Role;
import mx.petcalli.app.repository.UserRepository;
import mx.petcalli.app.service.RoleService;
//import mx.petcalli.app.service.RoleService;
import mx.petcalli.app.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	
	
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	//private final RoleService roleService;
	//private final RoleService roleService;
	
	public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
		//this.roleService = roleService;	
	}

	@Override
	public User createUser(User user) {
		user.setId(null);
		user.setPassword( passwordEncoder.encode( user.getPassword()));
        return userRepository.save(user);
	}

	@Override
	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Integer id) {
		Optional<User> existingUser = userRepository.findById(id);
        return existingUser.orElseThrow(() -> 
            new IllegalStateException("User does not exist with id " + id));
	}

	@Override
	public User getUserByName(String name) {
		Iterable<User> existingByName = userRepository.findByName(name);
        for (User user : existingByName) {
            return user;
        }
        throw new IllegalStateException("User no existe con el nombre " + name);
	}

	@Override
	public User getUserByLasName(String lastName) {
		Iterable<User> existingByLastName = userRepository.findByLastName(lastName);
        for (User user : existingByLastName) {
            return user;
        }
        throw new IllegalStateException("User no existe con el apellido " + lastName);
	}

	@Override
	public User getUserByEmail(String email) {
		Iterable<User> existingUserByEmail = userRepository.findByEmail(email);
		for (User user : existingUserByEmail) {
            return user;
        }
        throw new IllegalStateException("User no existe con el email " + email);	
	}

	@Override
	public User getUserByTelephone(String telephone) {
        Iterable<User> telephones = userRepository.findByTelephone(telephone);
        for (User tel : telephones) {
            return tel;
        }
        throw new IllegalStateException("Telephone: " + telephone + "no existe");
	}
	
	@Override
	public User getUserByPassword(String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public User updateUser(User user, Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("El ID del usuario no puede ser nulo");
        } if (user == null) {
            throw new IllegalArgumentException("El objeto User no puede ser nulo");
        }
        User existingUser = getUserById(id);
        if(user.getName() != null) {
            existingUser.setName(user.getName() );
            } if (user.getLastName() != null) {
            existingUser.setLastName(user.getLastName());
            } if (user.getEmail() != null) {
            existingUser.setEmail(user.getEmail());
            } if (user.getTelephone() != null) {
            existingUser.setTelephone(user.getTelephone() );
            } if (user.getPassword() != null) {
            existingUser.setPassword(user.getPassword());
            } try {
            return userRepository.save(existingUser);
            } catch (Exception e) {
                throw new RuntimeException("Error al actualizar el usuario");
            }
	}
	@Override
	public void deleteUser(Integer id) {
		if (id == null || id <= 0) {
			throw new IllegalStateException("Id no valido");
		}
		Optional<User>  userOptional = userRepository.findById(id);
		if (userOptional.isPresent()) {
			userRepository.deleteById(id);
		} else{
			throw new IllegalStateException("El usuario no existe");
		}
		
	}

	
}  */

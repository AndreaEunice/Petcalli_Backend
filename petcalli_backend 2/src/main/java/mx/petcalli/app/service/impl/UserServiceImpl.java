package mx.petcalli.app.service.impl;

import java.util.Optional;
import org.springframework.stereotype.Service;

import mx.petcalli.app.model.User;
import mx.petcalli.app.repository.UserRepository;
import mx.petcalli.app.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	
	
	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	
	    public User createUser(User newUser) {
	        return userRepository.save(newUser);
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
		Optional<User> existingUserByEmail = userRepository.findByEmail(email);
		if( existingUserByEmail.isEmpty()) {
            throw new IllegalStateException("Customer does not exist with email " + email);
        }
        return existingUserByEmail.get();
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
	
	public User authenticateUser(String email, String password) {
        Optional<User> userOptional = userRepository.findByEmail(email);
        if (userOptional.isPresent() && userOptional.get().getPassword().equals(password)) {
            return userOptional.get();  // Devuelve el usuario si la contraseña es correcta
        }
        return null;  // Si el usuario no existe o la contraseña es incorrecta
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


	
} 


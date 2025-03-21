package mx.petcalli.app.controller;

import org.springframework.http.ResponseEntity;

import mx.petcalli.app.model.User;

public interface UserController {
	
	ResponseEntity<User> getUserById(Integer id);
	
	

	ResponseEntity<User> createUser(User newUser);

    ResponseEntity<Iterable<User>> getAllUsers();

    ResponseEntity<User> updateUser(User user,Integer id);

    ResponseEntity<Void> deleteUser(Integer id);
	
}

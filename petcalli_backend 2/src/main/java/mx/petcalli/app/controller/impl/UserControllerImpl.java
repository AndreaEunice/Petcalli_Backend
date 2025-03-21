package mx.petcalli.app.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.petcalli.app.controller.UserController;
import mx.petcalli.app.model.User;
import mx.petcalli.app.service.UserService;


@CrossOrigin(origins = "*")
//APIREST para las solicitudes http 
@RequestMapping("/api/v1/users")
@RestController
public class UserControllerImpl implements UserController{

	private final UserService userService;
	
	public UserControllerImpl(UserService userService) {
		  this.userService = userService; 
	  }
	
	@Override
	 @GetMapping("{id}")
	 public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) {
	  return ResponseEntity.ok(userService.getUserById(id));
	 }

	@Override
	 @PostMapping
	 public ResponseEntity<User> createUser(@RequestBody User newUser) {
	  return ResponseEntity.status(201).body(userService.createUser(newUser));
	 }

	@Override
	@GetMapping
	public ResponseEntity<Iterable<User>> getAllUsers() {
		return ResponseEntity.ok(userService.getAllUsers());
	}

	@Override
	 @PutMapping("{id}")
	 public ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable("id") Integer id) {
	  return ResponseEntity.ok(userService.updateUser(user, id));
	 }

	@Override
	 @DeleteMapping("{id}")
	 public ResponseEntity<Void> deleteUser(@PathVariable("id") Integer id) {
	  userService.deleteUser(id);
	  return ResponseEntity.noContent().build();
	 }

}

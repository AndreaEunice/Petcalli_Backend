package mx.petcalli.app.service;

import mx.petcalli.app.model.User;

public interface UserService {
	User createUser(User user);
	
	User getUserById(Integer id);
	User getUserByName(String name);
	User getUserByLasName(String lastName);
	User getUserByEmail(String email);
	User getUserByTelephone(String telephone);
	User getUserByPassword(String password);

	User updateUser(User user, Integer id);
	
	void deletUser(Integer id);
}

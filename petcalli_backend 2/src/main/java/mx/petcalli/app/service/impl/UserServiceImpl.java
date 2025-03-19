package mx.petcalli.app.service.impl;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import mx.petcalli.app.model.User;
import mx.petcalli.app.model.Role;
import mx.petcalli.app.repository.UserRepository;
import mx.petcalli.app.service.RoleService;
import mx.petcalli.app.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	private final RoleService roleService;
	
	public UserServiceImpl(UserRepository userRepository, RoleService roleService) {
		this.userRepository = userRepository;
		this.roleService = roleService;	
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByLasName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByTelephone(String telephone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByPassword(String password) {
		// TODO Auto-generated method stub
		return null;
	}
	


	@Override
	public User updateUser(User user, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletUser(Integer id) {
		// TODO Auto-generated method stub
		
	}

	
	

}

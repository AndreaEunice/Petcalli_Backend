package mx.petcalli.app.service.impl;

import java.util.Set;

import org.springframework.stereotype.Service;

import mx.petcalli.app.model.Role;
import mx.petcalli.app.repository.RoleRepository;
import mx.petcalli.app.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	private final RoleRepository roleRepository;
	
	RoleServiceImpl(RoleRepository roleRepository){
		this.roleRepository = roleRepository;
	}

	@Override
	public Role createRole(Role role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getRoleById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role updateRole(Role role, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRole(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

package mx.petcalli.app.service;

import java.util.Set;

import mx.petcalli.app.model.Role;

public interface RoleService {
	Role createRole(Role role);
	Role getRoleById(Integer id);

	Role updateRole(Role role, Integer id);
	void deleteRole(Integer id);

}

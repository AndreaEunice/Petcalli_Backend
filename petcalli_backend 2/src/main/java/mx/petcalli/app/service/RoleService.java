package mx.petcalli.app.service;



import mx.petcalli.app.model.Role;

public interface RoleService {
	Role createRole(Role role);
	Role getRoleById(Integer id);
	Iterable<Role> getAllRoles();
	Role updateRole(Role role, Integer id);
	void deleteRole(Integer id);
	

}

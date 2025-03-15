package mx.petcalli.app.service;

import mx.petcalli.app.model.Role;

public interface RoleService {
	Role createRole(Role role);
	Role getRoleById(Integer id);
	//Role getCustomerByEmail(String email);
	//Page<Customer> getAllUsers(boolean isActive, int pageNumber, int pageSize);
	Role updateRole(Role role, Integer id);
	void deleteRole(Integer id);
}

package mx.petcalli.app.controller;

import org.springframework.http.ResponseEntity;
import mx.petcalli.app.model.Role;

public interface RoleController {

    ResponseEntity<Role> getRoleById(Integer id);
    ResponseEntity< Iterable<Role> > getAllRoles();
    ResponseEntity< Role > createRole(Role newRole);
    ResponseEntity< Role > updateRole(Role role, Integer id);
    ResponseEntity< Void > deleteRole(Integer id);
	
}

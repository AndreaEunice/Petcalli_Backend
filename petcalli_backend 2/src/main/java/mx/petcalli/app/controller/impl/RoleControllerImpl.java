package mx.petcalli.app.controller.impl;
/*

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

import mx.petcalli.app.controller.RoleController;
import mx.petcalli.app.model.Role;
import mx.petcalli.app.service.*;

@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/roles")
@RestController
public class RoleControllerImpl implements RoleController {
	private final RoleService roleService;

	public RoleControllerImpl(RoleService roleService) {
		this.roleService = roleService;
	}

	@Override
	@GetMapping("{id}")
	public ResponseEntity<Role> getRoleById(@PathVariable("id") Integer id) {
		return ResponseEntity.ok(roleService.getRoleById(id));
	}

	@Override
	@GetMapping
	public ResponseEntity<Iterable<Role>> getAllRoles() {
		return ResponseEntity.ok(roleService.getAllRoles());
	}

	@Override
	@PostMapping
	public ResponseEntity<Role> createRole(@RequestBody Role newRole) {
		return ResponseEntity.status(201).body(roleService.createRole(newRole));
	}

	@Override
	@PutMapping("{id}")
	public ResponseEntity<Role> updateRole(@RequestBody Role role, @PathVariable("id") Integer id) {
		return ResponseEntity.ok(roleService.updateRole(role, id));
	}

	@Override
	@DeleteMapping("{id}")
	public ResponseEntity<Void> deleteRole(@PathVariable("id") Integer id) {
		roleService.deleteRole(id);
		return ResponseEntity.noContent().build();
	}
}*/

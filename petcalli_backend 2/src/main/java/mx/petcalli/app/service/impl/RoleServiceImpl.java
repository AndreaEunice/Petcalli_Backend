package mx.petcalli.app.service.impl;

import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import mx.petcalli.app.model.Role;
import mx.petcalli.app.repository.RoleRepository;
import mx.petcalli.app.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

		
		private final RoleRepository roleRepository;
		
		public RoleServiceImpl(RoleRepository roleRepository) {
			this.roleRepository = roleRepository;
		}

		@Override
		public Role createRole(Role role) {
			role.setId(null);
			role.setRole( role.getRole().toUpperCase() );
			return roleRepository.save(role);
		}

		@Override
		public Role getRoleById(Integer id) {
			Optional<Role> existingRole = roleRepository.findById(id);
			return existingRole.orElseThrow( ()-> new IllegalStateException("Role does not exist with id " + id) );
		}

		/*@Override
		public Role getRoleByName(String name) {
			Optional<Role> existingRole = roleRepository.findByName(name);
			return existingRole.orElseThrow( ()-> new IllegalStateException("Role does not exist with name " + name) );
		}*/

		@Override
		public Iterable<Role> getAllRoles() {
			return roleRepository.findAll() ;
		}

		@Override
		public Role updateRole(Role role, Integer id) {
			Role existingRole = getRoleById(id);
			existingRole.setRole( role.getRole().toUpperCase() );
			existingRole.setDescription( role.getDescription() );
			return roleRepository.save(existingRole);
		}

		@Override
		public void deleteRole(Integer id) {
			Role existingRole = getRoleById(id);
			roleRepository.delete(existingRole);
		}
}

	
	



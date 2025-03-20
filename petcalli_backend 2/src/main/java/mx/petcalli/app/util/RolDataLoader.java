package mx.petcalli.app.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;

import mx.petcalli.app.model.Role;
import mx.petcalli.app.repository.RoleRepository;

@Component
public class RolDataLoader implements CommandLineRunner{
	@Autowired
	RoleRepository rP;
	
	private static final Logger log = LoggerFactory.getLogger(RolDataLoader.class);
	
	@Override
	public void run(String... args) throws Exception {
		rP.save(new Role("Vendedor","Vendedor de la tienda, tambien tiene la opcion de comprar"));
		rP.save(new Role("Cliente","Solo tiene la opcion de comprar"));
		rP.save(new Role("Invitado","Invitado puede comprar sin la necesidad de tener una sesion activa"));
		rP.save(new Role("Administrador","Permisos especiales"));
	}
}


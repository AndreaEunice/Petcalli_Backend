/*package mx.petcalli.app.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import mx.petcalli.app.model.Role;
import mx.petcalli.app.repository.RoleRepository;

@Component
public class RolDataLoader implements CommandLineRunner{
	@Autowired
	RoleRepository rP;
	
	@Override
	public void run(String... args) throws Exception {
		rP.save(new Role(12,"Vendedor","Vendedor de la tienda, tambien tiene la opcion de comprar"));
		rP.save(new Role(13,"Cliente","Solo tiene la opcion de comprar"));
		rP.save(new Role(14,"Invitado","Invitado puede comprar sin la necesidad de tener una sesion activa"));
	}
}
*/

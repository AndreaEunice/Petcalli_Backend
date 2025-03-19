/*package mx.petcalli.app.util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import mx.petcalli.app.model.User;
import mx.petcalli.app.repository.UserRepository;

@Component
@Order(2)
public class UserDataLoader implements CommandLineRunner{
        @Autowired
      UserRepository userRepository;
        @Override
        public void run(String... args) throws Exception {
      userRepository.save(new User("Cesar", "Millan", "cesar.millan@pets.com", "123-456-7890", "DogW!sp1"));
      userRepository.save(new User("Jackson", "Galaxy", "jackson.galaxy@pets.com", "987-654-3210", "CatD@ddy2"));
      userRepository.save(new User("Temple", "Grandin", "temple.grandin@pets.com", "555-678-1234", "An!m4lB3"));
      userRepository.save(new User("Juan", "Villalobos", "juan.villalobos", "444-222-5678", "Perr!t05"));
      userRepository.save(new User("Jane", "Goodall", "jane.goodall", "666-999-0000", "ChimpR$8"));
      userRepository.save(new User("Jose", "Ernesto", "jose.ernesto@pets.com", "111-333-2222", "Ec0l0g!a"));
      userRepository.save(new User("Carlos", "Rodriguez", "carlos.rodriguez@pets.com", "777-888-9999", "VetL0v#9"));
        }
}
*/
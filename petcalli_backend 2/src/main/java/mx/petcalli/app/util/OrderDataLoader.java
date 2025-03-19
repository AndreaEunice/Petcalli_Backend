package mx.petcalli.app.util;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import mx.petcalli.app.model.Order;
import mx.petcalli.app.repository.OrderRepository;



@Component
//@Order(1)
@Profile("loaderH2")
public class OrderDataLoader implements CommandLineRunner {

    @Autowired
    OrderRepository orderRepository;

    private static final Logger log = LoggerFactory.getLogger(OrderDataLoader.class);

    @Override
    public void run(String... args) throws Exception {
        orderRepository.save(new Order(5, LocalDate.of(2024, 10, 21), 1, "tarjeta_de_credito", 802.50, null));
        orderRepository.save(new Order(1, LocalDate.of(2024, 02, 18), 2, "tarjeta_de_debito", 700.50, null));
        orderRepository.save(new Order(1, LocalDate.of(2024, 02, 26), 3, "tarjeta_de_credito", 451.25, null));
        orderRepository.save(new Order(3, LocalDate.of(2024, 12, 21), 4, "tarjeta_de_debito", 884.50, null));
        orderRepository.save(new Order(2, LocalDate.of(2024, 9, 24), 5, "tarjeta_de_credito", 579.50, null));
       

        
    }




    
}

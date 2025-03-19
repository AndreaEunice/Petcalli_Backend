package mx.petcalli.app.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import mx.petcalli.app.model.Order;
import mx.petcalli.app.repository.OrderRepository;



@Component
@org.springframework.core.annotation.Order(2)
@Profile("loaderH2")
public class OrderDataLoader implements CommandLineRunner {

    @Autowired
    OrderRepository orderRepository;

    private static final Logger log = LoggerFactory.getLogger(OrderDataLoader.class);

    @Override
    public void run(String... args) throws Exception {
        orderRepository.save(new Order(null, null, null, null, null));
        orderRepository.save(new Order(null, null, null, null, null));
        orderRepository.save(new Order(null, null, null, null, null));
        orderRepository.save(new Order(null, null, null, null, null));
        orderRepository.save(new Order(null, null, null, null, null));
        orderRepository.save(new Order(null, null, null, null, null));

        
       

        
    }




    
}

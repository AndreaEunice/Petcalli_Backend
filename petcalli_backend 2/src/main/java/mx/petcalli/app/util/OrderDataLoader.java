package mx.petcalli.app.util;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mx.petcalli.app.model.Order;
import mx.petcalli.app.repository.OrderRepository;



@Component
@org.springframework.core.annotation.Order(2)
//@Profile("loaderH2")
public class OrderDataLoader implements CommandLineRunner {

    @Autowired
    OrderRepository orderRepository;

    private static final Logger log = LoggerFactory.getLogger(OrderDataLoader.class);

    @Override
    public void run(String... args) throws Exception {
        orderRepository.save(new Order(5, LocalDateTime.now(), "tarjeta_de_credito", BigDecimal.valueOf(820.50)));
     /*    orderRepository.save(new Order(null, 2, LocalDateTime.now(), "tarjeta_de_debito", BigDecimal.valueOf(100.75)));
        orderRepository.save(new Order(null, 1, LocalDateTime.now(), "tarjeta_de_credito", BigDecimal.valueOf(451.25)));
        orderRepository.save(new Order(null, 1, LocalDateTime.now(), "tarjeta_de_debito", BigDecimal.valueOf(1000.70)));
        orderRepository.save(new Order(null, 1, LocalDateTime.now(), "tarjeta_de_credito", BigDecimal.valueOf(484.50)));
        orderRepository.save(new Order(null, 3, LocalDateTime.now(), "tarjeta_de_debito", BigDecimal.valueOf(579.50)));
 */
        
       

        
    }




    
}

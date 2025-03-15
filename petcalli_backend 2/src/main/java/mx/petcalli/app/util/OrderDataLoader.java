package mx.petcalli.app.util;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mx.petcalli.app.model.Order;
import mx.petcalli.app.repository.OrderRepository;

@Component
public class OrderDataLoader implements CommandLineRunner {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        orderRepository.save(new Order(1, 2, 5, LocalDate.now(), 802.75, "tarjeta_de_credito"));
        orderRepository.save(new Order(2, 1, 1, LocalDate.now(), 700.50, "tarjeta_de_debito"));
        orderRepository.save(new Order(3, 1, 1, LocalDate.now(), 451.25, "tarjeta_de_debito"));
        orderRepository.save(new Order(4, 1, 3, LocalDate.now(), 484.50, "tarjeta_de_credito"));
        orderRepository.save(new Order(5, 2, 2, LocalDate.now(), 579.50, "tarjeta_de_debito"));

    }

}
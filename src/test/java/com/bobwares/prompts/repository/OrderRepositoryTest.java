package com.bobwares.prompts.repository;

import com.bobwares.prompts.entity.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@Sql(scripts = {"/customer.sql", "/product.sql", "/order.sql"})
public class OrderRepositoryTest {

    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void testLoadOrderData() {
        assertThat(orderRepository.count()).isEqualTo(3);

        Order order1 = orderRepository.findById("order1").orElse(null);
        assertThat(order1).isNotNull();
        assertThat(order1.getCustomerId()).isEqualTo("1");
        assertThat(order1.getProductId()).isEqualTo("1");
        assertThat(order1.getQuantity()).isEqualTo(2);

        Order order2 = orderRepository.findById("order2").orElse(null);
        assertThat(order2).isNotNull();
        assertThat(order2.getCustomerId()).isEqualTo("2");
        assertThat(order2.getProductId()).isEqualTo("2");
        assertThat(order2.getQuantity()).isEqualTo(1);
    }
}
package com.bobwares.prompts.repository;

import com.bobwares.prompts.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.Assertions.assertThat;

@Sql(scripts = "/product.sql")
@DataJpaTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testLoadProductData() {
        Product product1 = productRepository.findById(1L).orElse(null);
        assertThat(product1).isNotNull();
        assertThat(product1.getName()).isEqualTo("Product 1");
        assertThat(product1.getDescription()).isEqualTo("Description 1");
        assertThat(product1.getPrice()).isEqualTo(9.99);
        assertThat(product1.getStockQuantity()).isEqualTo(10);

        Product product2 = productRepository.findById(2L).orElse(null);
        assertThat(product2).isNotNull();
        assertThat(product2.getName()).isEqualTo("Product 2");
        assertThat(product2.getDescription()).isEqualTo("Description 2");
        assertThat(product2.getPrice()).isEqualTo(19.99);
        assertThat(product2.getStockQuantity()).isEqualTo(20);
    }
}
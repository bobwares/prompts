package com.bobwares.prompts.repository;

import com.bobwares.prompts.domain.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.Assertions.assertThat;
@Sql(scripts = "/data.sql") // Path to your data.sql file relative to test resources

@DataJpaTest
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testLoadCustomerData() {
        Customer customer1 = customerRepository.findByEmail("john.doe@example.com");
        assertThat(customer1).isNotNull();
        assertThat(customer1.getName()).isEqualTo("John Doe");
        assertThat(customer1.getAddress()).isEqualTo("123 Main St");

        Customer customer2 = customerRepository.findByEmail("jane.smith@example.com");
        assertThat(customer2).isNotNull();
        assertThat(customer2.getName()).isEqualTo("Jane Smith");
        assertThat(customer2.getAddress()).isEqualTo("456 Elm St");
    }
}
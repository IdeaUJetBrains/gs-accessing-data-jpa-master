package main.java.hello;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<main.java.hello.Customer> findByLastName(String lastName);

    @Query("select c from main.java.hello.Customer c")
    List<main.java.hello.Customer> findAllCustomers();
}

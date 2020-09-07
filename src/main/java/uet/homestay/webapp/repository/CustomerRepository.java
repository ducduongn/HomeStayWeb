package uet.homestay.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uet.homestay.webapp.model.Customer;

import java.util.List;

@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findAll();
    void saveCustomer(Customer customer);
    Customer findById(int id);
    void deleteById(int id);

}

package uet.homestay.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import uet.homestay.webapp.exception.ResourceNotFoundException;
import uet.homestay.webapp.model.Customer;
import uet.homestay.webapp.repository.CustomerRepository;

import java.util.List;

public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Transactional
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Transactional
    public void saveCustomer(Customer customer){
        customerRepository.saveCustomer(customer);
    }

    @Transactional
    public Customer getCustomer(int id) {
        return customerRepository.findById(id);
    }

    @Transactional
    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }

}

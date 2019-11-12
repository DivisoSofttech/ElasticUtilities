package com.diviso.graeshoppe.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.diviso.graeshoppe.avro.Customer;

import java.util.Optional;

/**
 * Service Interface for managing Customer.
 */
public interface CustomerService {

    /**
     * create a customer.
     *
     * @param Customer the entity to create
     * @return the persisted entity
     */
    void create(Customer customer);

    /**
     * update a customer.
     *
     * @param Customer the entity to update
     * @return the persisted entity
     */
    void update(Customer customer);
    
    
    
    
   
    /**
     * Delete the "id" customer.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

  
}

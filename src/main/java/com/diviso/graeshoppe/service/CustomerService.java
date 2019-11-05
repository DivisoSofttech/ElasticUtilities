package com.diviso.graeshoppe.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.diviso.graeshoppe.domain.Customer;

import java.util.Optional;

/**
 * Service Interface for managing Customer.
 */
public interface CustomerService {

    /**
     * Save a customer.
     *
     * @param Customer the entity to save
     * @return the persisted entity
     */
    Customer save(Customer customer);

   
    /**
     * Delete the "id" customer.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

  
}

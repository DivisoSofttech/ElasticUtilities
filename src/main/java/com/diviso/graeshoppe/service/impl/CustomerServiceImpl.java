package com.diviso.graeshoppe.service.impl;

import com.diviso.graeshoppe.service.CustomerService;
import com.diviso.graeshoppe.domain.Customer;

import com.diviso.graeshoppe.repository.search.CustomerSearchRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * Service Implementation for managing Customer.
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private final Logger log = LoggerFactory.getLogger(CustomerServiceImpl.class);


  

    private final CustomerSearchRepository customerSearchRepository;

    public CustomerServiceImpl( CustomerSearchRepository customerSearchRepository) {
        
        
        this.customerSearchRepository = customerSearchRepository;
    }

    /**
     * create a customer.
     *
     * @param Customer the entity to save
     * @return the persisted entity
     */
    @Override
    public Customer create(Customer customer) {
        log.debug("Request to save Customer : {}", customer);
        
        
        return customerSearchRepository.save(customer);
    }

    /**
     * update a customer.
     *
     * @param Customer the entity to update
     * @return the persisted entity
     */
    @Override
    public Customer update(Customer customer) {
        log.debug("Request to update Customer : {}", customer);
        
        
        return customerSearchRepository.save(customer);
    }
    
    
   
    /**
     * Delete the customer by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Customer : {}", id);   
       
        customerSearchRepository.deleteById(id);
    }

   
    
    
}

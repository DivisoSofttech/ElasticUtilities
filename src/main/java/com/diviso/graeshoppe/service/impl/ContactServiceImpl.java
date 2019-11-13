package com.diviso.graeshoppe.service.impl;

import com.diviso.graeshoppe.service.ContactService;
import com.diviso.graeshoppe.domain.Customer;
import com.diviso.graeshoppe.domain.Contact;
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
public class ContactServiceImpl implements ContactService {

    private final Logger log = LoggerFactory.getLogger(ContactServiceImpl.class);


  

    private final CustomerSearchRepository customerSearchRepository;

    public ContactServiceImpl( CustomerSearchRepository customerSearchRepository) {
        
        
        this.customerSearchRepository = customerSearchRepository;
    }

    /**
     * create a contact.
     *
     * @param Customer the entity to save
     * @return the persisted entity
     */
    @Override
    public void create(Contact contact) {
        log.debug("Request to save Customer : {}", contact);
        
        
       //  customerSearchRepository.save(contact);
    }

    /**
     * update a contact.
     *
     * @param Customer the entity to update
     * @return the persisted entity
     */
    @Override
    public void update(Contact contact) {
        log.debug("Request to update Customer : {}", contact);
        
        
       //  customerSearchRepository.save(contact);
    }
    
    
   
    /**
     * Delete the contact by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Contact : {}", id);   
       
       // customerSearchRepository.deleteById(id);
    }

   
    
    
}

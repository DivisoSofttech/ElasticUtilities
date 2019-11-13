package com.diviso.graeshoppe.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.diviso.graeshoppe.domain.Contact;

import java.util.Optional;

/**
 * Service Interface for managing Customer.
 */
public interface ContactService {

    /**
     * create a contact.
     *
     * @param Contactthe entity to create
     * @return the persisted entity
     */
    void create(Contact contact);

    /**
     * update a contact.
     *
     * @param Contactthe entity to update
     * @return the persisted entity
     */
    void update(Contact contact);
    
    
    
    
   
    /**
     * Delete the "id" contact.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

  
}

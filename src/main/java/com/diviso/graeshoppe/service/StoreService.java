package com.diviso.graeshoppe.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.diviso.graeshoppe.domain.Store;

import java.util.Optional;

/**
 * Service Interface for managing Customer.
 */
public interface StoreService {

    /**
     * Save a store.
     *
     * @param Customer the entity to save
     * @return the persisted entity
     */
    Store save(Store store);

    /**
     * Get all the stores.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<Store> findAll(Pageable pageable);


    /**
     * Get the "id" store.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<Store> findOne(Long id);

    /**
     * Delete the "id" store.
     *
     * @param id the id of the entity
     */
//    void delete(Long id);

  
}

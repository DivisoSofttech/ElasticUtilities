package com.diviso.graeshoppe.service.impl;

import com.diviso.graeshoppe.service.StoreService;
import com.diviso.graeshoppe.domain.Store;

import com.diviso.graeshoppe.repository.search.StoreSearchRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * Service Implementation for managing Store.
 */
@Service
@Transactional
public class StoreServiceImpl implements StoreService {

    private final Logger log = LoggerFactory.getLogger(StoreServiceImpl.class);


  

    private final StoreSearchRepository storeSearchRepository;

    public StoreServiceImpl( StoreSearchRepository storeSearchRepository) {
        
        
        this.storeSearchRepository = storeSearchRepository;
    }

    /**
     * Save a store.
     *
     * @param Store the entity to save
     * @return the persisted entity
     */
    @Override
    public Store save(Store store) {
        log.debug("Request to save Store : {}", store);
        
        
        return storeSearchRepository.save(store);
    }

    /**
     * Get all the stores.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<Store> findAll(Pageable pageable) {
        log.debug("Request to get all Stores");
        return null;
    }


    /**
     * Get one store by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<Store> findOne(Long id) {
        log.debug("Request to get Store : {}", id);
        return null;
    }

    /**
     * Delete the store by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Store : {}", id);   
       
        storeSearchRepository.deleteById(id);
    }

   
    
    
}

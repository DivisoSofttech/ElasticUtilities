package com.diviso.graeshoppe.service.impl;

import com.diviso.graeshoppe.service.EntryLineItemService;
import com.diviso.graeshoppe.domain.EntryLineItem;

import com.diviso.graeshoppe.repository.search.EntryLineItemSearchRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * Service Implementation for managing EntryLineItem.
 */
@Service
@Transactional
public class EntryLineItemServiceImpl implements EntryLineItemService {

    private final Logger log = LoggerFactory.getLogger(EntryLineItemServiceImpl.class);


  

    private final EntryLineItemSearchRepository entryLineItemSearchRepository;

    public EntryLineItemServiceImpl( EntryLineItemSearchRepository entryLineItemSearchRepository) {
        
        
        this.entryLineItemSearchRepository = entryLineItemSearchRepository;
    }

    /**
     * Save a entryLineItem.
     *
     * @param EntryLineItem the entity to save
     * @return the persisted entity
     */
    @Override
    public EntryLineItem save(EntryLineItem entryLineItem) {
        log.debug("Request to save EntryLineItem : {}", entryLineItem);
        
        
        return entryLineItemSearchRepository.save(entryLineItem);
    }

   
    /**
     * Delete the entryLineItem by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete EntryLineItem : {}", id);   
       
        entryLineItemSearchRepository.deleteById(id);
    }

   
    
    
}

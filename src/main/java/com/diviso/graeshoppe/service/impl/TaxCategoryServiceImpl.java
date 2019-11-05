package com.diviso.graeshoppe.service.impl;

import com.diviso.graeshoppe.service.TaxCategoryService;
import com.diviso.graeshoppe.domain.TaxCategory;

import com.diviso.graeshoppe.repository.search.TaxCategorySearchRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * Service Implementation for managing TaxCategory.
 */
@Service
@Transactional
public class TaxCategoryServiceImpl implements TaxCategoryService {

    private final Logger log = LoggerFactory.getLogger(TaxCategoryServiceImpl.class);


  

    private final TaxCategorySearchRepository taxCategorySearchRepository;

    public TaxCategoryServiceImpl( TaxCategorySearchRepository taxCategorySearchRepository) {
        
        
        this.taxCategorySearchRepository = taxCategorySearchRepository;
    }

    /**
     * Save a taxCategory.
     *
     * @param TaxCategory the entity to save
     * @return the persisted entity
     */
    @Override
    public TaxCategory save(TaxCategory taxCategory) {
        log.debug("Request to save TaxCategory : {}", taxCategory);
        
        
        return taxCategorySearchRepository.save(taxCategory);
    }

   
    /**
     * Delete the taxCategory by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete TaxCategory : {}", id);   
       
        taxCategorySearchRepository.deleteById(id);
    }

   
    
    
}

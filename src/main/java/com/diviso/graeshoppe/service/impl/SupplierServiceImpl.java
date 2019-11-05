package com.diviso.graeshoppe.service.impl;

import com.diviso.graeshoppe.service.SupplierService;
import com.diviso.graeshoppe.domain.Supplier;

import com.diviso.graeshoppe.repository.search.SupplierSearchRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * Service Implementation for managing Supplier.
 */
@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {

    private final Logger log = LoggerFactory.getLogger(SupplierServiceImpl.class);


  

    private final SupplierSearchRepository supplierSearchRepository;

    public SupplierServiceImpl( SupplierSearchRepository supplierSearchRepository) {
        
        
        this.supplierSearchRepository = supplierSearchRepository;
    }

    /**
     * Save a supplier.
     *
     * @param Supplier the entity to save
     * @return the persisted entity
     */
    @Override
    public Supplier save(Supplier supplier) {
        log.debug("Request to save Supplier : {}", supplier);
        
        
        return supplierSearchRepository.save(supplier);
    }

   
    /**
     * Delete the supplier by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Supplier : {}", id);   
       
        supplierSearchRepository.deleteById(id);
    }

   
    
    
}

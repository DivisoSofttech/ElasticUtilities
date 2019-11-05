package com.diviso.graeshoppe.service.impl;

import com.diviso.graeshoppe.service.PackageProductService;
import com.diviso.graeshoppe.domain.PackageProduct;

import com.diviso.graeshoppe.repository.search.PackageProductSearchRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * Service Implementation for managing PackageProduct.
 */
@Service
@Transactional
public class PackageProductServiceImpl implements PackageProductService {

    private final Logger log = LoggerFactory.getLogger(PackageProductServiceImpl.class);

   


    private final PackageProductSearchRepository packageProductSearchRepository;

    public PackageProductServiceImpl(  PackageProductSearchRepository packageProductSearchRepository) {
       
        this.packageProductSearchRepository = packageProductSearchRepository;
    }

    /**
     * Save a packageProduct.
     *
     * @param packageProduct the entity to save
     * @return the persisted entity
     */
    @Override
    public PackageProduct save(PackageProduct packageProduct) {
        log.debug("Request to save PackageProduct : {}", packageProduct);
     
       
        return packageProductSearchRepository.save(packageProduct);
    }

  



    /**
     * Delete the packageProduct by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete PackageProduct : {}", id);    
        packageProductSearchRepository.deleteById(id);
    }

   
 
}

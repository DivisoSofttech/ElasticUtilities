package com.diviso.graeshoppe.service;

import com.diviso.graeshoppe.domain.PackageProduct;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing PackageProduct.
 */
public interface PackageProductService {

    /**
     * Save a packageProduct.
     *
     * @param packageProduct the entity to save
     * @return the persisted entity
     */
    PackageProduct save(PackageProduct packageProduct);

   
    /**
     * Delete the "id" packageProduct.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

    
}

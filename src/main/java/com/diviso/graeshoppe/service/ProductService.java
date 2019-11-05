package com.diviso.graeshoppe.service;

import com.diviso.graeshoppe.domain.Product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing Product.
 */
public interface ProductService {

    /**
     * Save a product.
     *
     * @param product the entity to save
     * @return the persisted entity
     */
    Product save(Product product);

  
    /**
     * Delete the "id" product.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

 
}

package com.diviso.graeshoppe.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.diviso.graeshoppe.domain.Supplier;

import java.util.Optional;

/**
 * Service Interface for managing Supplier.
 */
public interface SupplierService {

    /**
     * Save a supplier.
     *
     * @param Supplier the entity to save
     * @return the persisted entity
     */
    Supplier save(Supplier supplier);

   
    /**
     * Delete the "id" supplier.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

  
}

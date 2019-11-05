package com.diviso.graeshoppe.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.diviso.graeshoppe.domain.TaxCategory;

import java.util.Optional;

/**
 * Service Interface for managingTaxCategory.
 */
public interface TaxCategoryService {

    /**
     * Save a taxCategory.
     *
     * @paramTaxCategory the entity to save
     * @return the persisted entity
     */
   TaxCategory save(TaxCategory taxCategory);

   
    /**
     * Delete the "id" taxCategory.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

  
}

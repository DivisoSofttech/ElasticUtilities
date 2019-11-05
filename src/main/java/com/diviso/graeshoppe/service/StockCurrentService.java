package com.diviso.graeshoppe.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.diviso.graeshoppe.domain.StockCurrent;

import java.util.Optional;

/**
 * Service Interface for managing StockCurrent.
 */
public interface StockCurrentService {

    /**
     * Save a stockCurrent.
     *
     * @param StockCurrent the entity to save
     * @return the persisted entity
     */
    StockCurrent save(StockCurrent stockCurrent);

   
    /**
     * Delete the "id" stockCurrent.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

  
}

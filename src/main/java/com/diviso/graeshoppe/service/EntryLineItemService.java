package com.diviso.graeshoppe.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.diviso.graeshoppe.domain.EntryLineItem;

import java.util.Optional;

/**
 * Service Interface for managing EntryLineItem.
 */
public interface EntryLineItemService {

    /**
     * Save a entryLineItem.
     *
     * @param EntryLineItem the entity to save
     * @return the persisted entity
     */
    EntryLineItem save(EntryLineItem entryLineItem);

   
    /**
     * Delete the "id" entryLineItem.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

  
}

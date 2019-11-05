package com.diviso.graeshoppe.service.impl;

import com.diviso.graeshoppe.service.StockCurrentService;
import com.diviso.graeshoppe.domain.StockCurrent;

import com.diviso.graeshoppe.repository.search.StockCurrentSearchRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * Service Implementation for managing StockCurrent.
 */
@Service
@Transactional
public class StockCurrentServiceImpl implements StockCurrentService {

    private final Logger log = LoggerFactory.getLogger(StockCurrentServiceImpl.class);


  

    private final StockCurrentSearchRepository stockCurrentSearchRepository;

    public StockCurrentServiceImpl( StockCurrentSearchRepository stockCurrentSearchRepository) {
        
        
        this.stockCurrentSearchRepository = stockCurrentSearchRepository;
    }

    /**
     * Save a stockCurrent.
     *
     * @param StockCurrent the entity to save
     * @return the persisted entity
     */
    @Override
    public StockCurrent save(StockCurrent stockCurrent) {
        log.debug("Request to save StockCurrent : {}", stockCurrent);
        
        
        return stockCurrentSearchRepository.save(stockCurrent);
    }

   
    /**
     * Delete the stockCurrent by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete StockCurrent : {}", id);   
       
        stockCurrentSearchRepository.deleteById(id);
    }

   
    
    
}

package com.diviso.graeshoppe.service.impl;

import com.diviso.graeshoppe.service.ProductService;
import com.diviso.graeshoppe.domain.Product;

import com.diviso.graeshoppe.repository.search.ProductSearchRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * Service Implementation for managing Product.
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);

   

    private final ProductSearchRepository productSearchRepository;

    public ProductServiceImpl( ProductSearchRepository productSearchRepository) {
       
        this.productSearchRepository = productSearchRepository;
    }

    /**
     * Save a product.
     *
     * @param product the entity to save
     * @return the persisted entity
     */
    @Override
    public Product save(Product product) {
        log.debug("Request to save Product : {}", product);
      
       
        return  productSearchRepository.save(product);
    }





    /**
     * Delete the product by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Product : {}", id);     
        productSearchRepository.deleteById(id);
    }

  
}

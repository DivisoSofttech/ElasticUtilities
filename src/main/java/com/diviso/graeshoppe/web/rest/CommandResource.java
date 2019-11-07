package com.diviso.graeshoppe.web.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.domain.Customer;
import com.diviso.graeshoppe.service.CustomerService;
import com.diviso.graeshoppe.domain.Store;
import com.diviso.graeshoppe.service.StoreService;
import com.diviso.graeshoppe.web.rest.errors.BadRequestAlertException;
import com.diviso.graeshoppe.web.rest.util.HeaderUtil;
import com.diviso.graeshoppe.web.rest.util.PaginationUtil;

import io.github.jhipster.web.util.ResponseUtil;

import org.springframework.http.HttpHeaders;
import java.util.Optional;
@RestController
@RequestMapping("/api/commands")
public class CommandResource {

	private final Logger log = LoggerFactory.getLogger(CommandResource.class);

	 private static final String CUSTOMER_ENTITY = "elasticutilitiesCustomer";
	 private static final String Store_ENTITY = "elasticutilitiesStore";
	private final CustomerService customerService;
	private final StoreService storeService;
	public CommandResource(CustomerService customerService, StoreService storeService
		/*	AddressLineService addressLineService*/) {
		
		this.customerService = customerService;
		this.storeService = storeService;
	}
	 /**
     * POST  /customers : Create a new customer.
     *
     * @param customer the customer to create
     * @return the ResponseEntity with status 201 (Created) and with body the new customer, or with status 400 (Bad Request) if the customer has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/customers")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) throws URISyntaxException {
        log.debug("REST request to save Customer : {}", customer);
        if (customer.getId() != null) {
            throw new BadRequestAlertException("A new customer cannot already have an ID", CUSTOMER_ENTITY, "idexists");
        }
        Customer result = customerService.save(customer);
        return ResponseEntity.created(new URI("/api/customers/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(CUSTOMER_ENTITY, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /customers : Updates an existing customer.
     *
     * @param customer the customer to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated customer,
     * or with status 400 (Bad Request) if the customer is not valid,
     * or with status 500 (Internal Server Error) if the customer couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/customers")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) throws URISyntaxException {
        log.debug("REST request to update Customer : {}", customer);
        if (customer.getId() == null) {
            throw new BadRequestAlertException("Invalid id", CUSTOMER_ENTITY, "idnull");
        }
        Customer result = customerService.save(customer);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(CUSTOMER_ENTITY, customer.getId().toString()))
            .body(result);
    }

    /**
     * DELETE  /customers/:id : delete the "id" customer.
     *
     * @param id the id of the customer to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/customers/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
        log.debug("REST request to delete Customer : {}", id);
        customerService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(CUSTOMER_ENTITY, id.toString())).build();
    }

    
    /**
     * POST  /stores : Create a new store.
     *
     * @param Store the Store to create
     * @return the ResponseEntity with status 201 (Created) and with body the new Store, or with status 400 (Bad Request) if the store has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/stores")
    public ResponseEntity<Store> createStore(@RequestBody Store Store) throws URISyntaxException {
        log.debug("REST request to save Store : {}", Store);
        if (Store.getId() != null) {
            throw new BadRequestAlertException("A new store cannot already have an ID", Store_ENTITY, "idexists");
        }
        Store result = storeService.save(Store);
        return ResponseEntity.created(new URI("/api/stores/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(Store_ENTITY, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /stores : Updates an existing store.
     *
     * @param Store the Store to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated Store,
     * or with status 400 (Bad Request) if the Store is not valid,
     * or with status 500 (Internal Server Error) if the Store couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/stores")
    public ResponseEntity<Store> updateStore(@RequestBody Store Store) throws URISyntaxException {
        log.debug("REST request to update Store : {}", Store);
        if (Store.getId() == null) {
            throw new BadRequestAlertException("Invalid id", Store_ENTITY, "idnull");
        }
        Store result = storeService.save(Store);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(Store_ENTITY, Store.getId().toString()))
            .body(result);
    }

    /**
     * GET  /stores : get all the stores.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of stores in body
     */
    @GetMapping("/stores")
    public ResponseEntity<List<Store>> getAllStores(Pageable pageable) {
        log.debug("REST request to get a page of Stores");
        Page<Store> page = storeService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/stores");
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * GET  /stores/:id : get the "id" store.
     *
     * @param id the id of the Store to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the Store, or with status 404 (Not Found)
     */
    @GetMapping("/stores/{id}")
    public ResponseEntity<Store> getStore(@PathVariable Long id) {
        log.debug("REST request to get Store : {}", id);
        Optional<Store> Store = storeService.findOne(id);
        return ResponseUtil.wrapOrNotFound(Store);
    }

    /**
     * DELETE  /stores/:id : delete the "id" store.
     *
     * @param id the id of the Store to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/stores/{id}")
    public ResponseEntity<Void> deleteStore(@PathVariable Long id) {
        log.debug("REST request to delete Store : {}", id);
        storeService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(Store_ENTITY, id.toString())).build();
    }
   
	
}

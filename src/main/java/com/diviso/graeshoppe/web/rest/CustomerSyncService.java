package com.diviso.graeshoppe.web.rest;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import org.apache.kafka.streams.kstream.KStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import com.diviso.graeshoppe.avro.Customer;
import com.diviso.graeshoppe.config.MessageBinderConfiguration;

import com.diviso.graeshoppe.service.CustomerService;
import com.diviso.graeshoppe.service.mapper.CustomerMapper;
import com.diviso.graeshoppe.web.rest.errors.BadRequestAlertException;

/*import com.diviso.graeshoppe.order.avro.Order;
import com.diviso.graeshoppe.payment.avro.Payment;

import com.diviso.graeshoppe.report.service.OrderMasterService;
import com.diviso.graeshoppe.report.service.dto.OrderMasterDTO;*/

@EnableBinding(MessageBinderConfiguration.class)
public class CustomerSyncService {

	private final Logger log = LoggerFactory.getLogger(CustomerSyncService.class);
	 private static final String CUSTOMER_ENTITY = "elasticutilitiesCustomer";

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	CustomerMapper customerMapper;

	@StreamListener(MessageBinderConfiguration.CUSTOMER)
	public void listenToCustomer(KStream<String, Customer> message) {
		message.foreach((key,value)->{
			System.out.println("consumed values is "+value);
		});
		
		message.foreach((key,customer)->{
			
		
			
			if(customer.getStatus().equalsIgnoreCase("create")) {
				createCustomer( customer) ;
				
			} else if (customer.getStatus().equalsIgnoreCase("update")) {
				
				
				
			} else if(customer.getStatus().equalsIgnoreCase("delete")) {
				
				
				
			}
		});
	}
	public void createCustomer( Customer customer) {

		log.debug("REST request to save Customer : {}", customer);

		if (customer.getId() != null) {
			throw new BadRequestAlertException("A new customer cannot already have an ID", CUSTOMER_ENTITY , "idexists");
		}
	//	com.diviso.graeshoppe.domain.Customer c=	customerMapper.toEntity(customer);
		
		System.out.println("**************@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	// customerService.create(customer);
		
	}


	

}

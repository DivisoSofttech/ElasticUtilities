package com.diviso.graeshoppe.web.rest;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import org.apache.kafka.streams.kstream.KStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import com.diviso.graeshoppe.domain.Contact;
import com.diviso.graeshoppe.domain.Customer;
/*import com.diviso.graeshoppe.avro.ContactInfo;
import com.diviso.graeshoppe.avro.CustomerInfo;*/
import com.diviso.graeshoppe.config.MessageBinderConfiguration;

import com.diviso.graeshoppe.service.CustomerService;
import com.diviso.graeshoppe.service.mapper.ContactInfoMapper;
import com.diviso.graeshoppe.service.mapper.CustomerMapper;
import com.diviso.graeshoppe.web.rest.errors.BadRequestAlertException;



//@EnableBinding(MessageBinderConfiguration.class)
public class CustomerSyncService {

	/*private final Logger log = LoggerFactory.getLogger(CustomerSyncService.class);
	 private static final String CUSTOMER_ENTITY = "elasticutilitiesCustomer";

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	CustomerMapper customerMapper;
	@Autowired
	ContactInfoMapper contactInfoMapper;

	@StreamListener(MessageBinderConfiguration.CUSTOMER)
	public void listenToCustomer(KStream<String, CustomerInfo> message) {
		message.foreach((key,value)->{
			System.out.println("consumed key is "+key+"consumed values is "+value);
		});
		
		
		
	message.foreach((key,customer)->{
			
		
			
			if(customer.getStatus().equalsIgnoreCase("create")) {
				System.out.println("customer.getStatus().equalsIgnoreCase(\"create\")##############");
				//createCustomer( customer) ;
				
			} else if (customer.getStatus().equalsIgnoreCase("update")) {
				
				
				
			} else if(customer.getStatus().equalsIgnoreCase("delete")) {
				
			}
			
			
		});
	}
	@StreamListener(MessageBinderConfiguration.CONTACT)
	public void listenToContact(KStream<String, ContactInfo> contactMessage) {
		contactMessage.foreach((key,contact)->{
		if(contact.getStatus().equalsIgnoreCase("create")) {
			Contact c=contactInfoMapper.toEntity(contact);
			System.out.println("consumed mapperrrr>>>>>>>>>>>>>>>>>> "+c);
		}
		
		});
		
	}
	
	
	
	
	
	
	public void createCustomer( CustomerInfo customerInfo) {

		log.debug("REST request to save Customer : {}", customerInfo);

		if (customerInfo.getId() == null) {
			throw new BadRequestAlertException("A new customer ID", CUSTOMER_ENTITY , "idnull");
		}
	
		Customer customer=customerMapper.toEntity(customerInfo);
		customerService.create(customer);
	
		
	}
	public void createContact(ContactInfo contactInfo) {
		Customer cont=customerMapper.toEntity(contactInfo);
		customerService.create(customer);
		System.out.println("**************@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+contactInfo);
	}


*/
	

}

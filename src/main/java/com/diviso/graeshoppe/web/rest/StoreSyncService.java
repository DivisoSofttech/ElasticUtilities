package com.diviso.graeshoppe.web.rest;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRules;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import org.apache.kafka.streams.kstream.KStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import com.diviso.graeshoppe.domain.Contact;
//import com.diviso.graeshoppe.domain.Store;

//import com.diviso.graeshoppe.avro.StoreInfo;
import com.diviso.graeshoppe.config.MessageBinderConfiguration;

import com.diviso.graeshoppe.service.StoreService;
import com.diviso.graeshoppe.service.mapper.ContactInfoMapper;
import com.diviso.graeshoppe.store.avro.StoreInfo;
import com.diviso.graeshoppe.service.mapper.StoreAvroMapper;
import com.diviso.graeshoppe.web.rest.errors.BadRequestAlertException;


@EnableBinding(MessageBinderConfiguration.class)
public class StoreSyncService {
	@Autowired
	StoreService storeService ;
    @Autowired
	StoreAvroMapper storeAvroMapper;

	@StreamListener(MessageBinderConfiguration.STORE)
public void listenToStore(KStream<String,StoreInfo> message) {
		message.foreach((key,value)->{
			System.out.println("consumed key is "+key+"consumed values is "+value);
		});
		
	message.foreach((key,storeValue)->{
			
		
			
			if(storeValue.getStatus().equalsIgnoreCase("create")) {
				//System.out.println("customer.getStatus().equalsIgnoreCase(\"create\")##############");
				createStore(storeValue) ;
				
			} else if (storeValue.getStatus().equalsIgnoreCase("update")) {
				
				
				
			} else if(storeValue.getStatus().equalsIgnoreCase("delete")) {
				
			}
			
			
		});

	
	}
	/*}
	@StreamListener(MessageBinderConfiguration.CONTACT)
	public void listenToContact(KStream<String, ContactInfo> contactMessage) {
		contactMessage.foreach((key,contact)->{
		if(contact.getStatus().equalsIgnoreCase("create")) {
			Contact c=contactInfoMapper.toEntity(contact);
			System.out.println("consumed mapperrrr>>>>>>>>>>>>>>>>>> "+c);
		}
		
		});*/
		

	public void createStore(StoreInfo store) {

		/*log.debug("REST request to save Customer : {}", customerInfo);

		if (customerInfo.getId() == null) {
			throw new BadRequestAlertException("A new customer ID", CUSTOMER_ENTITY , "idnull");
		}*/
	
	 com.diviso.graeshoppe.domain.Store	storeEntity=storeAvroMapper.toEntity(store);
	 System.out.println("consumed mapperrrr>>>>>>>>>>>>>>>>>> "+storeEntity);
		storeService.save(storeEntity);
	
		
	}
	
	
	
	
	

}

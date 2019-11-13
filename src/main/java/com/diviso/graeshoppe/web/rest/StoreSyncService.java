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
import com.diviso.graeshoppe.domain.Store;
//import com.diviso.graeshoppe.avro.ContactInfo;
//import com.diviso.graeshoppe.avro.StoreInfo;
import com.diviso.graeshoppe.config.MessageBinderConfiguration;

import com.diviso.graeshoppe.service.StoreService;
import com.diviso.graeshoppe.service.mapper.ContactInfoMapper;
//import com.diviso.graeshoppe.service.mapper.StoreMapper;
import com.diviso.graeshoppe.web.rest.errors.BadRequestAlertException;



//@EnableBinding(MessageBinderConfiguration.class)
public class StoreSyncService {

	/*private final Logger log = LoggerFactory.getLogger(StoreSyncService.class);
	 private static final String Store_ENTITY = "utilitiesStore";

	@Autowired
	private StoreService storeService;
	
	@Autowired
	StoreMapper storeMapper;
	@Autowired
	ContactInfoMapper contactInfoMapper;

	@StreamListener(MessageBinderConfiguration.CUSTOMER)
	public void listenToStore(KStream<String, Store> message) {
		message.foreach((key,value)->{
			System.out.println("consumed key is "+key+"consumed values is "+value);
		});
		
		
		
	message.foreach((key,store)->{
			
		
			
			if(store.getStatus().equalsIgnoreCase("create")) {
				System.out.println("store.getStatus().equalsIgnoreCase(\"create\")##############");
				//createStore( store) ;
				
			} else if (store.getStatus().equalsIgnoreCase("update")) {
				
				
				
			} else if(store.getStatus().equalsIgnoreCase("delete")) {
				
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
	
	
	
	
	
	
	public void createStore( StoreInfo storeInfo) {

		log.debug("REST request to save Store : {}", storeInfo);

		if (storeInfo.getId() == null) {
			throw new BadRequestAlertException("A new store ID", CUSTOMER_ENTITY , "idnull");
		}
	//	com.diviso.graeshoppe.domain.Store c=	storeMapper.toEntity(store);
		
		
		//System.out.println("**************@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+storeInfo);
	 
		Store store=storeMapper.toEntity(storeInfo);
		storeService.create(store);
		store.foreach((key,value)->{
			System.out.println("consumed key is "+key+"consumed values is "+value);
		});
		
		
	}
	public void createContact(StoreInfo storeInfo) {
		Store store=storeMapper.toEntity(storeInfo);
		storeService.create(store);
		System.out.println("**************@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+storeInfo);
	}


*/
	

}

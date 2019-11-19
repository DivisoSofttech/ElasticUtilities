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


//import com.diviso.graeshoppe.avro.StoreInfo;
import com.diviso.graeshoppe.config.MessageBinderConfiguration;

import com.diviso.graeshoppe.service.StoreService;
import com.diviso.graeshoppe.service.mapper.ContactInfoMapper;
import com.diviso.graeshoppe.store.avro.Store;
import com.diviso.graeshoppe.store.avro.StoreAddress;
import com.diviso.graeshoppe.service.mapper.StoreAddressAvroMapper;
import com.diviso.graeshoppe.web.rest.errors.BadRequestAlertException;


@EnableBinding(MessageBinderConfiguration.class)
public class StoreAddressSyncService {
	@Autowired 
	StoreService storeService ;
    @Autowired
	StoreAddressAvroMapper storeAddressAvroMapper;

	@StreamListener(MessageBinderConfiguration.STORE_ADDRESS)
public void listenToStoreAddress(KStream<String,StoreAddress> storeAddressMessage) {
		storeAddressMessage.foreach((key,value)->{
			System.out.println("consumed key is "+key+"consumed values is "+value);
		});
		
	//	storeAddressMessage.foreach((key,storeAddressValue)->{
			
		
			
			/*if(storeAddressValue.getStatus().equalsIgnoreCase("create")) {
				
				createStoreAddress(storeAddressValue) ;
				
			} else if (storeAddressValue.getStatus().equalsIgnoreCase("update")) {
				
				
				
			} else if(storeAddressValue.getStatus().equalsIgnoreCase("delete")) {
				
			}
			
			
		});

	*/
	}
	
	
		

	public void createStoreAddress(StoreAddress storeAddress) {

		/*log.debug("REST request to save Customer : {}", customerInfo);

		if (customerInfo.getId() == null) {
			throw new BadRequestAlertException("A new customer ID", CUSTOMER_ENTITY , "idnull");
		}*/
	
	 com.diviso.graeshoppe.domain.StoreAddress	storeAddressEntity=storeAddressAvroMapper.toEntity(storeAddress);
	 System.out.println("consumed mapperrrr>>>>>>>>>>>>>>>>>> "+storeAddressEntity);
	 com.diviso.graeshoppe.domain.Store  s= new com.diviso.graeshoppe.domain.Store();
	 s.setStoreAddress(storeAddressEntity);
		storeService.save(s);
	
		
	}
	
	
	
	

}

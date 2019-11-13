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
import com.diviso.graeshoppe.avro.CustomerInfo;
//import com.diviso.graeshoppe.avro.StoreInfo;
import com.diviso.graeshoppe.config.MessageBinderConfiguration;

import com.diviso.graeshoppe.service.StoreService;
import com.diviso.graeshoppe.service.mapper.ContactInfoMapper;
//import com.diviso.graeshoppe.service.mapper.StoreMapper;
import com.diviso.graeshoppe.web.rest.errors.BadRequestAlertException;



@EnableBinding(MessageBinderConfiguration.class)
public class TestSyncService {

	

	@StreamListener(MessageBinderConfiguration.CUSTOMER)
	public void listenToStore(KStream<String, CustomerInfo> message) {
		message.foreach((key,value)->{
			System.out.println("consumed key is "+key+"consumed values is "+value);
		});
		
		
		
	
	/*}
	@StreamListener(MessageBinderConfiguration.CONTACT)
	public void listenToContact(KStream<String, ContactInfo> contactMessage) {
		contactMessage.foreach((key,contact)->{
		if(contact.getStatus().equalsIgnoreCase("create")) {
			Contact c=contactInfoMapper.toEntity(contact);
			System.out.println("consumed mapperrrr>>>>>>>>>>>>>>>>>> "+c);
		}
		
		});*/
		
	}
	
	
	
	
	
	
	
	

}

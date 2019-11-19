package com.diviso.graeshoppe.config;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.Input;

//import com.diviso.graeshoppe.avro.CustomerInfo;
import com.diviso.graeshoppe.store.avro.Store;
import com.diviso.graeshoppe.store.avro.StoreAddress;
//import com.diviso.graeshoppe.avro.ContactInfo;

public interface MessageBinderConfiguration {

	String CUSTOMER="customer";
	
	String CONTACT ="contact";
	
	String STORE ="store"; 
	
	String STORE_ADDRESS="storeAddress";
	
	/*@Input(CUSTOMER)
	KStream<String, CustomerInfo> customer();
	
	@Input(CONTACT)
	KStream<String, ContactInfo> contact();
	*/
	@Input(STORE)
	KStream<String,Store> store();
	@Input(STORE_ADDRESS)
	KStream<String,StoreAddress> storeAddressIn();
}

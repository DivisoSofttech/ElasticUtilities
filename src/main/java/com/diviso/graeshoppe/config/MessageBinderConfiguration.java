package com.diviso.graeshoppe.config;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.Input;

import com.diviso.graeshoppe.avro.CustomerInfo;


import com.diviso.graeshoppe.avro.ContactInfo;

public interface MessageBinderConfiguration {

	String CUSTOMER="customer";
	
	String CONTACT ="contact";
	
	@Input(CUSTOMER)
	KStream<String, CustomerInfo> customer();
	
	@Input(CONTACT)
	KStream<String, ContactInfo> contact();
	
}

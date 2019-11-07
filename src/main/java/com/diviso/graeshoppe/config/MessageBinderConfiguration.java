package com.diviso.graeshoppe.config;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.Input;

import com.diviso.graeshoppe.avro.Customer;


//import com.diviso.graeshoppe.customer.avro.Customer;

public interface MessageBinderConfiguration {

	String CUSTOMER="customer";
	
	//String ORDER ="order";
	
	@Input(CUSTOMER)
	KStream<String, Customer> customer();
	
}

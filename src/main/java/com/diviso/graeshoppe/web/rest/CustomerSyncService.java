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

/*import com.diviso.graeshoppe.order.avro.Order;
import com.diviso.graeshoppe.payment.avro.Payment;

import com.diviso.graeshoppe.report.service.OrderMasterService;
import com.diviso.graeshoppe.report.service.dto.OrderMasterDTO;*/

@EnableBinding(MessageBinderConfiguration.class)
public class CustomerSyncService {

	private final Logger LOG = LoggerFactory.getLogger(CustomerSyncService.class);

	@Autowired
	private CustomerService customerService;

	@StreamListener(MessageBinderConfiguration.CUSTOMER)
	public void listenToCustomer(KStream<String, Customer> message) {
		message.foreach((key,value)->{
			System.out.println("consumed values is "+value);
		});
		
		/*message.foreach((key,customer)->{
			if(customer.getStatus().equalsIgnoreCase("create")) {
				
				
			} else if (customer.getStatus().equalsIgnoreCase("update")) {
				
				
				
			} else if(customer.getStatus().equalsIgnoreCase("delete")) {
				
				
				
			}
		});*/
	}

	

}
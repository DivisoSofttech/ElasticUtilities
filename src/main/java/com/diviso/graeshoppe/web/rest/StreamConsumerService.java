package com.diviso.graeshoppe.web.rest;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import org.apache.kafka.streams.kstream.KStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import com.diviso.graeshoppe.config.MessageBinderConfiguration;
import com.diviso.graeshoppe.domain.Customer;
import com.diviso.graeshoppe.service.CustomerService;

/*import com.diviso.graeshoppe.order.avro.Order;
import com.diviso.graeshoppe.payment.avro.Payment;

import com.diviso.graeshoppe.report.service.OrderMasterService;
import com.diviso.graeshoppe.report.service.dto.OrderMasterDTO;*/

@EnableBinding(MessageBinderConfiguration.class)
public class StreamConsumerService {

	private final Logger LOG = LoggerFactory.getLogger(StreamConsumerService.class);

	@Autowired
	private CustomerService customerService;

	/*@SuppressWarnings("static-access")
	@StreamListener(MessageBinderConfiguration.CUSTOMER)
	public void listenToPayment(KStream<String, Customer> message) {
		message.foreach((key, value) -> {
			System.out.println("payment Value consumed is " + value);
			Optional<OrderMasterDTO> orderMaster = orderMasterService.findByOrderNumber(value.getTargetId());

			if (orderMaster.isPresent()) {
				OrderMasterDTO orderMasterDTO = orderMaster.get();
				if (!value.getPaymentType().equals("cod")) {
					LOG.info("Order paid");
					orderMasterDTO.setOrderStatus("ORDER PAID");
				} else {
					LOG.info("Order Not paid");
					orderMasterDTO.setOrderStatus("ORDER NOT PAID");
				}
				orderMasterService.save(orderMasterDTO);
			} else {

				CompletableFuture<String> completableFuture = new CompletableFuture<>();
				completableFuture.runAsync(() -> {
					System.out.println("Inside RunAsync+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					boolean executeFlag = true;
					int count = 0;
					while (executeFlag) {
						System.out.println("Inside Loop " + count);
						try {
							Thread.sleep(2000l);
							System.out.println("Thread is went to sleep" + Thread.currentThread().getName());
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						Optional<OrderMasterDTO> dto = orderMasterService.findByOrderNumber(value.getTargetId());
						if (dto.isPresent()) {
							System.out.println("Inside If check ++++++++++++++++++++++++++++++++++");
							OrderMasterDTO orderMasterDTO = dto.get();
							if (!value.getPaymentType().equals("cod")) {
								LOG.info("Order paid");
								orderMasterDTO.setOrderStatus("ORDER PAID");
							} else {
								LOG.info("Order Not paid");
								orderMasterDTO.setOrderStatus("ORDER NOT PAID");
							}
							orderMasterService.save(orderMasterDTO);
							executeFlag = false;
							completableFuture.complete("Completed");
						}
						count++;
					}

				});
*/
				/*
				 * try { Thread.sleep(10000l); OrderMasterDTO orderMasterDTO =
				 * orderMaster.get(); if (!value.getPaymentType().equals("cod")) {
				 * LOG.info("Order paid"); orderMasterDTO.setOrderStatus("ORDER PAID"); } else {
				 * LOG.info("Order Not paid"); orderMasterDTO.setOrderStatus("ORDER NOT PAID");
				 * } orderMasterService.save(orderMasterDTO); } catch (InterruptedException e) {
				 * e.printStackTrace(); }
				 */
		/*	}

		});
	}*/
/*
	@StreamListener(MessageBinderConfiguration.ORDER)
	public void listenToOrder(KStream<String, Order> message) {
		message.foreach((key, value) -> {
			System.out.println("order Value consumed is " + value);
			orderMasterService.convertAndSaveOrderMaster(value);
		});
	}*/

}

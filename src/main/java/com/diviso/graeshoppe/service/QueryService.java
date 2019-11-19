package com.diviso.graeshoppe.service;

import com.diviso.graeshoppe.domain.StoreAddress;

public interface QueryService {

	StoreAddress findStoreAddressById(Long contactId);
	
}

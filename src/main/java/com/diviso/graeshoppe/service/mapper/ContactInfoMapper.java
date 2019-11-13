package com.diviso.graeshoppe.service.mapper;

import com.diviso.graeshoppe.domain.*;


import org.mapstruct.*;

/**
 * Mapper for the entity Customer and its Avro CustomerAvro.
 */
@Mapper(componentModel = "spring",uses = {})
public interface ContactInfoMapper extends EntityMapper<com.diviso.graeshoppe.avro.ContactInfo, Contact> {

    

   
	 default Contact fromId(Long id) {
	        if (id == null) {
	            return null;
	        }
	        Contact contact = new Contact();
	        contact.setId(id);
	        return contact;
	    }
}
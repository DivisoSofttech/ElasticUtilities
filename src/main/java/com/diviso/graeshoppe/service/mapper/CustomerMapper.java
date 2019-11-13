package com.diviso.graeshoppe.service.mapper;

import com.diviso.graeshoppe.domain.*;


import org.mapstruct.*;

/**
 * Mapper for the entity Customer and its Avro CustomerAvro.
 */
@Mapper(componentModel = "spring",uses = {ContactInfoMapper.class})
public interface CustomerMapper extends EntityMapper<com.diviso.graeshoppe.avro.CustomerInfo, Customer> {

    

   // @Mapping(source = "id", target = "customerId")
  /*  @Mapping(target = "addresses", ignore = true)
    @Mapping(target = "notes", ignore = true)
    @Mapping(target = "favouritestores", ignore = true)
    @Mapping(target = "favouriteproducts", ignore = true)*/
	@Mapping(source = "id", target = "customerId")
	
    Customer toEntity(com.diviso.graeshoppe.avro.CustomerInfo customer);

    default Customer fromId(Long id) {
        if (id == null) {
            return null;
        }
        Customer customer = new Customer();
        customer.setId(id);
        return customer;
    }
}
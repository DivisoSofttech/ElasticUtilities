package com.diviso.graeshoppe.service.mapper;

import com.diviso.graeshoppe.domain.*;
import com.diviso.graeshoppe.repository.search.StoreSearchRepository;
import com.diviso.graeshoppe.service.QueryService;

import org.mapstruct.*;
import javax.inject.Inject;
/**
 * Mapper for the entity StoreAddress and its DTO StoreAddressDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public abstract class StoreAddressAvroMapper {

	@Inject	
	 QueryService queryService;

	 public abstract   StoreAddress toEntity(com.diviso.graeshoppe.store.avro.StoreAddress storeAddress);
    public StoreAddress fromId(Long id) {
        if (id == null) {
            return null;
        }
        return queryService.findStoreAddressById(id);
    }
}

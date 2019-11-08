package com.diviso.graeshoppe.web.rest.vm;

import com.diviso.graeshoppe.domain.*;


import org.mapstruct.*;

/**
 * Mapper for the entity OrderMaster and its DTO OrderMasterDTO.
 */
@Mapper(componentModel = "spring")
public interface SimpleSourceDestinationMapper  {

	SimpleDestination sourceToDestination(SimpleSource source);
    SimpleSource destinationToSource(SimpleDestination destination);
   
}

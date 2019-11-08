package com.diviso.graeshoppe.web.rest.vm;


import org.mapstruct.*;

/**
 * Mapper for the entity OrderMaster and its DTO OrderMasterDTO.
 */
//@Mapper(componentModel = "spring", uses = {})
public interface OrderMasterMapper /*extends EntityMapper<OrderMasterDTO, OrderMaster>*/ {
	

   /* @Mapping(target = "orderLines", ignore = true)
    OrderMaster toEntity(OrderMasterDTO orderMasterDTO);

    default OrderMaster fromId(Long id) {
        if (id == null) {
            return null;
        }
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setId(id);
        return orderMaster;
    }*/
}

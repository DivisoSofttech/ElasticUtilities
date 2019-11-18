package com.diviso.graeshoppe.service.mapper;

import com.diviso.graeshoppe.domain.*;


import java.nio.ByteBuffer;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.mapstruct.*;

/**
 * Mapper for the entity Store and its DTO StoreDTO.
 */
@Mapper(componentModel = "spring"/*, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS*//*, uses = {PropreitorMapper.class, StoreAddressMapper.class, StoreSettingsMapper.class, PreOrderSettingsMapper.class}*/)
public interface StoreAvroMapper extends AvroMapper<com.diviso.graeshoppe.store.avro.Store, Store> {
/*
    @Mapping(source = "propreitor.id", target = "propreitorId")
    @Mapping(source = "storeAddress.id", target = "storeAddressId")
    @Mapping(source = "storeSettings.id", target = "storeSettingsId")
    @Mapping(source = "preOrderSettings.id", target = "preOrderSettingsId")
    StoreDTO toAvro(Store store);

    @Mapping(source = "propreitorId", target = "propreitor")
    @Mapping(source = "storeAddressId", target = "storeAddress")
    @Mapping(source = "storeSettingsId", target = "storeSettings")
    @Mapping(source = "preOrderSettingsId", target = "preOrderSettings")
    @Mapping(target = "storeTypes", ignore = true)
    @Mapping(target = "reviews", ignore = true)
    @Mapping(target = "userRatings", ignore = true)
    @Mapping(target = "banners", ignore = true)
    @Mapping(target = "storeDeliveryInfos", ignore = true)
    Store toEntity(StoreDTO storeDTO);*/

	//@Mapping(source = "image", target = "image", qualifiedByName = "byteArrayToByteBuffer",ignore=true)
	//@Mapping(source = "openingTime", target = "openingTime", qualifiedByName = "zonedDateTimeToLong",ignore=true)
	//@Mapping(source = "closingTime", target = "closingTime", qualifiedByName = "zonedDateTimeToLong",ignore=true)
	//@Mapping(source = "maxDeliveryTime", target = "maxDeliveryTime", qualifiedByName = "zonedDateTimeToLong",ignore=true)
	
	//@Mapping(source = "image", ignore=true)
	 @Mapping(target = "openingTime", source = ".", qualifiedByName="zonedOpeningTime",ignore=true)
	 @Mapping(target = "closingTime", source = ".", qualifiedByName="zonedClosingTime",ignore=true)
	 @Mapping(target = "maxDeliveryTime", source = ".", qualifiedByName="zonedMaxDeliveryTime",ignore=true)
	Store toEntity(com.diviso.graeshoppe.store.avro.Store store);
	
	
	
    default Store fromId(Long id) {
        if (id == null) {
            return null;
        }
        Store store = new Store();
        store.setId(id);
        return store;
    }
    

    @Named("zonedOpeningTime") 
    public static ZonedDateTime longTzonedOpeningTime(com.diviso.graeshoppe.store.avro.Store store) { 
     
   ZoneId zone =   ZoneId.of(store.getZoneId());
      Instant instant = Instant.ofEpochMilli(store.getOpeningTime()); 
      ZonedDateTime openingTime=  ZonedDateTime.ofInstant(instant,zone);
    	return  openingTime;
    }
    @Named("zonedClosingTime") 
    public static ZonedDateTime longTozonedClosingTime(com.diviso.graeshoppe.store.avro.Store store) { 
  
   ZoneId zone =   ZoneId.of(store.getZoneId());
      Instant instant = Instant.ofEpochMilli(store.getClosingTime()); 
      ZonedDateTime closingTime=  ZonedDateTime.ofInstant(instant,zone);
    	return  closingTime;
    }
    @Named("zonedMaxDeliveryTime") 
    public static ZonedDateTime longToZonedMaxDeliveryTime(com.diviso.graeshoppe.store.avro.Store store) { 
    
   ZoneId zone =   ZoneId.of(store.getZoneId());
      Instant instant = Instant.ofEpochMilli(store.getMaxDeliveryTime());
      ZonedDateTime maxDeliveryTime=  ZonedDateTime.ofInstant(instant,zone);
    	return  maxDeliveryTime;
    }
    
    
}

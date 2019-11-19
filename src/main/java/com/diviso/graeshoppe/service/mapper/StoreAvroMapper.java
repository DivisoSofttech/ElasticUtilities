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
@Mapper(componentModel = "spring",uses = {StoreAddressAvroMapper.class})
public interface StoreAvroMapper extends AvroMapper<com.diviso.graeshoppe.store.avro.StoreInfo, Store> {

	@Mapping(target = "openingTime", source = ".", qualifiedByName = "zonedOpeningTime")
	@Mapping(source = ".", target = "closingTime", qualifiedByName = "zonedClosingTime")
	@Mapping(target = "maxDeliveryTime", source = ".", qualifiedByName = "zonedMaxDeliveryTime")
	Store toEntity(com.diviso.graeshoppe.store.avro.StoreInfo store);

	default Store fromId(Long id) {
		if (id == null) {
			return null;
		}
		Store store = new Store();
		store.setId(id);
		return store;
	}

	@Named("zonedOpeningTime")
	public static ZonedDateTime longToZonedOpeningTime(com.diviso.graeshoppe.store.avro.StoreInfo store) {

		ZoneId zone = ZoneId.of(store.getZoneId());
		Instant instant = Instant.ofEpochMilli(store.getOpeningTime());
		ZonedDateTime openingTime = ZonedDateTime.ofInstant(instant, zone);
		return openingTime;
	}

	@Named("zonedClosingTime")
	public static ZonedDateTime longToZonedClosingTime(com.diviso.graeshoppe.store.avro.StoreInfo store) {

		ZoneId zone = ZoneId.of(store.getZoneId());
		Instant instant = Instant.ofEpochMilli(store.getClosingTime());
		ZonedDateTime closingTime = ZonedDateTime.ofInstant(instant, zone);
		return closingTime;
	}

	@Named("zonedMaxDeliveryTime")
	public static ZonedDateTime longToZonedMaxDeliveryTime(com.diviso.graeshoppe.store.avro.StoreInfo store) {

		ZoneId zone = ZoneId.of(store.getZoneId());
		Instant instant = Instant.ofEpochMilli(store.getMaxDeliveryTime());
		ZonedDateTime maxDeliveryTime = ZonedDateTime.ofInstant(instant, zone);
		return maxDeliveryTime;
	}

}

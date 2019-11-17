package com.diviso.graeshoppe.service.mapper;

import java.util.List;

/**
 * Contract for a generic avro to entity mapper.
 *
 * @param <A> - Avro type parameter.
 * @param <E> - Entity type parameter.
 */

public interface AvroMapper <A, E> {

   
    
   E toEntity(A avro);

    
}

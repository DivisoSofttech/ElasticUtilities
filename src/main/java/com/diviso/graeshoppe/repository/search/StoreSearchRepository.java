package com.diviso.graeshoppe.repository.search;

import com.diviso.graeshoppe.domain.StoreAddress;
import com.diviso.graeshoppe.domain.Store;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.query.Param;

/**
 * Spring Data Elasticsearch repository for the Stores entity.
 */
public interface StoreSearchRepository extends ElasticsearchRepository<Store,Long> {
	 
	
}

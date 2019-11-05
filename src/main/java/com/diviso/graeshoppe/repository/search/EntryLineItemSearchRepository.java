package com.diviso.graeshoppe.repository.search;

import com.diviso.graeshoppe.domain.EntryLineItem ;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the EntryLineItem  entity.
 */
public interface EntryLineItemSearchRepository extends ElasticsearchRepository<EntryLineItem ,Long> {
}

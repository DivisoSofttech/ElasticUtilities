package com.diviso.graeshoppe.repository.search;

import com.diviso.graeshoppe.domain.PackageProduct;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the PackageProduct entity.
 */
public interface PackageProductSearchRepository extends ElasticsearchRepository<PackageProduct, Long> {
}

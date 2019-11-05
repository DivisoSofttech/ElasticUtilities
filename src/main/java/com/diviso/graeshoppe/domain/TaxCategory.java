package com.diviso.graeshoppe.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A TaxCategory.
 */

@Document(indexName = "taxcategory")
public class TaxCategory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id

	private Long id;

	private String iDPcode;

	private String name;

	private String description;

	private Set<Tax> taxes = new HashSet<>();

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getiDPcode() {
		return iDPcode;
	}

	public TaxCategory iDPcode(String iDPcode) {
		this.iDPcode = iDPcode;
		return this;
	}

	public void setiDPcode(String iDPcode) {
		this.iDPcode = iDPcode;
	}

	public String getName() {
		return name;
	}

	public TaxCategory name(String name) {
		this.name = name;
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public TaxCategory description(String description) {
		this.description = description;
		return this;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	// jhipster-needle-entity-add-getters-setters - JHipster will add getters and
	// setters here, do not remove

	public Set<Tax> getTax() {
		return taxes;
	}

	public void setTax(Set<Tax> taxes) {
		this.taxes = taxes;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TaxCategory taxCategory = (TaxCategory) o;
		if (taxCategory.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), taxCategory.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "TaxCategory [id=" + id + ", iDPcode=" + iDPcode + ", name=" + name + ", description=" + description
				+ ", taxes=" + taxes + "]";
	}

}

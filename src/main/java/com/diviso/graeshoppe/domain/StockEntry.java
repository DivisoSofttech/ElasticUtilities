package com.diviso.graeshoppe.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A StockEntry.
 */

public class StockEntry {

	private Long id;

	private String reasonName;

	private String reasonDescription;

	private String locationName;

	private String latLon;

	private String idpCode;

	private String reference;

	private LocalDate date;

	private String description;

	private Set<EntryLineItem> entryLineItems = new HashSet<>();

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReasonName() {
		return reasonName;
	}

	public StockEntry reasonName(String reasonName) {
		this.reasonName = reasonName;
		return this;
	}

	public void setReasonName(String reasonName) {
		this.reasonName = reasonName;
	}

	public String getReasonDescription() {
		return reasonDescription;
	}

	public StockEntry reasonDescription(String reasonDescription) {
		this.reasonDescription = reasonDescription;
		return this;
	}

	public void setReasonDescription(String reasonDescription) {
		this.reasonDescription = reasonDescription;
	}

	public String getLocationName() {
		return locationName;
	}

	public StockEntry locationName(String locationName) {
		this.locationName = locationName;
		return this;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLatLon() {
		return latLon;
	}

	public StockEntry latLon(String latLon) {
		this.latLon = latLon;
		return this;
	}

	public void setLatLon(String latLon) {
		this.latLon = latLon;
	}

	public String getIdpCode() {
		return idpCode;
	}

	public StockEntry idpCode(String idpCode) {
		this.idpCode = idpCode;
		return this;
	}

	public void setIdpCode(String idpCode) {
		this.idpCode = idpCode;
	}

	public String getReference() {
		return reference;
	}

	public StockEntry reference(String reference) {
		this.reference = reference;
		return this;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public LocalDate getDate() {
		return date;
	}

	public StockEntry date(LocalDate date) {
		this.date = date;
		return this;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public StockEntry description(String description) {
		this.description = description;
		return this;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	// jhipster-needle-entity-add-getters-setters - JHipster will add getters and
	// setters here, do not remove

	public Set<EntryLineItem> getTax() {
		return entryLineItems;
	}

	public void setTax(Set<EntryLineItem> entryLineItems) {
		this.entryLineItems = entryLineItems;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		StockEntry stockEntry = (StockEntry) o;
		if (stockEntry.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), stockEntry.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "StockEntry [id=" + id + ", reasonName=" + reasonName + ", reasonDescription=" + reasonDescription
				+ ", locationName=" + locationName + ", latLon=" + latLon + ", idpCode=" + idpCode + ", reference="
				+ reference + ", date=" + date + ", description=" + description + ", entryLineItems=" + entryLineItems
				+ "]";
	}

}

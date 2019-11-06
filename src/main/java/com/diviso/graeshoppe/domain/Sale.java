package com.diviso.graeshoppe.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A Sale.
 */

@Document(indexName = "sale")
public class Sale {

	private static final long serialVersionUID = 1L;

	@Id

	private Long id;

	private String userId;

	private Long customerId;

	private Instant date;

	private Double grandTotal;

	private Set<TicketLine> ticketLines = new HashSet<>();

	public Set<TicketLine> getTicketLines() {
		return ticketLines;
	}

	public void setTicketLines(Set<TicketLine> ticketLines) {
		this.ticketLines = ticketLines;
	}

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public Sale userId(String userId) {
		this.userId = userId;
		return this;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public Sale customerId(Long customerId) {
		this.customerId = customerId;
		return this;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Instant getDate() {
		return date;
	}

	public Sale date(Instant date) {
		this.date = date;
		return this;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	public Double getGrandTotal() {
		return grandTotal;
	}

	public Sale grandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
		return this;
	}

	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
	}
	// jhipster-needle-entity-add-getters-setters - JHipster will add getters and
	// setters here, do not remove

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Sale sale = (Sale) o;
		if (sale.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), sale.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

}

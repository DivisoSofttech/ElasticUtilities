package com.diviso.graeshoppe.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 * A TicketLine.
 */

public class TicketLine implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Long productId;

	private Integer quantity;

	private Double price;

	private Double total;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductId() {
		return productId;
	}

	public TicketLine productId(Long productId) {
		this.productId = productId;
		return this;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public TicketLine quantity(Integer quantity) {
		this.quantity = quantity;
		return this;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public TicketLine price(Double price) {
		this.price = price;
		return this;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getTotal() {
		return total;
	}

	public TicketLine total(Double total) {
		this.total = total;
		return this;
	}

	public void setTotal(Double total) {
		this.total = total;
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
		TicketLine ticketLine = (TicketLine) o;
		if (ticketLine.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), ticketLine.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "TicketLine{" + "id=" + getId() + ", productId=" + getProductId() + ", quantity=" + getQuantity()
				+ ", price=" + getPrice() + ", total=" + getTotal() + "}";
	}
}

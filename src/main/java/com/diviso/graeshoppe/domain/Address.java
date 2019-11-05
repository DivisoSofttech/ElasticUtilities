package com.diviso.graeshoppe.domain;

import java.util.Objects;

/**
 * A Address.
 */

public class Address {

	private Long id;

	private String addressLine1;

	private String addressLine2;

	private String postCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public Address addressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
		return this;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public Address addressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
		return this;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getPostCode() {
		return postCode;
	}

	public Address postCode(String postCode) {
		this.postCode = postCode;
		return this;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Address address = (Address) o;
		if (address.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), address.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Address{" + "id=" + getId() + ", addressLine1='" + getAddressLine1() + "'" + ", addressLine2='"
				+ getAddressLine2() + "'" + ", postCode='" + getPostCode() + "'" + "}";
	}
}

package com.diviso.graeshoppe.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Objects;

/**
 * A Customer.
 */
@Document(indexName = "customer")
public class Customer {
	@Id
	private Long id;
	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	private Long customerId;
	
	private String reference;

	private String name;

	private Long contactId;

	private String imageLink;

	private Long mobileNumber;

	private Integer phoneCode;

	private Long telephone;

	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public Customer reference(String reference) {
		this.reference = reference;
		return this;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getName() {
		return name;
	}

	public Customer name(String name) {
		this.name = name;
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageLink() {
		return imageLink;
	}

	public Customer imageLink(String imageLink) {
		this.imageLink = imageLink;
		return this;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public Customer mobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
		return this;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Integer getPhoneCode() {
		return phoneCode;
	}

	public Customer phoneCode(Integer phoneCode) {
		this.phoneCode = phoneCode;
		return this;
	}

	public void setPhoneCode(Integer phoneCode) {
		this.phoneCode = phoneCode;
	}

	public Long getTelephone() {
		return telephone;
	}

	public Customer telephone(Long telephone) {
		this.telephone = telephone;
		return this;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public Customer email(String email) {
		this.email = email;
		return this;
	}

	public void setEmail(String email) {
		this.email = email;
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
		Customer customer = (Customer) o;
		if (customer.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), customer.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", reference=" + reference + ", name=" + name + ",  imageLink=" + imageLink
				+ ", mobileNumber=" + mobileNumber + ", phoneCode=" + phoneCode + ", telephone=" + telephone
				+ ", email=" + email + "]";
	}

}

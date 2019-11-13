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
	// capture mysql-id
	private Long customerId;
	// reference
	private String idpCode;
	// searchkey
	private String idpSub;
	private String name;

	private String imageLink;

	private Contact contact;

	private Set<Product> favouriteProducts = new HashSet<>();

	private Set<Store> favouriteStores = new HashSet<>();

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
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

	// jhipster-needle-entity-add-getters-setters - JHipster will add getters and
	// setters here, do not remove

	public String getIdpCode() {
		return idpCode;
	}

	public void setIdpCode(String idpCode) {
		this.idpCode = idpCode;
	}

	public String getIdpSub() {
		return idpSub;
	}

	public void setIdpSub(String idpSub) {
		this.idpSub = idpSub;
	}

	public Set<Product> getFavouriteProducts() {
		return favouriteProducts;
	}

	public void setFavouriteProducts(Set<Product> favouriteProducts) {
		this.favouriteProducts = favouriteProducts;
	}

	public Set<Store> getFavouriteStores() {
		return favouriteStores;
	}

	public void setFavouriteStores(Set<Store> favouriteStores) {
		this.favouriteStores = favouriteStores;
	}

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

}

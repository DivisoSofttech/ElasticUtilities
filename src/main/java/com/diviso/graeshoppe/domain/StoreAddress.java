package com.diviso.graeshoppe.domain;

import javax.persistence.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

/**
 * A StoreAddress.
 */

public class StoreAddress {

	private Long id;

	private String postCode;

	private String houseNumber;

	private String street;

	private String city;

	private String state;

	private String country;

	private String landmark;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public StoreAddress street(String street) {
		this.street = street;
		return this;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public StoreAddress city(String city) {
		this.city = city;
		return this;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public StoreAddress state(String state) {
		this.state = state;
		return this;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public StoreAddress country(String country) {
		this.country = country;
		return this;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLandmark() {
		return landmark;
	}

	public StoreAddress landmark(String landmark) {
		this.landmark = landmark;
		return this;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	// jhipster-needle-entity-add-getters-setters - JHipster will add getters and
	// setters here, do not remove

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		StoreAddress storeAddress = (StoreAddress) o;
		if (storeAddress.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), storeAddress.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "StoreAddress [id=" + id + ", postCode=" + postCode + ", houseNumber=" + houseNumber + ", street="
				+ street + ", city=" + city + ", state=" + state + ", country=" + country + ", landmark=" + landmark
				+ "]";
	}

}

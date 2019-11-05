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

	private String reference;

	private String name;

	private byte[] image;

	private String imageContentType;

	private Long mobileNumber;

	private Long phoneCode;

	private Long telephone;

	private String email;

	private Set<Address> addresses = new HashSet<>();

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

	public byte[] getImage() {
		return image;
	}

	public Customer image(byte[] image) {
		this.image = image;
		return this;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getImageContentType() {
		return imageContentType;
	}

	public Customer imageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
		return this;
	}

	public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
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

	public Long getPhoneCode() {
		return phoneCode;
	}

	public Customer phoneCode(Long phoneCode) {
		this.phoneCode = phoneCode;
		return this;
	}

	public void setPhoneCode(Long phoneCode) {
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

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	// jhipster-needle-entity-add-getters-setters - JHipster will add getters and
	// setters here, do not remove

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addresses == null) ? 0 : addresses.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + Arrays.hashCode(image);
		result = prime * result + ((imageContentType == null) ? 0 : imageContentType.hashCode());
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneCode == null) ? 0 : phoneCode.hashCode());
		result = prime * result + ((reference == null) ? 0 : reference.hashCode());
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (addresses == null) {
			if (other.addresses != null)
				return false;
		} else if (!addresses.equals(other.addresses))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (!Arrays.equals(image, other.image))
			return false;
		if (imageContentType == null) {
			if (other.imageContentType != null)
				return false;
		} else if (!imageContentType.equals(other.imageContentType))
			return false;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneCode == null) {
			if (other.phoneCode != null)
				return false;
		} else if (!phoneCode.equals(other.phoneCode))
			return false;
		if (reference == null) {
			if (other.reference != null)
				return false;
		} else if (!reference.equals(other.reference))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", reference=" + reference + ", name=" + name + ", image="
				+ Arrays.toString(image) + ", imageContentType=" + imageContentType + ", mobileNumber=" + mobileNumber
				+ ", phoneCode=" + phoneCode + ", telephone=" + telephone + ", email=" + email + ", addresses="
				+ addresses + "]";
	}

}

package com.diviso.graeshoppe.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A Supplier.
 */

@Document(indexName = "supplier")
public class Supplier {

	@Id

	private Long id;

	private String idpCode;

	private String companyName;

	private Double creditLimit;

	private Double currentDebt;

	private LocalDate debtDate;

	private Boolean visible;

	private String saluation;

	private String firstName;

	private String lastName;

	private String email;

	private Long telephone;

	private Long mobile;

	private String fax;

	private String websiteURL;

	private String facebook;

	private String twitter;

	private String addressLine1;

	private String addressLine2;

	private String city;

	private String state;

	private String country;

	private String zipcode;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdpCode() {
		return idpCode;
	}

	public Supplier idpCode(String idpCode) {
		this.idpCode = idpCode;
		return this;
	}

	public void setIdpCode(String idpCode) {
		this.idpCode = idpCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public Supplier companyName(String companyName) {
		this.companyName = companyName;
		return this;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Double getCreditLimit() {
		return creditLimit;
	}

	public Supplier creditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
		return this;
	}

	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Double getCurrentDebt() {
		return currentDebt;
	}

	public Supplier currentDebt(Double currentDebt) {
		this.currentDebt = currentDebt;
		return this;
	}

	public void setCurrentDebt(Double currentDebt) {
		this.currentDebt = currentDebt;
	}

	public LocalDate getDebtDate() {
		return debtDate;
	}

	public Supplier debtDate(LocalDate debtDate) {
		this.debtDate = debtDate;
		return this;
	}

	public void setDebtDate(LocalDate debtDate) {
		this.debtDate = debtDate;
	}

	public Boolean isVisible() {
		return visible;
	}

	public Supplier visible(Boolean visible) {
		this.visible = visible;
		return this;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public String getSaluation() {
		return saluation;
	}

	public Supplier saluation(String saluation) {
		this.saluation = saluation;
		return this;
	}

	public void setSaluation(String saluation) {
		this.saluation = saluation;
	}

	public String getFirstName() {
		return firstName;
	}

	public Supplier firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Supplier lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public Supplier email(String email) {
		this.email = email;
		return this;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getTelephone() {
		return telephone;
	}

	public Supplier telephone(Long telephone) {
		this.telephone = telephone;
		return this;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	public Long getMobile() {
		return mobile;
	}

	public Supplier mobile(Long mobile) {
		this.mobile = mobile;
		return this;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getFax() {
		return fax;
	}

	public Supplier fax(String fax) {
		this.fax = fax;
		return this;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getWebsiteURL() {
		return websiteURL;
	}

	public Supplier websiteURL(String websiteURL) {
		this.websiteURL = websiteURL;
		return this;
	}

	public void setWebsiteURL(String websiteURL) {
		this.websiteURL = websiteURL;
	}

	public String getFacebook() {
		return facebook;
	}

	public Supplier facebook(String facebook) {
		this.facebook = facebook;
		return this;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getTwitter() {
		return twitter;
	}

	public Supplier twitter(String twitter) {
		this.twitter = twitter;
		return this;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public Supplier addressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
		return this;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public Supplier addressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
		return this;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public Supplier city(String city) {
		this.city = city;
		return this;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public Supplier state(String state) {
		this.state = state;
		return this;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public Supplier country(String country) {
		this.country = country;
		return this;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public Supplier zipcode(String zipcode) {
		this.zipcode = zipcode;
		return this;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
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
		Supplier supplier = (Supplier) o;
		if (supplier.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), supplier.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Supplier{" + "id=" + getId() + ", idpCode='" + getIdpCode() + "'" + ", companyName='" + getCompanyName()
				+ "'" + ", creditLimit=" + getCreditLimit() + ", currentDebt=" + getCurrentDebt() + ", debtDate='"
				+ getDebtDate() + "'" + ", visible='" + isVisible() + "'" + ", saluation='" + getSaluation() + "'"
				+ ", firstName='" + getFirstName() + "'" + ", lastName='" + getLastName() + "'" + ", email='"
				+ getEmail() + "'" + ", telephone=" + getTelephone() + ", mobile=" + getMobile() + ", fax='" + getFax()
				+ "'" + ", websiteURL='" + getWebsiteURL() + "'" + ", facebook='" + getFacebook() + "'" + ", twitter='"
				+ getTwitter() + "'" + ", addressLine1='" + getAddressLine1() + "'" + ", addressLine2='"
				+ getAddressLine2() + "'" + ", city='" + getCity() + "'" + ", state='" + getState() + "'"
				+ ", country='" + getCountry() + "'" + ", zipcode='" + getZipcode() + "'" + "}";
	}
}

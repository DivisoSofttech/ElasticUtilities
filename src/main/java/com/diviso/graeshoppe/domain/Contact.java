package com.diviso.graeshoppe.domain;

import java.util.Objects;

/**
 * A Contact.
 */

public class Contact  {

    
   
    private Long id;

   
    private Long mobileNumber;

   
    private Long phoneCode;

   
    private Long telephone;

   
    private String email;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public Contact mobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Long getPhoneCode() {
        return phoneCode;
    }

    public Contact phoneCode(Long phoneCode) {
        this.phoneCode = phoneCode;
        return this;
    }

    public void setPhoneCode(Long phoneCode) {
        this.phoneCode = phoneCode;
    }

    public Long getTelephone() {
        return telephone;
    }

    public Contact telephone(Long telephone) {
        this.telephone = telephone;
        return this;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public Contact email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Contact contact = (Contact) o;
        if (contact.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), contact.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Contact{" +
            "id=" + getId() +
            ", mobileNumber=" + getMobileNumber() +
            ", phoneCode=" + getPhoneCode() +
            ", telephone=" + getTelephone() +
            ", email='" + getEmail() + "'" +
            "}";
    }
}

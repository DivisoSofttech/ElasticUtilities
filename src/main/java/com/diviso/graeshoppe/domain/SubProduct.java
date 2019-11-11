package com.diviso.graeshoppe.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.GeoPointField;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A SubProduct.
 */

public class SubProduct {

	private Long id;

	private String description;

	private Double quantity;

	private String reference;

	private Boolean showInCatalogue;

	private String name;

	

	private String imageLink;

	private Boolean isActive;

	private String sku;

	private String idpCode;

	private Boolean isServiceItem;

	private String itemType;

	private Double minQuantityLevel;

	private Double maxQuantityLevel;

	private Double storageCost;

	private Double discountRate;

	private String manufacturerName;

	private String brandName;

	private String unit;

	private String categoryName;

	

	private String categoryImageLink;

	private String categoryDescription;

	private String locationName;
	  @GeoPointField
	private String latLon;

	private String addressLine1;

	private String addressLine2;

	private String city;

	private String state;

	private String country;

	private String zipcode;

	private Set<Label> labels = new HashSet<>();

	public Set<Label> getLabels() {
		return labels;
	}

	public void setLabels(Set<Label> labels) {
		this.labels = labels;
	}

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public SubProduct description(String description) {
		this.description = description;
		return this;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getQuantity() {
		return quantity;
	}

	public SubProduct quantity(Double quantity) {
		this.quantity = quantity;
		return this;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getReference() {
		return reference;
	}

	public SubProduct reference(String reference) {
		this.reference = reference;
		return this;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Boolean isShowInCatalogue() {
		return showInCatalogue;
	}

	public SubProduct showInCatalogue(Boolean showInCatalogue) {
		this.showInCatalogue = showInCatalogue;
		return this;
	}

	public void setShowInCatalogue(Boolean showInCatalogue) {
		this.showInCatalogue = showInCatalogue;
	}

	public String getName() {
		return name;
	}

	public SubProduct name(String name) {
		this.name = name;
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String getImageLink() {
		return imageLink;
	}

	public SubProduct imageLink(String imageLink) {
		this.imageLink = imageLink;
		return this;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public Boolean isIsActive() {
		return isActive;
	}

	public SubProduct isActive(Boolean isActive) {
		this.isActive = isActive;
		return this;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getSku() {
		return sku;
	}

	public SubProduct sku(String sku) {
		this.sku = sku;
		return this;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getIdpCode() {
		return idpCode;
	}

	public SubProduct idpcode(String idpCode) {
		this.idpCode = idpCode;
		return this;
	}

	public void setIdpcode(String idpCode) {
		this.idpCode = idpCode;
	}

	public Boolean isIsServiceItem() {
		return isServiceItem;
	}

	public SubProduct isServiceItem(Boolean isServiceItem) {
		this.isServiceItem = isServiceItem;
		return this;
	}

	public void setIsServiceItem(Boolean isServiceItem) {
		this.isServiceItem = isServiceItem;
	}

	public String getItemType() {
		return itemType;
	}

	public SubProduct itemType(String itemType) {
		this.itemType = itemType;
		return this;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public Double getMinQuantityLevel() {
		return minQuantityLevel;
	}

	public SubProduct minQuantityLevel(Double minQuantityLevel) {
		this.minQuantityLevel = minQuantityLevel;
		return this;
	}

	public void setMinQuantityLevel(Double minQuantityLevel) {
		this.minQuantityLevel = minQuantityLevel;
	}

	public Double getMaxQuantityLevel() {
		return maxQuantityLevel;
	}

	public SubProduct maxQuantityLevel(Double maxQuantityLevel) {
		this.maxQuantityLevel = maxQuantityLevel;
		return this;
	}

	public void setMaxQuantityLevel(Double maxQuantityLevel) {
		this.maxQuantityLevel = maxQuantityLevel;
	}

	public Double getStorageCost() {
		return storageCost;
	}

	public SubProduct storageCost(Double storageCost) {
		this.storageCost = storageCost;
		return this;
	}

	public void setStorageCost(Double storageCost) {
		this.storageCost = storageCost;
	}


	

	
	public Double getDiscountRate() {
		return discountRate;
	}

	public SubProduct discountRate(Double discountRate) {
		this.discountRate = discountRate;
		return this;
	}

	public void setDiscountRate(Double discountRate) {
		this.discountRate = discountRate;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public SubProduct manufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
		return this;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getBrandName() {
		return brandName;
	}

	public SubProduct brandName(String brandName) {
		this.brandName = brandName;
		return this;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getUnit() {
		return unit;
	}

	public SubProduct unit(String unit) {
		this.unit = unit;
		return this;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public SubProduct categoryName(String categoryName) {
		this.categoryName = categoryName;
		return this;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	

	public String getCategoryImageLink() {
		return categoryImageLink;
	}

	public SubProduct categoryImageLink(String categoryImageLink) {
		this.categoryImageLink = categoryImageLink;
		return this;
	}

	public void setCategoryImageLink(String categoryImageLink) {
		this.categoryImageLink = categoryImageLink;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public SubProduct categoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
		return this;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public String getLocationName() {
		return locationName;
	}

	public SubProduct locationName(String locationName) {
		this.locationName = locationName;
		return this;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLatLon() {
		return latLon;
	}

	public SubProduct latLon(String latLon) {
		this.latLon = latLon;
		return this;
	}

	public void setLatLon(String latLon) {
		this.latLon = latLon;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public SubProduct addressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
		return this;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public SubProduct addressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
		return this;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public SubProduct city(String city) {
		this.city = city;
		return this;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public SubProduct state(String state) {
		this.state = state;
		return this;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public SubProduct country(String country) {
		this.country = country;
		return this;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public SubProduct zipcode(String zipcode) {
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
		SubProduct subProduct = (SubProduct) o;
		if (subProduct.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), subProduct.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "SubProduct{" + "id=" + getId() + ", description='" + getDescription() + "'" + ", quantity="
				+ getQuantity() + ", reference='" + getReference() + "'" + ", showInCatalogue='" + isShowInCatalogue()
				+ "'" + ", name='" + getName() + "'" + ", imageLink='"
				+ getImageLink() + "'" + ", isActive='" + isIsActive() + "'" + ", sku='" + getSku() + "'"
				+ ", idpcode='" + getIdpCode() + "'" + ", isServiceItem='" + isIsServiceItem() + "'" + ", itemType='"
				+ getItemType() + "'" + ", minQuantityLevel=" + getMinQuantityLevel() + ", maxQuantityLevel="
				+ getMaxQuantityLevel() + ", storageCost=" + getStorageCost() + ", discountRate=" + getDiscountRate() + ", manufacturerName='"
				+ getManufacturerName() + "'" + ", brandName='" + getBrandName() + "'" + ", unit='" + getUnit() + "'"
				+ ", categoryName='" + getCategoryName() + "'" + ",  categoryImageLink='" + getCategoryImageLink() + "'" + ", categoryDescription='"
				+ getCategoryDescription() + "'" + ", locationName='" + getLocationName() + "'" + ", latLon='"
				+ getLatLon() + "'" + ", addressLine1='" + getAddressLine1() + "'" + ", addressLine2='"
				+ getAddressLine2() + "'" + ", city='" + getCity() + "'" + ", state='" + getState() + "'"
				+ ", country='" + getCountry() + "'" + ", zipcode='" + getZipcode() + "'" + ", labels='" + getLabels()
				+ "'" + "}";
	}
}

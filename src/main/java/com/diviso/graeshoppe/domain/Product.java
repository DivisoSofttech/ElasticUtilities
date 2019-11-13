package com.diviso.graeshoppe.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A Product.
 */

@Document(indexName = "product")
public class Product {

	@Id

	private Long id;

	private String reference;

	private String name;

	private Boolean showInCatalogue;

	private String imageLink;

	private Boolean isActive;

	private String sku;

	private String idpCode;

	private Boolean isServiceItem;

	private Boolean isAuxilaryItem;

	private Double minQuantityLevel;

	private Double maxQuantityLevel;

	private Double storageCost;
	// discount
	private Double discountRate;
	// manufacturer
	private String manufacturerName;
	// brand
	private String brandName;
	// UOM
	private String unit;
	// Category
	private Long categoryId;

	private String categoryName;

	private String categoryImageLink;

	private String categoryDescription;
	// location
	private String locationName;

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

	public String getReference() {
		return reference;
	}

	public Product reference(String reference) {
		this.reference = reference;
		return this;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getName() {
		return name;
	}

	public Product name(String name) {
		this.name = name;
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean isShowInCatalogue() {
		return showInCatalogue;
	}

	public Product showInCatalogue(Boolean showInCatalogue) {
		this.showInCatalogue = showInCatalogue;
		return this;
	}

	public void setShowInCatalogue(Boolean showInCatalogue) {
		this.showInCatalogue = showInCatalogue;
	}

	public String getImageLink() {
		return imageLink;
	}

	public Product imageLink(String imageLink) {
		this.imageLink = imageLink;
		return this;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public Boolean isIsActive() {
		return isActive;
	}

	public Product isActive(Boolean isActive) {
		this.isActive = isActive;
		return this;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getSku() {
		return sku;
	}

	public Product sku(String sku) {
		this.sku = sku;
		return this;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getIdpCode() {
		return idpCode;
	}

	public Product iDPcode(String idpCode) {
		this.idpCode = idpCode;
		return this;
	}

	public void setIdpCode(String idpCode) {
		this.idpCode = idpCode;
	}

	public Boolean isIsServiceItem() {
		return isServiceItem;
	}

	public Product isServiceItem(Boolean isServiceItem) {
		this.isServiceItem = isServiceItem;
		return this;
	}

	public void setIsServiceItem(Boolean isServiceItem) {
		this.isServiceItem = isServiceItem;
	}

	public Boolean isIsAuxilaryItem() {
		return isAuxilaryItem;
	}

	public Product isAuxilaryItem(Boolean isAuxilaryItem) {
		this.isAuxilaryItem = isAuxilaryItem;
		return this;
	}

	public void setIsAuxilaryItem(Boolean isAuxilaryItem) {
		this.isAuxilaryItem = isAuxilaryItem;
	}

	public Double getMinQuantityLevel() {
		return minQuantityLevel;
	}

	public Product minQuantityLevel(Double minQuantityLevel) {
		this.minQuantityLevel = minQuantityLevel;
		return this;
	}

	public void setMinQuantityLevel(Double minQuantityLevel) {
		this.minQuantityLevel = minQuantityLevel;
	}

	public Double getMaxQuantityLevel() {
		return maxQuantityLevel;
	}

	public Product maxQuantityLevel(Double maxQuantityLevel) {
		this.maxQuantityLevel = maxQuantityLevel;
		return this;
	}

	public void setMaxQuantityLevel(Double maxQuantityLevel) {
		this.maxQuantityLevel = maxQuantityLevel;
	}

	public Double getStorageCost() {
		return storageCost;
	}

	public Product storageCost(Double storageCost) {
		this.storageCost = storageCost;
		return this;
	}

	public void setStorageCost(Double storageCost) {
		this.storageCost = storageCost;
	}

	public Double getDiscountRate() {
		return discountRate;
	}

	public Product discountRate(Double discountRate) {
		this.discountRate = discountRate;
		return this;
	}

	public void setDiscountRate(Double discountRate) {
		this.discountRate = discountRate;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public Product manufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
		return this;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getBrandName() {
		return brandName;
	}

	public Product brandName(String brandName) {
		this.brandName = brandName;
		return this;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getUnit() {
		return unit;
	}

	public Product unit(String unit) {
		this.unit = unit;
		return this;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public Product categoryName(String categoryName) {
		this.categoryName = categoryName;
		return this;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryImageLink() {
		return categoryImageLink;
	}

	public Product categoryImageLink(String categoryImageLink) {
		this.categoryImageLink = categoryImageLink;
		return this;
	}

	public void setCategoryImageLink(String categoryImageLink) {
		this.categoryImageLink = categoryImageLink;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public Product categoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
		return this;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public String getLocationName() {
		return locationName;
	}

	public Product locationName(String locationName) {
		this.locationName = locationName;
		return this;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLatLon() {
		return latLon;
	}

	public Product latLon(String latLon) {
		this.latLon = latLon;
		return this;
	}

	public void setLatLon(String latLon) {
		this.latLon = latLon;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public Product addressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
		return this;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public Product addressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
		return this;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public Product city(String city) {
		this.city = city;
		return this;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public Product state(String state) {
		this.state = state;
		return this;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public Product country(String country) {
		this.country = country;
		return this;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public Product zipcode(String zipcode) {
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
		Product product = (Product) o;
		if (product.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), product.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", reference=" + reference + ", name=" + name + ", showInCatalogue="
				+ showInCatalogue + ",  imageLink=" + imageLink + ", isActive=" + isActive + ", sku=" + sku
				+ ", idpCode=" + idpCode + ", isServiceItem=" + isServiceItem + ", isAuxilaryItem=" + isAuxilaryItem
				+ ", minQuantityLevel=" + minQuantityLevel + ", maxQuantityLevel=" + maxQuantityLevel + ", storageCost="
				+ storageCost + ", discountRate=" + discountRate + ", manufacturerName=" + manufacturerName
				+ ", brandName=" + brandName + ", unit=" + unit + ", categoryName=" + categoryName
				+ ", categoryImageLink=" + categoryImageLink + ", categoryDescription=" + categoryDescription
				+ ", locationName=" + locationName + ", latLon=" + latLon + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", zipcode=" + zipcode + ", labels=" + labels + "]";
	}

}

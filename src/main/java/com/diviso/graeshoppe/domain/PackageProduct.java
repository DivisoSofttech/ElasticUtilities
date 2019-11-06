package com.diviso.graeshoppe.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A PackageProduct.
 */

@Document(indexName = "packageproduct")
public class PackageProduct {

	@Id
	private Long id;

	private String reference;

	private String name;

	private Boolean showInCatalogue;

	private byte[] image;

	private String imageContentType;

	private Boolean isActive;

	private String sku;

	private String idpCode;

	private Boolean isServiceItem;

	private Boolean isAuxilaryItem;

	private Double minQuantityLevel;

	private Double maxQuantityLevel;

	private Double storageCost;

	private Double discountRate;

	private String manufacturerName;

	private String brandName;

	private String unit;

	private String categoryName;

	private byte[] categoryImage;

	private String categoryImageContentType;

	private String categoryDescription;

	private String locationName;

	private String latLon;

	private String addressLine1;

	private String addressLine2;

	private String city;

	private String state;

	private String country;

	private String zipcode;

	private Set<Label> labels = new HashSet<>();

	private Set<SubProduct> subProducts = new HashSet<>();

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

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean isShowInCatalogue() {
		return showInCatalogue;
	}

	public void setShowInCatalogue(Boolean showInCatalogue) {
		this.showInCatalogue = showInCatalogue;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getImageContentType() {
		return imageContentType;
	}

	public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
	}

	public Boolean isIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getIdpCode() {
		return idpCode;
	}

	public void setIdpCode(String idpCode) {
		this.idpCode = idpCode;
	}

	public Boolean isIsServiceItem() {
		return isServiceItem;
	}

	public void setIsServiceItem(Boolean isServiceItem) {
		this.isServiceItem = isServiceItem;
	}

	public Boolean isIsAuxilaryItem() {
		return isAuxilaryItem;
	}

	public void setIsAuxilaryItem(Boolean isAuxilaryItem) {
		this.isAuxilaryItem = isAuxilaryItem;
	}

	public Double getMinQuantityLevel() {
		return minQuantityLevel;
	}

	public void setMinQuantityLevel(Double minQuantityLevel) {
		this.minQuantityLevel = minQuantityLevel;
	}

	public Double getMaxQuantityLevel() {
		return maxQuantityLevel;
	}

	public void setMaxQuantityLevel(Double maxQuantityLevel) {
		this.maxQuantityLevel = maxQuantityLevel;
	}

	public Double getStorageCost() {
		return storageCost;
	}

	public void setStorageCost(Double storageCost) {
		this.storageCost = storageCost;
	}

	

	public Double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(Double discountRate) {
		this.discountRate = discountRate;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public byte[] getCategoryImage() {
		return categoryImage;
	}

	public void setCategoryImage(byte[] categoryImage) {
		this.categoryImage = categoryImage;
	}

	public String getCategoryImageContentType() {
		return categoryImageContentType;
	}

	public void setCategoryImageContentType(String categoryImageContentType) {
		this.categoryImageContentType = categoryImageContentType;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLatLon() {
		return latLon;
	}

	public void setLatLon(String latLon) {
		this.latLon = latLon;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
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
		PackageProduct packageProduct = (PackageProduct) o;
		if (packageProduct.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), packageProduct.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	public Set<SubProduct> getSubProducts() {
		return subProducts;
	}

	public void setSubProducts(Set<SubProduct> subProducts) {
		this.subProducts = subProducts;
	}

	@Override
	public String toString() {
		return "PackageProduct [id=" + id + ", reference=" + reference + ", name=" + name + ", showInCatalogue="
				+ showInCatalogue + ", image=" + Arrays.toString(image) + ", imageContentType=" + imageContentType
				+ ", isActive=" + isActive + ", sku=" + sku + ", idpCode=" + idpCode + ", isServiceItem="
				+ isServiceItem + ", isAuxilaryItem=" + isAuxilaryItem + ", minQuantityLevel=" + minQuantityLevel
				+ ", maxQuantityLevel=" + maxQuantityLevel + ", storageCost=" + storageCost + ", discountRate=" + discountRate + ", manufacturerName="
				+ manufacturerName + ", brandName=" + brandName + ", unit=" + unit + ", categoryName=" + categoryName
				+ ", categoryImage=" + Arrays.toString(categoryImage) + ", categoryImageContentType="
				+ categoryImageContentType + ", categoryDescription=" + categoryDescription + ", locationName="
				+ locationName + ", latLon=" + latLon + ", addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ", city=" + city + ", state=" + state + ", country=" + country + ", zipcode=" + zipcode
				+ ", labels=" + labels + ", subProducts=" + subProducts + "]";
	}

}

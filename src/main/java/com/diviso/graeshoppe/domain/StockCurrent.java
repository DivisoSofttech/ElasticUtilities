package com.diviso.graeshoppe.domain;

import org.springframework.data.annotation.Id;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.GeoPointField;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A StockCurrent.
 */

@Document(indexName = "stockcurrent")
public class StockCurrent {

	@Id
	private Long id;

	private String idpCode;

	private Double quantity;

	private Double sellingPrice;
	private Double purchacePrice;
	
	private String notes;
//product
	//productId = product.getId()
	
	private Long productId;
	
	private String reference;

	private String name;

	private Boolean showInCatalogue;

	

	private String imageLink;

	private Boolean isActive;

	private String sku;

	private Boolean isServiceItem;

	private Boolean isAuxilaryItem;

	private Double minQuantityLevel;

	private Double maxQuantityLevel;

	private Double storageCost;


	private Double buyPrice;

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

	

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
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

	public Double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
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

	

	public String getCategoryImageLink() {
		return categoryImageLink;
	}

	public void setCategoryImageLink(String categoryImageLink) {
		this.categoryImageLink = categoryImageLink;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdpCode() {
		return idpCode;
	}

	public StockCurrent idpCode(String idpCode) {
		this.idpCode = idpCode;
		return this;
	}

	public void setIdpCode(String idpCode) {
		this.idpCode = idpCode;
	}

	public Double getQuantity() {
		return quantity;
	}

	public StockCurrent quantity(Double quantity) {
		this.quantity = quantity;
		return this;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getSellPrice() {
		return sellingPrice;
	}

	public StockCurrent sellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
		return this;
	}

	public void setSellPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public String getNotes() {
		return notes;
	}

	public StockCurrent notes(String notes) {
		this.notes = notes;
		return this;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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
		StockCurrent stockCurrent = (StockCurrent) o;
		if (stockCurrent.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), stockCurrent.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "StockCurrent{" + "id=" + getId() + ", idpCode='" + getIdpCode() + "'" + ", quantity=" + getQuantity()
				+ ", sellPrice=" + getSellPrice() + ", notes='" + getNotes() + "'" + "}";
	}
}

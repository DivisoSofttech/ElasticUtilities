
package com.diviso.graeshoppe.domain;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.GeoPointField;

/**
 * A Store.
 */
@Document(indexName = "store")
public class Store {
	@Id
	
	private String id;
	
//	private Long storeCode;

	private String idpCode;

	private String name;

	private String imageLink;

	private Double totalRating;
	@GeoPointField
	private String latlon;

	private String locationName;

	private Long contactNumber;

	private ZonedDateTime openingTime;

	private String email;

	private ZonedDateTime closingTime;

	private String info;

	private Double minAmount;

	private ZonedDateTime maxDeliveryTime;
	// StoreAddress
	private StoreAddress storeAddress;
	// storeSettings
	private StoreSettings storeSettings;

	// Propreitor
	private Propreitor propreitor;

	// PreOrderSettings
	private PreOrderSettings preOrderSettings;
	// Banner
	private Set<Banner> banners = new HashSet<>();

	private Set<UserRatingReview> userRatingReviews = new HashSet<>();

	private Set<StoreDeliveryInfo> StoreDeliveryInfos = new HashSet<>();
	private Set<StoreType> StoreTypes = new HashSet<>();

	// list of StoreType

	public Set<Banner> getBanners() {
		return banners;
	}

	public String getIdpCode() {
		return idpCode;
	}

	public void setIdpCode(String idpCode) {
		this.idpCode = idpCode;
	}

	public String getLatlon() {
		return latlon;
	}

	public void setLatlon(String latlon) {
		this.latlon = latlon;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public ZonedDateTime getOpeningTime() {
		return openingTime;
	}

	public void setOpeningTime(ZonedDateTime openingTime) {
		this.openingTime = openingTime;
	}

	public ZonedDateTime getMaxDeliveryTime() {
		return maxDeliveryTime;
	}

	public void setMaxDeliveryTime(ZonedDateTime maxDeliveryTime) {
		this.maxDeliveryTime = maxDeliveryTime;
	}

	/*public Long getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(Long storeCode) {
		this.storeCode = storeCode;
	}*/

	public StoreAddress getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(StoreAddress storeAddress) {
		this.storeAddress = storeAddress;
	}

	public StoreSettings getStoreSettings() {
		return storeSettings;
	}

	public void setStoreSettings(StoreSettings storeSettings) {
		this.storeSettings = storeSettings;
	}

	public Propreitor getPropreitor() {
		return propreitor;
	}

	public void setPropreitor(Propreitor propreitor) {
		this.propreitor = propreitor;
	}

	public PreOrderSettings getPreOrderSettings() {
		return preOrderSettings;
	}

	public void setPreOrderSettings(PreOrderSettings preOrderSettings) {
		this.preOrderSettings = preOrderSettings;
	}

	public Set<StoreDeliveryInfo> getStoreDeliveryInfos() {
		return StoreDeliveryInfos;
	}

	public void setStoreDeliveryInfos(Set<StoreDeliveryInfo> storeDeliveryInfos) {
		StoreDeliveryInfos = storeDeliveryInfos;
	}



	public void setBanners(Set<Banner> banners) {
		this.banners = banners;
	}

	public Set<UserRatingReview> getUserRatingReviews() {
		return userRatingReviews;
	}

	public void setUserRatingReviews(Set<UserRatingReview> userRatingReviews) {
		this.userRatingReviews = userRatingReviews;
	}

	public Set<StoreType> getStoreTypes() {
		return StoreTypes;
	}

	public void setStoreTypes(Set<StoreType> storeTypes) {
		StoreTypes = storeTypes;
	}

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Store name(String name) {
		this.name = name;
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageLink() {
		return imageLink;
	}

	public Store imageLink(String imageLink) {
		this.imageLink = imageLink;
		return this;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public Double getTotalRating() {
		return totalRating;
	}

	public Store totalRating(Double totalRating) {
		this.totalRating = totalRating;
		return this;
	}

	public void setTotalRating(Double totalRating) {
		this.totalRating = totalRating;
	}

	public String getLocation() {
		return latlon;
	}

	public Store location(String latlon) {
		this.latlon = latlon;
		return this;
	}

	public void setLocation(String location) {
		this.latlon = latlon;
	}

	public String getLocationName() {
		return locationName;
	}

	public Store locationName(String locationName) {
		this.locationName = locationName;
		return this;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getEmail() {
		return email;
	}

	public Store email(String email) {
		this.email = email;
		return this;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInfo() {
		return info;
	}

	public Store info(String info) {
		this.info = info;
		return this;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Double getMinAmount() {
		return minAmount;
	}

	public Store minAmount(Double minAmount) {
		this.minAmount = minAmount;
		return this;
	}

	public void setMinAmount(Double minAmount) {
		this.minAmount = minAmount;
	}

	public ZonedDateTime getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(ZonedDateTime closingTime) {
		this.closingTime = closingTime;
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
		Store store = (Store) o;
		if (store.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), store.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", idpCode=" + idpCode + ", name=" + name + ", imageLink=" + imageLink
				+ ", totalRating=" + totalRating + ", latlon=" + latlon + ", locationName=" + locationName
				+ ", contactNumber=" + contactNumber + ", openingTime=" + openingTime + ", email=" + email
				+ ", closingTime=" + closingTime + ", info=" + info + ", minAmount=" + minAmount + ", maxDeliveryTime="
				+ maxDeliveryTime + ", storeAddress=" + storeAddress + ", storeSettings=" + storeSettings
				+ ", propreitor=" + propreitor + ", preOrderSettings=" + preOrderSettings + ", banners=" + banners
				+ ", userRatingReviews=" + userRatingReviews + ", StoreDeliveryInfos=" + StoreDeliveryInfos
				+ ", StoreTypes=" + StoreTypes + ", getIdpCode()=" + getIdpCode() + ", getLatlon()=" + getLatlon()
				+ ", getContactNumber()=" + getContactNumber() + ", getOpeningTime()=" + getOpeningTime()
				+ ", getMaxDeliveryTime()=" + getMaxDeliveryTime() + ", getStoreAddress()=" + getStoreAddress()
				+ ", getStoreSettings()=" + getStoreSettings() + ", getPropreitor()=" + getPropreitor()
				+ ", getPreOrderSettings()=" + getPreOrderSettings() + ", getStoreDeliveryInfos()="
				+ getStoreDeliveryInfos() + ", getBanners()=" + getBanners() + ", getUserRatingReviews()="
				+ getUserRatingReviews() + ", getStoreTypes()=" + getStoreTypes() + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getImageLink()=" + getImageLink() + ", getTotalRating()="
				+ getTotalRating() + ", getLocation()=" + getLocation() + ", getLocationName()=" + getLocationName()
				+ ", getEmail()=" + getEmail() + ", getInfo()=" + getInfo() + ", getMinAmount()=" + getMinAmount()
				+ ", getClosingTime()=" + getClosingTime() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

}

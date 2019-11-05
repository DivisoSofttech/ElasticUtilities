
package com.diviso.graeshoppe.domain;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
/**
 * A Store.
 */
@Document(indexName = "store")
public class Store {
	@Id
	private Long id;

	private String regNo;

	private String name;

	private byte[] image;

	private String imageContentType;

	private Double totalRating;

	private String location;

	private String locationName;

	private Long mobileNumber;

	private Instant openingTime;

	private String email;

	private Instant closingTime;

	private String info;

	private Double minAmount;

	private Instant maxDeliveryTime;

	private String pincode;

	private String houseNumber;

	private String street;

	private String city;

	private String state;

	private String landmark;

	private String addressType;

	private Double deliveryCharge;

	private Double serviceCharge;

	private String orderAcceptType;

	private String propreitorName;

	private Set<Banner> banners = new HashSet<>();

	private Set<UserRatingReview> userRatingReviews = new HashSet<>();

	private Set<DeliveryInfo> deliveryInfos = new HashSet<>();
	private Set<StoreType> StoreTypes = new HashSet<>();

	// list of StoreType

	public Set<Banner> getBanners() {
		return banners;
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

	public Set<DeliveryInfo> getDeliveryInfos() {
		return deliveryInfos;
	}

	public void setDeliveryInfos(Set<DeliveryInfo> deliveryInfos) {
		this.deliveryInfos = deliveryInfos;
	}

	public Set<StoreType> getStoreTypes() {
		return StoreTypes;
	}

	public void setStoreTypes(Set<StoreType> storeTypes) {
		StoreTypes = storeTypes;
	}

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRegNo() {
		return regNo;
	}

	public Store regNo(String regNo) {
		this.regNo = regNo;
		return this;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
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

	public byte[] getImage() {
		return image;
	}

	public Store image(byte[] image) {
		this.image = image;
		return this;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getImageContentType() {
		return imageContentType;
	}

	public Store imageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
		return this;
	}

	public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
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
		return location;
	}

	public Store location(String location) {
		this.location = location;
		return this;
	}

	public void setLocation(String location) {
		this.location = location;
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

	public Instant getOpeningTime() {
		return openingTime;
	}

	public Store openingTime(Instant openingTime) {
		this.openingTime = openingTime;
		return this;
	}

	public void setOpeningTime(Instant openingTime) {
		this.openingTime = openingTime;
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

	public Instant getClosingTime() {
		return closingTime;
	}

	public Store closingTime(Instant closingTime) {
		this.closingTime = closingTime;
		return this;
	}

	public void setClosingTime(Instant closingTime) {
		this.closingTime = closingTime;
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

	public Instant getMaxDeliveryTime() {
		return maxDeliveryTime;
	}

	public Store maxDeliveryTime(Instant maxDeliveryTime) {
		this.maxDeliveryTime = maxDeliveryTime;
		return this;
	}

	public void setMaxDeliveryTime(Instant maxDeliveryTime) {
		this.maxDeliveryTime = maxDeliveryTime;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public Store houseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
		return this;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public Store Street(String street) {
		this.street = street;
		return this;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public Store city(String city) {
		this.city = city;
		return this;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public Store state(String state) {
		this.state = state;
		return this;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLandmark() {
		return landmark;
	}

	public Store landmark(String landmark) {
		this.landmark = landmark;
		return this;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getAddressType() {
		return addressType;
	}

	public Store addressType(String addressType) {
		this.addressType = addressType;
		return this;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public Double getDeliveryCharge() {
		return deliveryCharge;
	}

	public Store deliveryCharge(Double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
		return this;
	}

	public void setDeliveryCharge(Double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}

	public Double getServiceCharge() {
		return serviceCharge;
	}

	public Store serviceCharge(Double serviceCharge) {
		this.serviceCharge = serviceCharge;
		return this;
	}

	public void setServiceCharge(Double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public String getOrderAcceptType() {
		return orderAcceptType;
	}

	public Store orderAcceptType(String orderAcceptType) {
		this.orderAcceptType = orderAcceptType;
		return this;
	}

	public void setOrderAcceptType(String orderAcceptType) {
		this.orderAcceptType = orderAcceptType;
	}

	public String getPropreitorName() {
		return propreitorName;
	}

	public Store propreitorName(String propreitorName) {
		this.propreitorName = propreitorName;
		return this;
	}

	public void setPropreitorName(String propreitorName) {
		this.propreitorName = propreitorName;
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
		return "Store{" + "id=" + getId() + ", regNo='" + getRegNo() + "'" + ", name='" + getName() + "'" + ", image='"
				+ getImage() + "'" + ", imageContentType='" + getImageContentType() + "'" + ", totalRating="
				+ getTotalRating() + ", location='" + getLocation() + "'" + ", locationName='" + getLocationName() + "'"
				+ ", contactNo=" + getMobileNumber() + ", openingTime='" + getOpeningTime() + "'" + ", email='"
				+ getEmail() + "'" + ", closingTime='" + getClosingTime() + "'" + ", info='" + getInfo() + "'"
				+ ", minAmount=" + getMinAmount() + ", maxDeliveryTime='" + getMaxDeliveryTime() + "'" + ", pincode="
				+ getPincode() + ", houseNoOrBuildingName='" + getHouseNumber() + "'" + ", roadNameAreaOrStreet='"
				+ getStreet() + "'" + ", city='" + getCity() + "'" + ", state='" + getState() + "'" + ", landmark='"
				+ getLandmark() + "'" +

				", addressType='" + getAddressType() + "'" + ", deliveryCharge=" + getDeliveryCharge()
				+ ", serviceCharge=" + getServiceCharge() + ", orderAcceptType='" + getOrderAcceptType() + "'"
				+ ", propreitorName='" + getPropreitorName() + "'" + "}";
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}

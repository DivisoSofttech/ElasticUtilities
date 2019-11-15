package com.diviso.graeshoppe.domain;



import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A StoreDeliveryInfo.
 */

public class StoreDeliveryInfo  {

 
    private Long id;

  
    private ZonedDateTime startingTime;

  
    private ZonedDateTime endTime;

 
    private DeliveryType deliveryType;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ZonedDateTime getStartingTime() {
        return startingTime;
    }

    public StoreDeliveryInfo startingTime(ZonedDateTime startingTime) {
        this.startingTime = startingTime;
        return this;
    }

    public void setStartingTime(ZonedDateTime startingTime) {
        this.startingTime = startingTime;
    }

    public ZonedDateTime getEndTime() {
        return endTime;
    }

    public StoreDeliveryInfo endTime(ZonedDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    public void setEndTime(ZonedDateTime endTime) {
        this.endTime = endTime;
    }

   
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    public DeliveryType getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(DeliveryType deliveryType) {
		this.deliveryType = deliveryType;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StoreDeliveryInfo storeDeliveryInfo = (StoreDeliveryInfo) o;
        if (storeDeliveryInfo.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), storeDeliveryInfo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

	@Override
	public String toString() {
		return "StoreDeliveryInfo [id=" + id + ", startingTime=" + startingTime + ", endTime=" + endTime
				+ ", deliveryType=" + deliveryType + "]";
	}

  
}

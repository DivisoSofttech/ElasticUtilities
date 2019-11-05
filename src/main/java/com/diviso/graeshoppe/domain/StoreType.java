package com.diviso.graeshoppe.domain;




import java.util.Objects;

/**
 * A StoreType.
 */

public class StoreType  {

    
  
    private Long id;

   
    private String name;

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public StoreType name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
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
        StoreType storeType = (StoreType) o;
        if (storeType.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), storeType.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "StoreType{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            "}";
    }
}

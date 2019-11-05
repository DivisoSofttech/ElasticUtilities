package com.diviso.graeshoppe.domain;

import java.util.Objects;

/**
 * A Label.
 */

public class Label {

	private Long id;

	private String idpCode;

	private String name;

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

	public Label idpCode(String idpCode) {
		this.idpCode = idpCode;
		return this;
	}

	public void setIdpCode(String idpCode) {
		this.idpCode = idpCode;
	}

	public String getName() {
		return name;
	}

	public Label name(String name) {
		this.name = name;
		return this;
	}

	public void setName(String name) {
		this.name = name;
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
		Label label = (Label) o;
		if (label.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), label.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Label{" + "id=" + getId() + ", idpCode='" + getIdpCode() + "'" + ", name='" + getName() + "'" + "}";
	}
}

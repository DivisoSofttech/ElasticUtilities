package com.diviso.graeshoppe.domain;

import java.util.Objects;

/**
 * A Banner.
 */

public class Banner {

	private Long id;

	private String fileLink;

	public Long getId() {

		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public String getFileLink() {
		return fileLink;
	}

	public Banner fileLink(String fileLink) {
		this.fileLink = fileLink;
		return this;
	}

	public void setFileLink(String fileLink) {
		this.fileLink = fileLink;
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
		Banner banner = (Banner) o;
		if (banner.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), banner.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Banner{" + "id=" + getId() + ",  fileLink='" + getFileLink()
				+ "'" + "}";
	}
}

package com.diviso.graeshoppe.domain;

import java.util.Objects;

/**
 * A Banner.
 */

public class Banner {

	private Long id;

	private byte[] file;

	private String fileContentType;

	public Long getId() {

		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public byte[] getFile() {
		return file;
	}

	public Banner file(byte[] file) {
		this.file = file;
		return this;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public Banner fileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
		return this;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
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
		return "Banner{" + "id=" + getId() + ", file='" + getFile() + "'" + ", fileContentType='" + getFileContentType()
				+ "'" + "}";
	}
}

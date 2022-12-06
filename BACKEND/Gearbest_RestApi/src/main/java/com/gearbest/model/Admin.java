package com.gearbest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer adminId;

	@Column(unique = true)
	private String adminMobile;

	@Column(unique = true)
	private String adminEmail;

	@NotEmpty(message = "field cannot be empty")
	@NotNull(message = "field cannot be null")
	@Size(max = 10)
	private String adminPassword;

	public Integer getAdminId() {
		return adminId;
	}

	public String getAdminMobile() {
		return adminMobile;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

}

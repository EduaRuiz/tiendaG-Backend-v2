package com.tiendaGBackendv2.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long idCard;
	
	private String name;
	private String email;
	private String sucursal;
	private String role;
	private boolean status;
	private String password;
	private String user;

	public Usuario() {
	}

	public Usuario(Long idCard, String name, String email, String sucursal, String role, boolean status, String password,
			String user) {
		this.idCard = idCard;
		this.name = name;
		this.email = email;
		this.sucursal = sucursal;
		this.role = role;
		this.status = status;
		this.password = password;
		this.user = user;
	}

	public Long getIdCard() {
		return this.idCard;
	}

	public void setIdCard(Long idCard) {
		this.idCard = idCard;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isStatus() {
		return this.status;
	}

	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}
}
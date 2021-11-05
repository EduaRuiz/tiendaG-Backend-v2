package com.tiendaGBackendv2.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String _id;
	private String name;
	private long identification;
	private String email;
	private String password;
	private String user;
	private String rol;
	private boolean status;

	public Usuario() {
	}

	public Usuario(String name, long identification, String email, String password, String user, String rol,
			boolean status) {
		super();
		this.name = name;
		this.identification = identification;
		this.email = email;
		this.password = password;
		this.user = user;
		this.rol = rol;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getIdentification() {
		return identification;
	}

	public void setIdentification(long identification) {
		this.identification = identification;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
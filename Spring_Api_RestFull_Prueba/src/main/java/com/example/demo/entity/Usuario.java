package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name = "Id",unique = true)
	private int id;
	
	@Column(name = "Usuario",unique = true)
	private String usuario;
	
	@Column(name = "Clave")
	private String clave;
	
	@Column(name = "Rol")
	private byte rol;
	
	@Column(name = "Activo")
	private boolean activo;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public byte getRol() {
		return rol;
	}
	public void setRol(byte rol) {
		this.rol = rol;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
}

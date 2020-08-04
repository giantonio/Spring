package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Prueba")
public class Prueba implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id;
	
	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "Comentario")
	private String comentario;
	
	public Prueba() {
		
	}

	public Prueba(int id, String nombre,String comentario) {
		this.id = id;
		this.nombre = nombre;
		this.comentario=comentario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getComentario() {
		return comentario;
	}
	
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}

package entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Nota")
public class Nota {
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private long id;
	
	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "Titulo")
	private String titulo;
	
	@Column(name = "Contenido")
	private String contenido;

	public Nota() {
		super();
	}

	public Nota(long id, String nombre, String titulo, String contenido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.titulo = titulo;
		this.contenido = contenido;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

}

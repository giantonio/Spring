package es.pildoras.spring.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import org.springframework.lang.NonNull;

public class Alumno {

	@NonNull
	@Size(min = 2, message = "Campo requerido")
	private String nombre;
	private String apellido;
	@Min(value=10, message = "No se permiten edades merones de 10")
	@Max(value = 100, message = "No se permiten edades mayores de 200")
	private int edad;
	
	@Email
	private String email; 
	private String optativas;
	private String sexo;
	private String montaña;
	private String ciudadEstudios;
	private String tipoTransporte;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	private String idiomaAlumno;

	public String getIdiomaAlumno() {
		return idiomaAlumno;
	}

	public void setIdiomaAlumno(String idiomaAlumno) {
		this.idiomaAlumno = idiomaAlumno;
	}

	public String getTipoTransporte() {
		return tipoTransporte;
	}

	public void setTipoTransporte(String tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}

	public String getCiudadEstudios() {
		return ciudadEstudios;
	}

	public void setCiudadEstudios(String ciudadEstudios) {
		this.ciudadEstudios = ciudadEstudios;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getOptativas() {
		return optativas;
	}

	public void setOptativas(String optativas) {
		this.optativas = optativas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}

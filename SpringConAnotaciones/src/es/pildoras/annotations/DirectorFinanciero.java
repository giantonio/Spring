package es.pildoras.annotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {
	
	/**
	 * Importante: El nombre de las propiedades del Objeto puede coincidir con el nombre de las variables de nuestro archivo de configuracion 
	 */
	
	@Value("${email}")
	private String email;
	@Value("${nombre}")
	private String nombreEmpresa;

	//variable encapsulada que se encargará de la inyección de dependencias
	private CreacionInformeFinanciero informeFinanciero;

	//Inyeccion mediante constructor
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion y Direccion de las operaciones financieras de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}

	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

}

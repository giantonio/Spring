package es.pildoras.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//Con @PostConstruct y @PreDestroy, no nos aseguramos todos los niveles del ciclo de vida del beans
//@Scope("prototype")
public class ComercialExperimentado implements Empleados {

	@Autowired
	@Qualifier("informeFinancieroTrim4") //bean Id que deben utilziar
	public CreacionInformeFinanciero informefinanciero;
		
	@PostConstruct
	//ejecucion del codigo antes de llamar a spring
	public void ejecutaEnCreacion() {
		//System.out.println("Se ejecuta antes de iniciar el beans");
	}
	
	@PreDestroy
	//ejecucion del codigo despues de llamar a spring
	public void ejecutaDespuesCreacion() {
		//System.out.println("Se ejecuta tras destruirse el beans");
	}
	
	public ComercialExperimentado() {

	}
	/*
	 * @Autowired public void setInformefinanciero(CreacionInformeFinanciero
	 * informefinanciero) { this.informefinanciero = informefinanciero; }
	 */		

	/*
	 * public ComercialExperimentado(CreacionInformeFinanciero informefinanciero) {
	 * // TODO Auto-generated constructor stub this.informefinanciero =
	 * informefinanciero; }
	 */

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender más";
	}

	@Override
	public String getInforme() { // TODO Auto-generated method stub
		return informefinanciero.getInformeFinanciero();
		// "Esto es un informe generado por el comercial";
	}

}

package es.pildoras.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.pildoras.annotations")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {

	//El nombre del metodo se corresponde con el id del bean que se le solicita en la inyección
	//Definimos Bean para utilizar el objeto InformeFinanciero
	@Bean
	public InformeFinancieroDeptCompras informeFinancieroDeptCompras() {
		return new InformeFinancieroDeptCompras();
	}

	//Definimos Bean para director financiero e inyeccion de dependencias
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDeptCompras());
		//Este metodo recibe el nombre del beans en forma de id que hará lá inyección
	}

}

package es.pildoras.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cargar el xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		//pedir java annotacions
		Empleados antonio=contexto.getBean("comercialExperimentado",Empleados.class);
		
		//mostrar las tareas del objeto
		System.out.println(antonio.getInforme());
		
		System.out.println(antonio.getTareas());
		
		//cerrar el contexto
		contexto.close();				

	}

}

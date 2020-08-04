package es.pildoras.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotaciones2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// pedir java annotacions
		
		//AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		/*
		 * Empleados antonio = contexto.getBean("comercialExperimentado",
		 * Empleados.class);
		 * 
		 * Empleados lucia = contexto.getBean("comercialExperimentado",
		 * Empleados.class);
		 */
		/*
		 * if (antonio == lucia) { System.out.println("Apuntan a la misma direccion");
		 * System.out.println(antonio + "\n" + lucia); } else {
		 * System.out.println("No apuntan a la misma direccion");
		 * System.out.println(antonio + "\n" + lucia); }
		 */

		// mostrar las tareas del objeto
		// System.out.println(antonio.getInforme());

		// System.out.println(antonio.getTareas());

		// cerrar el contexto
		
		//1-Declaramos el contexto, que en este caso, será la clase EmpleadosConfig
		//AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		//2-Obtenemos el beans correspondiendo
		/*Empleados empleado=contexto.getBean("directorFinanciero",Empleados.class);
		
		System.out.println(empleado.getTareas()); 
		
		System.out.println(empleado.getInforme());	*/
		
		AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		DirectorFinanciero empleado=contexto.getBean("directorFinanciero",DirectorFinanciero.class);
		
		System.out.println(empleado.getEmail());
		
		System.out.println(empleado.getNombreEmpresa());
		
		contexto.close();

	}

}

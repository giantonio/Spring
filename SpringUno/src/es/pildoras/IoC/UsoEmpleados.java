package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String args[]) {

		// Creamos objetos de tipo empleado
		// Empleados empleado1=new DirectorEmpleado();

		// Mostramos sus tareas
		// System.out.println(empleado1.getTareas());

		// 1-Hay que crear un contexto general donde se declaren los beans (cargamos el
		// xml correspondiente)

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2-Pedimos los beans
		// Empleados juan = contexto.getBean("miEmpleado", Empleados.class);

		// 3-Utilizar el objeto
		/*
		 * System.out.println(juan.getTareas());
		 * 
		 * System.out.println(juan.getInforme());
		 */

		// SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado",
		// SecretarioEmpleado.class);

		//DirectorEmpleado directorEmpleado = contexto.getBean("miEmpleado", DirectorEmpleado.class);

		// System.out.println(maria.getTareas());

		// System.out.println(maria.getInforme());

		// System.out.println("Email: "+maria.getEmail()+" Empresa:
		// "+maria.getNombreEmpresa());
		
		DirectorEmpleado directorEmpleado = contexto.getBean("miEmpleado", DirectorEmpleado.class);

		System.out.println(directorEmpleado.getInforme());

		System.out.println(directorEmpleado.getTareas());

		System.out.println("Email: " + directorEmpleado.getEmail() + "Empresa: " + directorEmpleado.getNombreEmpresa());

		// Al cerrar el contexto hacemos que no se consuman recursos
		contexto.close();

	}

}

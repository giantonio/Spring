package es.pildoras.IoC;

import javax.xml.transform.Source;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoSinglentonPrototype {

	public static void main(String args[]) {

		// Cargamos el contexto
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");

		// peticion de beans al contenedor

		SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		SecretarioEmpleado pedro = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado angel = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado carlo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado belen = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(maria);
		
		System.out.println(pedro);
		
		System.out.println(angel);
		
		System.out.println(carlo);
		
		System.out.println(belen);
		
		//Ambos objetos apuntan al mismo objeto, utilizan por defecto singleton
	}

}

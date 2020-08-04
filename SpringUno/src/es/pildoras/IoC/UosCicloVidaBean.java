package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UosCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		Empleados juan = contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(juan.getInforme());
		
		contexto.close();
		
	}

}

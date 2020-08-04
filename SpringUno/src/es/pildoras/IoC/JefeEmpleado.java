package es.pildoras.IoC;

public class JefeEmpleado implements Empleados{
	
	private CreacionInformes informeNuevo;
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		// TODO Auto-generated constructor stub
		this.informeNuevo=informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestiono las cuestione relativas a los empleados de mi seccion";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe geneado por el Jefe con modificaciones :"+informeNuevo.getInforme();
	}

}

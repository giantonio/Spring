package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {

	// 1-Creacion de tipo CreacionInforme (interfaz)
	private CreacionInformes informeNuevo;

	private String email;
	private String nombreEmpresa;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	// 2-Creacion de constuctor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantiila de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creador por el director " + informeNuevo.getInforme();
	}
	
	//metodo init que ejecutara tareas antes del método init
	public void metodoInit() {
		System.out.println("Aqui irán las tareas antes de que el bean este listo");
	}
	
	//metodo detroy que ejecutara tareas despues de que el bean haya sigo utilizado
	public void metodoFin() {
		System.out.println("Aqui se ejecutaran las tareas depues de que el bean haya sigo utilizado");
	}

}

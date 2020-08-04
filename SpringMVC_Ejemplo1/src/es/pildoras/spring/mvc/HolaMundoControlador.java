package es.pildoras.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/principal")
public class HolaMundoControlador {

	// Primer metodo que muestra el formulario donde el usuario introducira la informacion
	@RequestMapping("/muestraformulario")//url que le dira al servidor que formulario debe mostrar
	public String muestraFormulario() {
		return "FormulariosAlumnos";
	}
	
	@RequestMapping("/respuestaFormulario")
	public String procesaFormulario() {
		return "FormularioAlumnosSpring";
	}
	
	@RequestMapping("/respuestaFormulario2")
	//public String procesoAuxiliar(HttpServletRequest request,Model model) {
	public String procesoAuxiliar(@RequestParam("nombreAlumno")String nombre,Model model) {	
		//String nombre=request.getParameter("nombreAlumno");
		
		nombre+=" es el mejor alumno";
		
		String mensaje_final="¿Quien es el mejor alumno?" + nombre;
		
		//agreramos la informacion al modelo
		model.addAttribute("mensajeClaro", mensaje_final);
				
		//Vista que devolvera al modelo
		return "FormularioAlumnosSpring"; 
	}
	
	
}

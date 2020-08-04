package es.pildoras.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@InitBinder
	public void miBinder(WebDataBinder binder) {
		
		StringTrimmerEditor recorta_espacios_blancos=new StringTrimmerEditor(true);
		
		binder.registerCustomEditor(String.class, recorta_espacios_blancos);
	}

	@RequestMapping("/muestraFormulario")
	public String muestraAlumno(Model modelo) {

		Alumno alumno = new Alumno();

		modelo.addAttribute("alumno", alumno);

		return "AlumnoRegistroFormulario";
	}

	@RequestMapping("/procesarFormulario")
	public String mostrarFormularioProcesado(@Valid @ModelAttribute("alumno") Alumno alumno,
			BindingResult resultadoValidacion) {

		if (resultadoValidacion.hasErrors()) {
			return "AlumnoRegistroFormulario";
		} else {
			return "FormularioConfirmacionRegistroAlumno";
		}

	}
}

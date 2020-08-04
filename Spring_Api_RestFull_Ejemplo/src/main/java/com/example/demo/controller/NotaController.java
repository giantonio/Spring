package com.example.demo.controller;

import java.awt.print.Pageable;
import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Nota;
import com.example.demo.model.MNota;
import com.example.demo.service.NotaService;

@RestController
@RequestMapping("/v1")
public class NotaController {

	@Autowired
	@Qualifier("servicio")
	private NotaService service;

	// insert element into database
	@PutMapping("/nota")
	public boolean agregarNota(@RequestBody @Valid Nota nota) {
		return service.crearNota(nota);
	}

	// update
	@PostMapping("/nota")
	public boolean actualizarNota(@RequestBody @Valid Nota nota) {
		return service.actualizarNota(nota);
	}

	@DeleteMapping("/nota/{id}/{nombre}")
	public boolean borrarNotaPor(@PathVariable("id") long id, @PathVariable("nombre") String nombre) {
		return service.borrarNota(nombre, id);
	}

	@GetMapping("/notas")
	public List<MNota> obtenerNotas() {
		return service.obtener();
	}
	
	@GetMapping("/notas/{titulo}")
	public List<MNota> obtenerNota(@PathVariable("titulo")String titulo) {
		return service.obtenerTitulo(titulo);
	}
	
	@GetMapping(value= "/notapageable")
	public List<MNota> obtenerPaginacion(Pageable pageable){
		return service.obtenerPorPaginacion(pageable);
	}

}

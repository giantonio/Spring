package com.example.demo.controller;

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

import com.example.demo.entity.Prueba;
import com.example.demo.service.PruebaService;

@RestController
@RequestMapping("/v1")
public class PruebaController {

	@Autowired
	@Qualifier("servicio")
	private PruebaService servicio;

	@PutMapping("/prueba")
	public boolean crearPrueba(@RequestBody @Valid Prueba prueba) {
		return servicio.agregarPrueba(prueba);
	}

	@PostMapping("/prueba")
	public boolean actualizarPrueba(@RequestBody @Valid Prueba prueba) {
		return servicio.actulizarPrueba(prueba);
	}

	@DeleteMapping("/prueba/{id}/{nombre}")
	public boolean deletePrueba(@PathVariable("id") int id, @PathVariable("nombre") String nombre) {
		return servicio.eliminarPrueba(nombre, id);
	}

	@GetMapping(value = "/listanotas")
	public List<Prueba> obtenerPrueba() {
		return servicio.obtenerListadoPruebas();
	}

}

package com.example.demo.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Prueba;
import com.example.demo.repository.PruebaRepositorio;

@Service("servicio")
public class PruebaService {
	
	private static final Log logg=LogFactory.getLog(PruebaService.class);
	
	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	@Qualifier("repositorio")
	private PruebaRepositorio repositorio;
	
	public boolean agregarPrueba(Prueba prueba) {
		
		try {
			repositorio.save(prueba);
			logg.info("Registro prueba insertado");
			return true;
		} catch (Exception e) {
			
			logg.info("Registro prueba erroneao");
			return false;
		}
		
	}
	
	public boolean actulizarPrueba(Prueba prueba) {
		
		try {
			repositorio.save(prueba);
			logg.info("Registro prueba actualizado");
			return true;
		} catch (Exception e) {
			logg.info("Registro prueba no se ha actualizado");
			return false;
		}
	}
	
	public boolean eliminarPrueba(String nombre,int id) {
		
		try {
			Prueba prueba=repositorio.findByNombreAndId(nombre,id);
			repositorio.delete(prueba);
			logg.info("Registro prueba eliminado");
			return true;
		} catch (Exception e) {
			logg.info("Registro prueba nos se ha podido eliminar:"+e.getCause());
			return true;
		}
	}
	
	public List<Prueba> obtenerListadoPruebas() {
		return repositorio.findAll();
	}

}

package com.example.demo.service;

import java.awt.print.Pageable;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.converter.NotasConverter;
import com.example.demo.entity.Nota;
import com.example.demo.model.MNota;
import com.example.demo.repository.INota;

@Service("servicio")
public class NotaService {

	// El met
	private static final Log logger = LogFactory.getLog(NotaService.class);

	@Autowired
	@Qualifier("repositorio")
	private INota notasRepo;

	@Autowired
	@Qualifier("convertidor")
	private NotasConverter convertidor;

	public boolean crearNota(Nota nota) {

		try {
			notasRepo.save(nota);
			logger.info("Nota creada");
			return true;
		} catch (Exception e) {
			logger.error("Hubo un error al crear la nota");
			return true;
		}
	}

	public boolean actualizarNota(Nota nota) {

		try {
			notasRepo.save(nota);
			return true;
		} catch (Exception e) {
			return true;
		}
	}

	/*
	 * public boolean borrarNota(Nota nota) {
	 * 
	 * try { notasRepo.findByNombreAndId(nombre, id); notasRepo.delete(nota); return
	 * true; } catch (Exception e) { return true; } }
	 */

	public boolean borrarNota(String nombre, long id) {
		logger.warn("Borrando nota");

		try {
			Nota nota = notasRepo.findByNombreAndId(nombre, id);
			notasRepo.delete(nota);
			return true;
		} catch (Exception e) {
			return true;
		}
	}

	public List<MNota> obtener() {
		return convertidor.convertirLista(notasRepo.findAll());
	}

	public MNota porNombreYTitulo(String nombre, String titulo) {

		return new MNota(notasRepo.findByNombreAndTitulo(nombre, titulo));
	}

	public List<MNota> obtenerTitulo(String titulo) {
		return convertidor.convertirLista(notasRepo.findByTitulo(titulo));
	}
	
	public List<MNota>obtenerPorPaginacion(Pageable pageable){
		return convertidor.convertirLista(notasRepo.findAll(pageable).getContent());
	}
}

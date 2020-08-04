package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Prueba;

@Repository("repositorio")
public interface PruebaRepositorio extends JpaRepository<Prueba, Serializable>{
	
	public Prueba findByNombreAndId(String nombre,int id);
	
	public Prueba findByNombre(String nombre);
	
	public Prueba findByComentario(String comentario);
	
	public List<Prueba> findById(int id);

}

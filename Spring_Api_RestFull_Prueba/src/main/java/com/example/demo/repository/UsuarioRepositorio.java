package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Usuario;

@Repository("usuario")
public interface UsuarioRepositorio extends JpaRepository<Usuario, Serializable>{
	
	public Usuario findByUsuario(String usuario);

}

package com.example.demo.configuration;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {

	// Agregamos una autentifiacion
	static void addAuthentication(HttpServletResponse res, String username) {

		String token = Jwts.builder().setSubject(username)

				// Asignamos un tiempo de expirtacion de 1 minuto

				// Hash con el que fimamos la clave
				.signWith(SignatureAlgorithm.HS512, "P@tit0").compact();

		// Agrepamos el encabezado al token
		res.addHeader("Authorizacion", "Bearer" + token);
	}

	static Authentication getAuthentication(HttpServletRequest request) {

		// Obtenemos el token que viene en el encabezado de la peticion
		String token = request.getHeader("Authorizacion");

		// Si hay un token, lo validamos
		if (token != null) {

			String user = Jwts.parser().setSigningKey("P@tit0").parseClaimsJws(token.replace("Bearer", ""))// Con este
																											// metodo
																											// validamos
					.getBody().getSubject();

			// Para las demas peticiones que no sean /login, no necesitamos autentificacion,
			// por lo que podemos delvolver un UserPassworAuthenticationToken sin clave
			return user != null ? new UsernamePasswordAuthenticationToken(user, null) : null;

		}
		return null;

	}

	/*
	 * private static Collection<? extends GrantedAuthority> emptyList() { // TODO
	 * Auto-generated method stub return null; }
	 */

}

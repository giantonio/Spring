package com.example.demo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.demo.service.UsuarioService;

@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

	@Autowired
	@Qualifier("usuarioservice")
	private UsuarioService ususervice;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(ususervice);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable().authorizeRequests().antMatchers("/login", "/prueba/all", "/v1/listanotas").permitAll() // permitir
																													// el
																													// acceso
																													// a
																													// /login
																													// a
																													// cualquier
																													// usuario
				.anyRequest().authenticated() // otros usuarios necesitan autentificacion
				.and().addFilterBefore(new LoginFilter("/login", authenticationManager()), // Las peticiones /login
																							// pasaran por eso filtro
						UsernamePasswordAuthenticationFilter.class)

				.addFilterBefore(new JwtFilter(), UsernamePasswordAuthenticationFilter.class);

	}

}

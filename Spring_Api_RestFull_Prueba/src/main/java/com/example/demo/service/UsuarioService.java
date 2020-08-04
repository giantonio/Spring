package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepositorio;

@Service("usuarioservice")
public class UsuarioService implements UserDetailsService {

	@Autowired
	@Qualifier("usuario")
	private UsuarioRepositorio usurepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Usuario user = usurepo.findByUsuario(username);

		return new User(user.getUsuario(), user.getClave(), user.isActivo(), user.isActivo(),user.isActivo(),user.isActivo(),
				buildGrande(user.getRol()));
	}

	public List<GrantedAuthority> buildGrande(byte rol) {
		
		String []roles= {"LECTOR","USUARIO","ADMINISTRADR"};
		List<GrantedAuthority>auths=new ArrayList<GrantedAuthority>();
		
		for (int i = 0; i < roles.length; i++) {
			auths.add(new SimpleGrantedAuthority(roles[i]));
		}
		
		return auths;
	}

}

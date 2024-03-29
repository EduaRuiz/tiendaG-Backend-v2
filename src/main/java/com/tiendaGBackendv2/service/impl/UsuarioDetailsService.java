package com.tiendaGBackendv2.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tiendaGBackendv2.model.Usuario;
import com.tiendaGBackendv2.service.api.UsuarioServiceApi;

@Service("UsuarioDetailsService")
public class UsuarioDetailsService implements UserDetailsService{
	
	@Autowired
	private UsuarioServiceApi usuarioServiceApi;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<Usuario> usuarios = usuarioServiceApi.getAll();
		for(Usuario i:usuarios) {
			if(i.getUser().equals(username)) {
				Usuario usuario = i;
				Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
				System.out.println("___________________________1");				
				System.out.println("___________________________1");				
				authorities.add(new SimpleGrantedAuthority(usuario.getRole()));
				return new User(username, usuario.getPassword(), authorities);				
			}
		}		
		return null;
	}
}
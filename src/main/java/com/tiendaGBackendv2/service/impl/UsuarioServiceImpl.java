package com.tiendaGBackendv2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.tiendaGBackendv2.commons.GenericServiceImpl;
import com.tiendaGBackendv2.dao.api.UsuarioRepository;
import com.tiendaGBackendv2.model.Usuario;
import com.tiendaGBackendv2.service.api.UsuarioServiceApi;

@Service
public class UsuarioServiceImpl extends GenericServiceImpl<Usuario, Long> implements UsuarioServiceApi {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	protected CrudRepository<Usuario, Long> getDao() {
		return usuarioRepository;
	}
}
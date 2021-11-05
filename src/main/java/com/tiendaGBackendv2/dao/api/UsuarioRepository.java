package com.tiendaGBackendv2.dao.api;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tiendaGBackendv2.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
}
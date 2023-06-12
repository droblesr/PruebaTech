package com.mx.oauth.service;

import com.mx.oauth.dtos.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String nombre);

}

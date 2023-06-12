package com.mx.oauth.clients;

import org.springframework.stereotype.Service;

import com.mx.oauth.dtos.Usuario;

@Service
public class UsuarioFeignClient {

	public Usuario findByUsername(String username) {
		System.out.println("Usuario por loguear: "+username);
		
		Usuario user = new Usuario();
		
		user.setApellido("PruebaApellido");
		user.setNombre("ADMIN");
		user.setUsername("ADMIN");
		user.setId(1L);
		user.setEmail("admin@hotmail.com");
		user.setPassword("$2a$10$NIOgte5A2TBZ9BxfQ2KCeeXzbckPBZbOdpbfh9Qtg6R8dy4P9wqi6");
		user.setEnabled(true);
		
		if( user.getNombre().equals(username) ) {
			return user;
		}
		
		return null;
	}

}

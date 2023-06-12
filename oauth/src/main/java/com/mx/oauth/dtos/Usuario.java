package com.mx.oauth.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario implements Serializable{
	
	public Usuario() {
		roles = new ArrayList<Role>();
		Role role = new Role();
		role.setId(1L);
		role.setNombre("ADMIN");
		roles.add(role);
	}
	
	private Long id;
	
	private String username;
	
	private String password;
	private Boolean enabled;
	private String nombre; 
	private String apellido;
	private String email;
	private List<Role> roles;
	
	private static final long serialVersionUID = -6434487552594943516L;
}

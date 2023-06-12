package com.mx.oauth.dtos;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Role implements Serializable{

	private Long id;
	private String nombre;
	
	private static final long serialVersionUID = 2132936842392539601L;

}

package com.mx.Cursos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_alumnos")
@Getter
@Setter
public class Alumnos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_t_usuarios")
	private Long id;
	private String nombre;
	@Column(name = "ap_paterno")
	private String apPaterno;
	@Column(name = "ap_materno")
	private String apMaterno;
	private Boolean activo;
}

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
@Table(name = "t_materias")
@Getter
@Setter
public class Materias {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_t_materias")
	private Long id;
	private String nombre;
	private Boolean activo;
}

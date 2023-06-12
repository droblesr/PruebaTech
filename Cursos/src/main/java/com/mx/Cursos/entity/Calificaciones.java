package com.mx.Cursos.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_calificaciones")
@Getter
@Setter
public class Calificaciones {
	
	@Id
	@SequenceGenerator(name="t_calificaciones_id_t_calificaciones_seq", sequenceName="t_calificaciones_id_t_calificaciones_seq", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="t_calificaciones_id_t_calificaciones_seq")
	@Column(name = "id_t_calificaciones")
	private Long id;
	@OneToOne
    @JoinColumn(name="id_t_usuarios", nullable=true)
	private Alumnos alumno;
	@OneToOne
    @JoinColumn(name="id_t_materias", nullable=true)
	private Materias materia;
	
	private Double calificacion;
	
	@Basic
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_registro")
	private Date fechaRegistro;
}
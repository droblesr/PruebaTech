package com.mx.Cursos.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalificacionDTO {
	private Long idCalificacion;
	private Long idAlumno;
	private Long idMateria;
	private Double calificacion;
	private String fechaRegistro;
	private String materia;
}

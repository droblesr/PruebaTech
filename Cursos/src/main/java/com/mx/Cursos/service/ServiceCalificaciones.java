package com.mx.Cursos.service;

import java.util.List;

import com.mx.Cursos.dto.CalificacionDTO;
import com.mx.Cursos.dto.ResponseDTO;

public interface ServiceCalificaciones {
	public ResponseDTO registro(CalificacionDTO calificacion);
	public ResponseDTO<List<CalificacionDTO>> listar(Long idAlumno) ;
	public ResponseDTO update(CalificacionDTO calificacion);
	public ResponseDTO delete(Long idCalificacion);
}

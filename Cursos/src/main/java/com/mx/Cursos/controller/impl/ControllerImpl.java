package com.mx.Cursos.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Cursos.controller.Controller;
import com.mx.Cursos.dto.CalificacionDTO;
import com.mx.Cursos.dto.ResponseDTO;
import com.mx.Cursos.service.ServiceCalificaciones;

@RestController
public class ControllerImpl implements Controller {

	@Autowired
	public ServiceCalificaciones serviceCalificaciones; 
	
	@Override
	public ResponseEntity<ResponseDTO> registro(CalificacionDTO calificacion) {
		return ResponseEntity.ok(serviceCalificaciones.registro(calificacion));
	}

	@Override
	public ResponseEntity<ResponseDTO<List<CalificacionDTO>>> listar(Long idAlumno) {
		return ResponseEntity.ok(serviceCalificaciones.listar(idAlumno));
	}

	@Override
	public ResponseEntity<ResponseDTO> update(CalificacionDTO calificacion) {
		return ResponseEntity.ok(serviceCalificaciones.update(calificacion));
	}

	@Override
	public ResponseEntity<ResponseDTO> delete(Long idCalificacion) {
		return ResponseEntity.ok(serviceCalificaciones.delete(idCalificacion));
	}

}

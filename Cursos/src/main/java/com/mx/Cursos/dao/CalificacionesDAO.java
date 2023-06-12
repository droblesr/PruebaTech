package com.mx.Cursos.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Cursos.entity.Alumnos;
import com.mx.Cursos.entity.Calificaciones;

public interface CalificacionesDAO extends JpaRepository<Calificaciones, Long> {
	Set<Calificaciones> findByAlumno(Alumnos alumno);
}

package com.mx.Cursos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Cursos.entity.Alumnos;

public interface AlumnosDAO extends JpaRepository<Alumnos, Long> {

}

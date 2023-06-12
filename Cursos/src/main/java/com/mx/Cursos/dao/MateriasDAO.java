package com.mx.Cursos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Cursos.entity.Materias;

public interface MateriasDAO extends JpaRepository<Materias, Long> {

}

package com.example.rocketa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rocketa.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

	Categoria findByCodigo(Long codigo);



	
	
	

}

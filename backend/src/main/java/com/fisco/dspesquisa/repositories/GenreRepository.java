package com.fisco.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fisco.dspesquisa.entities.Game;

public interface GenreRepository extends JpaRepository<Game, Long> {
	
	

}

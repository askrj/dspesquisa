package com.fisco.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fisco.dspesquisa.entities.Game;

@Repository
public interface GenreRepository extends JpaRepository<Game, Long> {
	
	

}

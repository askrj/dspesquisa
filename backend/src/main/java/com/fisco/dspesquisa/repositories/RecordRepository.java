package com.fisco.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fisco.dspesquisa.entities.Game;

public interface RecordRepository extends JpaRepository<Game, Long> {
	
	

}

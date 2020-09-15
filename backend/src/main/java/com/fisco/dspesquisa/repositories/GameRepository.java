package com.fisco.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fisco.dspesquisa.entities.Record;

public interface GameRepository extends JpaRepository<Record, Long> {
	
	

}

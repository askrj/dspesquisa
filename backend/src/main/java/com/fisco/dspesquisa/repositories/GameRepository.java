package com.fisco.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fisco.dspesquisa.entities.Record;

@Repository
public interface GameRepository extends JpaRepository<Record, Long> {
	
	

}

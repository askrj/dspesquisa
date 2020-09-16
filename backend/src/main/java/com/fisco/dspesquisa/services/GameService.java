package com.fisco.dspesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fisco.dspesquisa.dto.GameDTO;
import com.fisco.dspesquisa.entities.Game;
import com.fisco.dspesquisa.entities.Record;
import com.fisco.dspesquisa.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameDTO> findAll(){
		
		List<Game> list = repository.findAll();
		return list.stream().map(x -> new GameDTO()).collect(Collectors.toList());
	}
	

}

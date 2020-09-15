package com.fisco.dspesquisa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisco.dspesquisa.dto.GameDTO;
import com.fisco.dspesquisa.entities.Record;
import com.fisco.dspesquisa.services.GameService;


@RestController
@RequestMapping(value = "/games")
public class GameResource {
	
	@Autowired
    private GameService service;
	
	@GetMapping
	public ResponseEntity<List<GameDTO>> findAll(){
		List<GameDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}

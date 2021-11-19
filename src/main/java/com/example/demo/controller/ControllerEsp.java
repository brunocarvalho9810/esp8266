package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DataEsp;
import com.example.demo.DataEspDTO;
import com.example.demo.RepositoryEsp;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/esp")
@AllArgsConstructor
public class ControllerEsp {
	
	@Autowired
	final RepositoryEsp repository;
	
	@PostMapping("/save")
	ResponseEntity<DataEsp> salveData(@RequestBody DataEspDTO dto){
		DataEsp entity = new DataEsp(dto);
		return ResponseEntity.ok().body(repository.save(entity));
	}
		
}

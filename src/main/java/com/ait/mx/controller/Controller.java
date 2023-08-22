package com.ait.mx.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ait.mx.dto.MyResponseDTO;

@RestController
public class Controller {
	
	@GetMapping("/saludo")
	public ResponseEntity<MyResponseDTO> getsaludo(){
		return new ResponseEntity<>(new MyResponseDTO("SALUDO","OK"),HttpStatus.OK);
	}

}

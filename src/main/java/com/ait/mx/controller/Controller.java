package com.ait.mx.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ait.mx.dto.MyResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class Controller {
	
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

	
	@GetMapping("/saludo")
	public ResponseEntity<MyResponseDTO> getsaludo(){
		logger.info("estamos probando este nuevo pa ver que pex");
		return new ResponseEntity<>(new MyResponseDTO("SALUDO","OK"),HttpStatus.OK);
	}

}

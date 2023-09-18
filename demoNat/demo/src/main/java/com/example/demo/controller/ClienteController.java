package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.entity.Cliente;
import com.example.demo.services.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired
	ClienteService clienteService;
	
	@PostMapping("/add")
//	@ResponseBody
	public ResponseEntity <Cliente> saveCliente(@RequestBody Cliente cliente){
//		clienteService.crearCliente(cliente);
//		return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
		Cliente saveCliente = clienteService.crearCliente(cliente);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveCliente);
	}
	
}

package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prueba")
public class ClienteRest {
	
	@GetMapping("/all")
	public String devolverTodas() {
		return "template";
	}
	
	@GetMapping("/all1")
	public String todas() {
		return "template1"; 	}

}

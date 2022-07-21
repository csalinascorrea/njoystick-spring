package net.njoystick.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.njoystick.springboot.model.Plataforma;
import net.njoystick.springboot.repository.PlataformaRepository;

@CrossOrigin(origins= "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class PlataformaController {

	@Autowired
	private PlataformaRepository plataformaRepository;
	
	@GetMapping("/plataformas")
	public List<Plataforma> getAllPlataformas(){
		return plataformaRepository.findAll();
	}
}

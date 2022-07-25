package net.njoystick.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.njoystick.springboot.model.Genero;
import net.njoystick.springboot.repository.GeneroRepository;

@CrossOrigin(origins= "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class GeneroController {

	@Autowired
	private GeneroRepository generoRepository;
	
	@GetMapping("/generos")
	public List<Genero> getAllGeneros(){
		return generoRepository.findAll();
	}
	
	@PostMapping("/generos")
	public Genero createGenero(@RequestBody Genero genero) {
		return generoRepository.save(genero);
	}
	
}

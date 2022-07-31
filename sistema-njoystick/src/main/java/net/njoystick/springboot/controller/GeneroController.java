package net.njoystick.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import net.njoystick.springboot.model.Genero;
import net.njoystick.springboot.service.GeneroService;

@CrossOrigin(origins= "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class GeneroController {

	@Autowired
	private GeneroService generoService;
	
	@GetMapping("/generos")
	public List<Genero> getAllGeneros(){
		return generoService.findAll();
	}
	
	@PostMapping("/generos")
	@ResponseStatus(HttpStatus.CREATED)
	public Genero createGenero(@RequestBody Genero genero) {
		return generoService.save(genero);
	}
	
	@DeleteMapping("/generos{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		generoService.delete(id);
	}
	
	
}

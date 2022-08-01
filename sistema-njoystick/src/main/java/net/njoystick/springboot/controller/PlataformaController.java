package net.njoystick.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import net.njoystick.springboot.model.Plataforma;
import net.njoystick.springboot.service.PlataformaService;

@CrossOrigin(origins= "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class PlataformaController {

	@Autowired
	private PlataformaService plataformaService;
	
	@GetMapping("/plataformas")
	public List<Plataforma> getAllPlataformas(){
		return plataformaService.findAll();
	}
	
	@PostMapping("/plataformas")
	@ResponseStatus(HttpStatus.CREATED)
	public Plataforma createPlataforma(@RequestBody Plataforma plataforma) {
		return plataformaService.save(plataforma);
		
	}
	
	@GetMapping("/plataformas/{id}")
	public Plataforma showPlataforma(@PathVariable Long id) {
		return plataformaService.findById(id);
	}
	
	@PutMapping("/plataformas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Plataforma updatePlataforma(@RequestBody Plataforma plataforma, @PathVariable Long id) {
		Plataforma plataformaActual= plataformaService.findById(id);
		plataformaActual.setNombrePlataformas(plataforma.getNombrePlataformas());
		plataformaActual.setDescripcionPlataformas(plataforma.getDescripcionPlataformas());
		return plataformaService.save(plataformaActual);
	}
	@DeleteMapping("/plataformas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		plataformaService.delete(id);
	}
}

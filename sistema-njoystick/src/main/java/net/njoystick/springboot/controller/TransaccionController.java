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

import net.njoystick.springboot.model.Transaccion;
import net.njoystick.springboot.service.TransaccionService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class TransaccionController {

	@Autowired
	private TransaccionService transaccionService;

	@GetMapping("/transacciones")
	public List<Transaccion> getAllTransacciones(){
		return transaccionService.findAll();
	}
	
	@PostMapping("/transacciones")
	@ResponseStatus(HttpStatus.CREATED)
	//Claramente esta logica debe cambiar
	public Transaccion createTransaccion(@RequestBody Transaccion transaccion) {
		return transaccionService.save(transaccion);
	}
	
	@DeleteMapping("/transacciones{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		transaccionService.delete(id);
	}
}

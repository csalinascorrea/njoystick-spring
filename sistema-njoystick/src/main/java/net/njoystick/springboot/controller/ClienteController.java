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

import net.njoystick.springboot.model.Cliente;
import net.njoystick.springboot.service.ClienteService;

@CrossOrigin(origins= "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> getAllClientes(){
		return clienteService.findAll();
	}
	
	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}
	
	@DeleteMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clienteService.delete(id);
	}

}

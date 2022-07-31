package net.njoystick.springboot.service;
import java.util.List;

import net.njoystick.springboot.model.Cliente;

public interface ClienteService {
	public List<Cliente> findAll();
	public Cliente findById(Long id);
	public Cliente save(Cliente cliente);
	public void delete(Long id);
}

package net.njoystick.springboot.service;
import java.util.List;

import net.njoystick.springboot.model.Producto;

public interface ProductoService {
	public List<Producto> findAll();
	public Producto findById(Long id);
	public Producto save(Producto producto);
	public void delete(Long id);
}

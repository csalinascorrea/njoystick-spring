package net.njoystick.springboot.service;
import java.util.List;

import net.njoystick.springboot.model.Transaccion;
public interface TransaccionService {
	public List<Transaccion> findAll();
	public Transaccion findById(Long id);
	public Transaccion save(Transaccion transaccion);
	public void delete(Long id);
}

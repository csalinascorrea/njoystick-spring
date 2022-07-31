package net.njoystick.springboot.service;
import java.util.List;

import net.njoystick.springboot.model.Plataforma;

public interface PlataformaService {
	public List<Plataforma> findAll();
	public Plataforma findById(Long id);
	public Plataforma save(Plataforma plataforma);
	public void delete(Long id);
}

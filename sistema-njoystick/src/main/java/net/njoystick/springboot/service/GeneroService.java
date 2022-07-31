package net.njoystick.springboot.service;
import java.util.List;

import net.njoystick.springboot.model.Genero;

public interface GeneroService {

	public List<Genero>findAll();
	public Genero findById(Long id);
	public Genero save(Genero genero);
	public void delete(Long id);
}

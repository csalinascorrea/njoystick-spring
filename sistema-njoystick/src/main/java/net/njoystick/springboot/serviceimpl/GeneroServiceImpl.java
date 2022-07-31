package net.njoystick.springboot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.njoystick.springboot.model.Genero;
import net.njoystick.springboot.repository.GeneroRepository;
import net.njoystick.springboot.service.GeneroService;

@Service
public class GeneroServiceImpl implements GeneroService{

	@Autowired
	private GeneroRepository generoRepository;
	
	@Override
	@Transactional(readOnly=true)
	public List<Genero> findAll() {
		return (List<Genero>)generoRepository.findAll();
	}

	@Override
	public Genero findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Genero save(Genero genero) {
		return generoRepository.save(genero);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		generoRepository.deleteById(id);
		
	}

}

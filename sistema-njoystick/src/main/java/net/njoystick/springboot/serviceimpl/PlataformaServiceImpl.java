package net.njoystick.springboot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.njoystick.springboot.model.Plataforma;
import net.njoystick.springboot.repository.PlataformaRepository;
import net.njoystick.springboot.service.PlataformaService;

@Service
public class PlataformaServiceImpl implements PlataformaService{

	@Autowired
	private PlataformaRepository plataformaRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Plataforma> findAll() {
		return (List<Plataforma>) plataformaRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Plataforma findById(Long id) {
		return plataformaRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Plataforma save(Plataforma plataforma) {
		return plataformaRepository.save(plataforma);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		plataformaRepository.deleteById(id);
		
	}

}

package net.njoystick.springboot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.njoystick.springboot.model.Transaccion;
import net.njoystick.springboot.repository.TransaccionRepository;
import net.njoystick.springboot.service.TransaccionService;

@Service
public class TransaccionServiceImpl implements TransaccionService{

	@Autowired
	private TransaccionRepository transaccionRepository;
	
	@Override
	@Transactional(readOnly= true)
	public List<Transaccion> findAll() {
		return (List<Transaccion>) transaccionRepository.findAll();
	}

	@Override
	public Transaccion findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Transaccion save(Transaccion transaccion) {
		return transaccionRepository.save(transaccion);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		transaccionRepository.deleteById(id);
	}

}

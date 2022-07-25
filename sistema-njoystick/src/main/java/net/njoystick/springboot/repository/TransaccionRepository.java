package net.njoystick.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.njoystick.springboot.model.Transaccion;

public interface TransaccionRepository extends JpaRepository<Transaccion, Long>{

}

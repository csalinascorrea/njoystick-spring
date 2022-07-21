package net.njoystick.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.njoystick.springboot.model.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long> {

}

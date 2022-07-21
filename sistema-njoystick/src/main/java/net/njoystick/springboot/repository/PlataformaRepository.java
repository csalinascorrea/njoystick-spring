package net.njoystick.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.njoystick.springboot.model.Plataforma;

@Repository
public interface PlataformaRepository extends JpaRepository<Plataforma, Long>{

}

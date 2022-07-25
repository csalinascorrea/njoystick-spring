package net.njoystick.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.njoystick.springboot.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}

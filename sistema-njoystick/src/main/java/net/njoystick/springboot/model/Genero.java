package net.njoystick.springboot.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "generos")
public class Genero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idGeneros;
	
	@Column(name= "nombreGeneros")
	private String nombreGeneros;
	@Column(name= "descripcionGeneros")
	private String descripcionGeneros;
	
//	@OneToMany(mappedBy="genero")
//	private List<GeneroProducto> productos;
	
	public Genero () {
		
	}
	public long getIdGeneros() {
		return idGeneros;
	}
	public void setIdGeneros(long idGeneros) {
		this.idGeneros = idGeneros;
	}
	public Genero(String nombreGeneros, String descripcionGeneros) {
		super();
		this.nombreGeneros = nombreGeneros;
		this.descripcionGeneros = descripcionGeneros;
	}
	public String getNombreGeneros() {
		return nombreGeneros;
	}
	public void setNombreGeneros(String nombreGeneros) {
		this.nombreGeneros = nombreGeneros;
	}
	public String getDescripcionGeneros() {
		return descripcionGeneros;
	}
	public void setDescripcionGeneros(String descripcionGeneros) {
		this.descripcionGeneros = descripcionGeneros;
	}
//	public void addProducto(Producto producto) {
//		GeneroProducto generoProducto = new GeneroProducto(this, producto);
//		productos.add(generoProducto);
//		producto.getGeneros().add(generoProducto);
//	}
//
//	public void removeProducto(Producto producto) {
//		GeneroProducto generoProducto = new GeneroProducto(this, producto);
//		producto.getGeneros().remove(generoProducto);
//		productos.remove(generoProducto);
//		generoProducto.setGenero(null);
//		generoProducto.setProducto(null);
//	}

}

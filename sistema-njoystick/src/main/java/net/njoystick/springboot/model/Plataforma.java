package net.njoystick.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name= "plataformas")
public class Plataforma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPlataformas;
	
	@Column(name = "nombrePlataformas")
	private String nombrePlataformas;
	@Column(name = "descripcionPlataformas")
	private String descripcionPlataformas;
	
	@ManyToOne
	@JoinColumn(name="idProductos")
	private Producto producto;
	
	public Plataforma() {
		
	}
	public Plataforma(String nombrePlataformas, String descripcionPlataformas) {
		super();
		this.nombrePlataformas = nombrePlataformas;
		this.descripcionPlataformas = descripcionPlataformas;
	}
	public long getIdPlataformas() {
		return idPlataformas;
	}
	public void setIdPlataformas(long idPlataformas) {
		this.idPlataformas = idPlataformas;
	}
	public String getNombrePlataformas() {
		return nombrePlataformas;
	}
	public void setNombrePlataformas(String nombrePlataformas) {
		this.nombrePlataformas = nombrePlataformas;
	}
	public String getDescripcionPlataformas() {
		return descripcionPlataformas;
	}
	public void setDescripcionPlataformas(String descripcionPlataformas) {
		this.descripcionPlataformas = descripcionPlataformas;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
		
	
}

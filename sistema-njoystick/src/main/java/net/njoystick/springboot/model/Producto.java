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
@Table(name= "productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProductos;
	
	@Column(name= "nombreProductos")
	private String nombreProductos;
	@Column(name= "descripcionProductos")
	private String descripcionProductos;
	@Column(name= "precioProductos")
	private int precioProductos;

	@Column(name= "stockProductos")
	private int stockProductos;
	
	@OneToMany(mappedBy = "producto")
	private List<Plataforma> plataformas;
	
	public Producto () {
		
	}

		


	public Producto(String nombreProductos, String descripcionProductos, int precioProductos, int stockProductos) {
		super();
		this.nombreProductos = nombreProductos;
		this.descripcionProductos = descripcionProductos;
		this.precioProductos = precioProductos;
		this.stockProductos = stockProductos;
		
	}



	public long getIdProductos() {
		return idProductos;
	}

	public void setIdProductos(long idProductos) {
		this.idProductos = idProductos;
	}

	public String getNombreProductos() {
		return nombreProductos;
	}

	public void setNombreProductos(String nombreProductos) {
		this.nombreProductos = nombreProductos;
	}

	public String getDescripcionProductos() {
		return descripcionProductos;
	}

	public void setDescripcionProductos(String descripcionProductos) {
		this.descripcionProductos = descripcionProductos;
	}

	public int getPrecioProductos() {
		return precioProductos;
	}

	public void setPrecioProductos(int precioProductos) {
		this.precioProductos = precioProductos;
	}

	public int getStockProductos() {
		return stockProductos;
	}

	public void setStockProductos(int stockProductos) {
		this.stockProductos = stockProductos;
	}
	
	public void addPlataforma(Plataforma plataforma) {
		plataformas.add(plataforma);
		plataforma.setProducto(this);
	}
	public void removePlataforma(Plataforma plataforma) {
		plataformas.remove(plataforma);
		plataforma.setProducto(null);
	}




//	public List<GeneroProducto> getGeneros() {
//		// TODO Auto-generated method stub
//		return null;
//	}


	
	
}

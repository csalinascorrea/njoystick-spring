package net.njoystick.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long idClientes;
	@Column(name="nombreClientes")
	private String nombreClientes;
	@Column(name="contactoClientes")
	private String contactoClientes;
	
	
	public Cliente() {
		
	}
	
	
	public Cliente(String nombreClientes, String contactoClientes) {
		super();
		this.nombreClientes = nombreClientes;
		this.contactoClientes = contactoClientes;
	}


	public long getIdClientes() {
		return idClientes;
	}
	public void setIdClientes(int idClientes) {
		this.idClientes = idClientes;
	}
	public String getNombreClientes() {
		return nombreClientes;
	}
	public void setNombreClientes(String nombreClientes) {
		this.nombreClientes = nombreClientes;
	}
	public String getContactoClientes() {
		return contactoClientes;
	}
	public void setContactoClientes(String contactoClientes) {
		this.contactoClientes = contactoClientes;
	}
	
	
	
}

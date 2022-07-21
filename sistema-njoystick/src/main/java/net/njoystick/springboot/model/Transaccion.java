package net.njoystick.springboot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transacciones")
public class Transaccion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idTransacciones;
	@Column(name="tipoTransacciones")
	private String tipoTransacciones;
	@Column(name="comentarioTransacciones")
	private String comentarioTransacciones;
	@Column(name="fechaTransacciones")
	private Date fechaTransacciones;
	@Column(name="descuentoTransacciones")
	private int descuentoTransacciones;
	@Column(name="totalTransacciones")
	private int totalTransacciones;
	@Column(name="formaPagoTransacciones")
	private String formaPagoTransacciones;
	@Column(name="plazoTransacciones")
	private Date plazoTransacciones;
	@Column(name="estadoTransacciones")
	private String estadoTransacciones;
	
	
	//private Cliente cliente;
	
	public Transaccion() {
		
	}

	public Transaccion(String tipoTransacciones, String comentarioTransacciones, Date fechaTransacciones,
			int descuentoTransacciones, int totalTransacciones, String formaPagoTransacciones, Date plazoTransacciones,
			String estadoTransacciones) {
		super();
		this.tipoTransacciones = tipoTransacciones;
		this.comentarioTransacciones = comentarioTransacciones;
		this.fechaTransacciones = fechaTransacciones;
		this.descuentoTransacciones = descuentoTransacciones;
		this.totalTransacciones = totalTransacciones;
		this.formaPagoTransacciones = formaPagoTransacciones;
		this.plazoTransacciones = plazoTransacciones;
		this.estadoTransacciones = estadoTransacciones;
		
	}

	public long getIdTransacciones() {
		return idTransacciones;
	}

	public void setIdTransacciones(long idTransacciones) {
		this.idTransacciones = idTransacciones;
	}

	public String getTipoTransacciones() {
		return tipoTransacciones;
	}

	public void setTipoTransacciones(String tipoTransacciones) {
		this.tipoTransacciones = tipoTransacciones;
	}

	public String getComentarioTransacciones() {
		return comentarioTransacciones;
	}

	public void setComentarioTransacciones(String comentarioTransacciones) {
		this.comentarioTransacciones = comentarioTransacciones;
	}

	public Date getFechaTransacciones() {
		return fechaTransacciones;
	}

	public void setFechaTransacciones(Date fechaTransacciones) {
		this.fechaTransacciones = fechaTransacciones;
	}

	public int getDescuentoTransacciones() {
		return descuentoTransacciones;
	}

	public void setDescuentoTransacciones(int descuentoTransacciones) {
		this.descuentoTransacciones = descuentoTransacciones;
	}

	public int getTotalTransacciones() {
		return totalTransacciones;
	}

	public void setTotalTransacciones(int totalTransacciones) {
		this.totalTransacciones = totalTransacciones;
	}

	public String getFormaPagoTransacciones() {
		return formaPagoTransacciones;
	}

	public void setFormaPagoTransacciones(String formaPagoTransacciones) {
		this.formaPagoTransacciones = formaPagoTransacciones;
	}

	public Date getPlazoTransacciones() {
		return plazoTransacciones;
	}

	public void setPlazoTransacciones(Date plazoTransacciones) {
		this.plazoTransacciones = plazoTransacciones;
	}

	public String getEstadoTransacciones() {
		return estadoTransacciones;
	}

	public void setEstadoTransacciones(String estadoTransacciones) {
		this.estadoTransacciones = estadoTransacciones;
	}

//	public Cliente getCliente() {
//		return cliente;
//	}
//
//	public void setCliente(Cliente cliente) {
//		this.cliente = cliente;
//	}
	
	
}

package pe.edu.cibertec.proyemp.jpa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Id;

@Entity
@Table(name="tb_producto")
public class Producto {
     @Id
     @GeneratedValue
	private Long  Id;
     @Column(name="Producto",nullable=true, length=50)
	private String NomProducto;
     @Column(name="Precio",nullable=true,precision=8,scale=2)
     private double precio;
     @Column(name="fecha")
     //@Temporal(TemporalType.TIMESTAMP)  
     @Temporal(TemporalType.DATE) 
     private Date fecha;
     
   
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNomProducto() {
		return NomProducto;
	}
	public void setNomProducto(String nomProducto) {
		NomProducto = nomProducto;
	}
	
	
}

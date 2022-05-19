package Proyecto1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Persona {
	
	public int idPersona;
	public String nombre;
	public String Apellido;
	public String dptoResidencia;
	public byte cantHijos;
	public LocalDate fecNacimiento;
	
	
	public Persona(int idPersona, String nombre, String apellido, String dptoResidencia, byte cantHijos,
			LocalDate fecNacimiento) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		Apellido = apellido;
		this.dptoResidencia = dptoResidencia;
		this.cantHijos = cantHijos;
		this.fecNacimiento = fecNacimiento;
	}
	
	public Persona() {
		
		
	}

	
	//get y set
	public int getIdPersona() {
		return idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public String getDptoResidencia() {
		return dptoResidencia;
	}

	public byte getCantHijos() {
		return cantHijos;
	}

	public LocalDate getFecNacimiento() {
		return fecNacimiento;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public void setDptoResidencia(String dptoResidencia) {
		this.dptoResidencia = dptoResidencia;
	}

	public void setCantHijos(byte cantHijos) {
		this.cantHijos = cantHijos;
	}

	public void setFecNacimiento(LocalDate fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}
	
	//toString

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", Apellido=" + Apellido + ", dptoResidencia="
				+ dptoResidencia + ", cantHijos=" + cantHijos + ", fecNacimiento=" + fecNacimiento + "]";
	}
	
	
	
	
	public int hashCode() {
		return Objects.hash(idPersona);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return idPersona == other.idPersona;
	}
	
	
	

}
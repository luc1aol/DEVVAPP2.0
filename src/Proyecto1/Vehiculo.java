package Proyecto1;

public class Vehiculo {
	public int idVehiculo;
	public String nombreVehi;
	public String color;
	
	public Vehiculo(int idVehiculo, String nombreVehi, String color) {
		super();
		this.idVehiculo = idVehiculo;
		this.nombreVehi = nombreVehi;
		this.color = color;
	}
	public Vehiculo() {
		
	}
	public int getIdVehiculo() {
		return idVehiculo;
	}
	public String getNombreVehi() {
		return nombreVehi;
	}
	public String getColor() {
		return color;
	}
	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	public void setNombreVehi(String nombreVehi) {
		this.nombreVehi = nombreVehi;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", nombreVehi=" + nombreVehi + ", color=" + color + "]";
	}
	
	
	

}
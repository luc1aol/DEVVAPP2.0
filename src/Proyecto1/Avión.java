package Proyecto1;

public class Avi�n extends Vehiculo {
	
	public double longitud;
	public int cantPasajeros;
	
	
	public Avi�n(double longitud, int cantPasajeros) {
		super();
		this.longitud = longitud;
		this.cantPasajeros = cantPasajeros;
	}
	
	public Avi�n () {
		
	}
	
	

	public double getLongitud() {
		return longitud;
	}

	public int getCantPasajeros() {
		return cantPasajeros;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public void setCantPasajeros(int cantPasajeros) {
		this.cantPasajeros = cantPasajeros;
	}

	@Override
	public String toString() {
		return "Avi�n [longitud=" + longitud + ", cantPasajeros=" + cantPasajeros + "]";
	}
	
	
	
	

}
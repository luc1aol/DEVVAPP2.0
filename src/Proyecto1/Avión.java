package Proyecto1;

public class Avión extends Vehiculo {
	
	public double longitud;
	public int cantPasajeros;
	
	
	public Avión(double longitud, int cantPasajeros) {
		super();
		this.longitud = longitud;
		this.cantPasajeros = cantPasajeros;
	}
	
	public Avión () {
		
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
		return "Avión [longitud=" + longitud + ", cantPasajeros=" + cantPasajeros + "]";
	}
	
	
	
	

}
package Proyecto1;

public class Barco extends Vehiculo {
	
	public double eslora;
	public double manga;
	
	
	public Barco(double eslora, double manga) {
		super();
		this.eslora = eslora;
		this.manga = manga;
	}
	
	public Barco() {
		
	}

	public double getEslora() {
		return eslora;
	}

	public double getManga() {
		return manga;
	}

	public void setEslora(double eslora) {
		this.eslora = eslora;
	}

	public void setManga(double manga) {
		this.manga = manga;
	}

	
	
	@Override
	public String toString() {
		return "Barco [eslora=" + eslora + ", manga=" + manga + "]";
	}
	
	
	
	

}

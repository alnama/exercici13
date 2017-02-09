package vehicle;

public class Vehicle {
	private int cilindrada;
	private int Portes;
	private int velocitat_actual = 0;
	public static final int velocitat_maxima = 120;
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getPortes() {
		return Portes;
	}
	public void setPortes(int portes) {
		Portes = portes;
	}
	public int getVelocitat_actual() {
		return velocitat_actual;
	}
	public void setVelocitat_actual(int velocitat_actual) {
		this.velocitat_actual = velocitat_actual;
	}
	
	public void accelerar(){
		
	}
	
	public void decelerar(){
		
	}
}

package prueba;

import java.time.LocalDate;

public class Kromi extends Carro {
	private static String marca="Meche Benz";
	private static int fabricacion=2010;
	
	
	
	public Kromi(String marca, int fabricacion) {
		super();
		Kromi.marca = marca;
		Kromi.fabricacion = fabricacion;
		Carro.ingresoKromi();
	}
	public static String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		Kromi.marca = marca;
	}
	public static int getFabricacion() {
		return fabricacion;
	}
	public void setFabricacion(int fabricacion) {
		Kromi.fabricacion = fabricacion;
	}
	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
	}
	@Override
	public void ubicacionEnTablero() {
		// TODO Auto-generated method stub
	}
	@Override
	public String toString() {
		return "Kromi [marca=" + marca + ", fabricacion=" + fabricacion + "]";
	}
}
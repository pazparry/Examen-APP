package prueba;
import java.util.Random;
public class Trupalla extends Carro {
	
	static String nombreConductor = "El Chancho";
	static Random nivel = new Random ();
	static int nivelArmadura = nivel.nextInt(6);
	public Trupalla() {	
	}
	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		}
	@Override
	public void ubicacionEnTablero() {
		// TODO Auto-generated method stub
	}
	public static int getNivelArmadura() {
		return nivelArmadura;
	}
	public void setNivelArmadura(int nivelArmadura) {
		Trupalla.nivelArmadura = nivelArmadura;
	}
	public static String getNombreConductor() {
		return nombreConductor;
	}
	public void setNombreConductor(String nombreConductor) {
		Trupalla.nombreConductor = nombreConductor;
	}
	@Override
	public String toString() {
		return "Trupalla [nivelArmadura=" + nivelArmadura + ", nombreConductor=" + nombreConductor + "]";
	}
}

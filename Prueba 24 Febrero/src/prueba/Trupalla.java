package prueba;
import java.util.Random;
public class Trupalla extends Carro {
	
	static String nombreConductor = "El Chancho";
	static Random nivel = new Random ();
	static int nivelArmadura = nivel.nextInt(5)+1;
	static int cantOcupanteTrupalla = 2;
	static String ingresoTrupalla = "1999/9/13";
	
	public Trupalla(String nombreConductor, int nivelArmadura, int cantOcupanteTrupalla, String ingresoTrupalla) {	
		super();
		Trupalla.nombreConductor = "El Chancho";
		Trupalla.nivelArmadura = nivel.nextInt(5)+1;
		Trupalla.cantOcupanteTrupalla = 2;
		Trupalla.ingresoTrupalla = "1999/9/13";
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
	@Override
	public void cantOcupanteKromi() {
		// TODO Auto-generated method stub
		
	}

	public static String ingresoTrupalla() {
		// TODO Auto-generated method stub
		return null;
	}

	}
	

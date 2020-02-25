package prueba;

public class Trupalla extends Carro {
	int nivelArmadura; //<=5
	String nombreConductor;
	
	
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

	public int getNivelArmadura() {
		return nivelArmadura;
	}

	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}

	public String getNombreConductor() {
		return nombreConductor;
	}

	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	@Override
	public String toString() {
		return "Trupalla [nivelArmadura=" + nivelArmadura + ", nombreConductor=" + nombreConductor + "]";
	}

}

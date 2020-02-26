package prueba;

public class Caguano extends Carro {
	
	private static int alcanceTiro = 10;
	private static String colorConfeti = "café";
	
	

	
	public Caguano(int alcanceTiro, String colorConfeti) {
		super();
		Caguano.alcanceTiro = alcanceTiro;
		Caguano.colorConfeti = colorConfeti;
	}

	public static int getAlcanceTiro() {
		return alcanceTiro;
	}

	public void setAlcanceTiro(int alcanceTiro) {
		Caguano.alcanceTiro = alcanceTiro;
	}

	public static String getColorConfeti() {
		return colorConfeti;
	}

	public void setColorConfeti(String colorConfeti) {
		Caguano.colorConfeti = colorConfeti;
	}

	

	@Override
	public void mostrarDatos() {
		System.out.println("El alcance de Tiro del Kaguano es de " + alcanceTiro);
		System.out.println("El color del confeti del Kaguano es " + colorConfeti);
		
	}

	@Override
	public void ubicacionEnTablero() {
		// TODO Auto-generated method stub
		
	}

	public void alcanceTiro() {
		
	}
	
	public void mostrarColor() {
		
	}

	@Override
	public String toString() {
		return "Caguano [alcanceTiro=" + alcanceTiro + ", colorConfeti=" + colorConfeti + "]";
	}
	
	
}

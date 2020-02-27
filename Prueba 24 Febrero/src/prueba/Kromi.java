package prueba;


public class Kromi extends Carro {
	//Atributos de la clase hija 
	private static String marca="Meche Benz";
	private static int fabricacion=2010;
	private static String ingresoKromi = "1984/1/13";
	private static int cantOcupante = 7; 
	private static String ingresoCaguano = "1973/6/13";
	
	
	public Kromi(String marca, int fabricacion, String ingresoKromi, int cantOcupante, String ingresoCaguano ) {
		super();
		Kromi.marca = marca; 
		Kromi.fabricacion = fabricacion;
		Carro.ingresoKromi = "1984/1/13"; //atributos que proviene de la clase padre
		Carro.cantOcupante = 7;
		Carro.ingresoCaguano = "1973/6/13";
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
	
	public static String getIngresoKromi() {
		return ingresoKromi;
	}
	
	public static void setIngresoKromi(String ingresoKromi) {
		Kromi.ingresoKromi = ingresoKromi;
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
	public void IngresoKromi() {
		// TODO Auto-generated method stub
	}
	



	public static int getCantOcupante() {
		return cantOcupante;
	}



	public static void setCantOcupante(int cantOcupante) {
		Kromi.cantOcupante = cantOcupante;
	}



	@Override
	public void cantOcupanteKromi() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "Kromi [marca=" + marca + ", fabricacion=" + fabricacion + "]";
	}



	public static String getIngresoCaguano() {
		return ingresoCaguano;
	}



	public static void setIngresoCaguano(String ingresoCaguano) {
		Kromi.ingresoCaguano = ingresoCaguano;
	}



	
	
}
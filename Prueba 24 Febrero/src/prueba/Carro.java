
package prueba;
import java.time.LocalDate;


abstract class Carro {
	int dd=0;
	int mm=0;
	int aa=0;
	
	int cantOcupante;
	static LocalDate ingresoKromi = LocalDate.of(1984, 1, 13);
	LocalDate ingresoCaguano = LocalDate.of(1973, 6, 13);
	LocalDate ingresoTrupalla = LocalDate.of(1999, 9, 13);
	
	public abstract void mostrarDatos();
	public abstract void ubicacionEnTablero();
	protected static void ingresoKromi() {
		// TODO Auto-generated method stub
		
	}
	
	
}

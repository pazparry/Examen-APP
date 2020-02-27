package prueba;
import java.util.Scanner;
public class Huevo {
	Scanner entrada = new Scanner(System.in);
	int fila =0;
	int columna=0;
	public Huevo(int fila, int columna, char[][] tablero) {
		super();
		this.fila = fila;
		this.columna = columna;
			//mostrarTablero();
	}
	public Huevo() {
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getColumna() {
		return columna;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	public void obtenerPuntaje() {
	}
	public void lanzarHuevo(char[][] tablero) {
	}
}
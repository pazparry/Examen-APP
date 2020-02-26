package prueba;
import java.util.Scanner;
public class Tablero {
	int alto= 15;
	int ancho=15;
	char[][] tablero = new char[ancho][alto];
	Scanner entrada = new Scanner(System.in);
	public void crearCarro(){
		int col=0;
		int fil=0;
	}
	public void lanzarHuevo(){
		int fila =0;
		int columna=0;
		System.out.println("Donde Quieres Lanzar el Huevo?");
		System.out.println("Ingrese Fila ");
		fila = entrada.nextInt();
		System.out.println("Ingrese Columna ");
		columna = entrada.nextInt();
		if(fila >=1 && fila <=15) {
			//columna = (int)(Math.random()*15 +1);
				for(int i =0; i< 15; i++) {
					tablero[fila-1][columna-1] = 'H';
				}
				mostrarTablero();
		}
	}
	public void mostrarMatriz() {
	}
	public void mostrarTablero() {
		for(int i = 0; i<ancho; i++) {
			for(int j = 0; j<alto; j++) {
				System.out.print(tablero[i][j] + "  ");
			}
			System.out.println("");
		}
	}
	public void calcularPuntaje() {
	}
	public void llenarTablero() {
		for(int i = 0; i<ancho; i++) {
			for(int j = 0; j<alto; j++) {
				tablero[i][j]= 'O';
			}
		}
	}
}
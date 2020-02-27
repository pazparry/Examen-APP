package prueba;
import java.util.Scanner;

public class Tablero {
	static int alto= 15;
	static int ancho=15;
	static char[][] tablero = new char[ancho][alto];
	Scanner entrada = new Scanner(System.in);
	public void crearCarros() {
		int f=0;
		int c=0;
		//Creando los Kromi
		for(int i =0; i<=2;i++) {
		f= (int)(Math.random()*15);
		c = (int)(Math.random()*15);
			if(f >=1 && f <=12) {
				for(int x =0; x< 15; x++) {
					tablero[f][c] = 'K';
					tablero[f+1][c] = 'K';
					tablero[f+2][c] = 'K';
					}
			}
		}
		//Creando los Caguanos
		for(int i =0; i<=5;i++) {
		int	f1= (int)(Math.random()*15);
		int	c1 = (int)(Math.random()*15);
				if(c1 >=1 && c1 <=13 ) {
					for(int x =0; x< 15; x++) {
						if(tablero[f1][c1]=='O') {
							tablero[f1][c1] = 'C';
							tablero[f1][c1+1] = 'C';
							}
						}
				}
			}
		//Creando Trupallas
		for(int i =0; i<=10;i++) {
			int	f2= (int)(Math.random()*15);
			int	c2 = (int)(Math.random()*15);
					if(f2 >=1 && f2 <=15) {
						for(int x =0; x< 15; x++) {
							if(tablero[f2][c2]=='O') {
								tablero[f2][c2] = 'T';
								}
							}
					}
				}
		mostrarTablero();
	}

	public void lanzarHuevo(){
		int fila =0;
		int columna=0;
		int puntos = 0;
		System.out.println("Llevas " + puntos + " puntos");
		System.out.println("Donde Quieres Lanzar el Huevo?");
		System.out.println("Ingrese Fila ");
		fila = entrada.nextInt();
		System.out.println("Ingrese Columna ");
		columna = entrada.nextInt();
		if(tablero[fila-1][columna-1] == 'K') {
			System.out.println("Le has Atinado a un Kromi");
			puntos = puntos + 3;
		}
		if(fila >=1 && fila <=15) {
			//columna = (int)(Math.random()*15 +1);
				for(int i =0; i< 15; i++) {
					tablero[fila-1][columna-1] = 'H';
				}
				System.out.println("Llevas " + puntos + " puntos");
				mostrarTablero();
				
		}
	}
	public  void mostrarMatriz() {
	}
	public static void mostrarTablero() {
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
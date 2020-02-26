package prueba;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablero tableroInicial = new Tablero();
		Scanner sn = new Scanner(System.in);
		int opcion = 0;
		boolean salir = false;
		
		System.out.println("Los PKS han llegado, prepara esos huevos!!");
		System.out.println("Escoje en el menú la opción que deseas tomar,");
		System.out.println ("¡cuidado!, podría llegarte confeti, alto en calorías, desde Caguano");
		System.out.println ("");
	
		
		while (!salir) {
			   System.out.println("==========MENU==========");
			   System.out.println("1. Comenzar a atacar");
	           System.out.println("2. Ver el estado del tablero");
	           System.out.println("3. Mostrar detalle de vehículos");
	           System.out.println("4. Mostrar puntaje acumulado");
	           System.out.println("5. Salir");
	           
	           
	           System.out.println("Escribe una de las opciones");
	           opcion = sn.nextInt();
	           
	           switch (opcion){
	   		case 1:
	   			System.out.println("A Lanzar huevos!");
	   			tableroInicial.lanzarHuevo();
	   			break;

	   		case 2:
	   			System.out.println("Veamos el tablero!");
	   			//System.out.println(Tablero.getlanzarHuevo());
	   			break;
	   			
	   		case 3:
	   			System.out.println("===========KROMI==========");
	   			System.out.println("El año de fabricación " + Kromi.getFabricacion());
	   			System.out.println("La marca de las Kromis es " + Kromi.getMarca());
	   			System.out.println("");
	   			
	   			System.out.println("===========CAGUANO==========");
	   			System.out.println("El alcance del Caguano es de " + Caguano.getAlcanceTiro() + " metros");
	   			System.out.println("El color del confeti del Caguano es " + Caguano.getColorConfeti());
	   			System.out.println("");
	   			
	   			System.out.println("===========TRUPALLA==========");
	   			System.out.println("El nivel de armadura es de " + Trupalla.getNivelArmadura());
	   			System.out.println("El conductor de la Trupalla es " + Trupalla.getNombreConductor());
	   			System.out.println("");
	   			break;
	   			
	   		default:
	   			System.out.println("oh! no está esa opción, vuelve a intentar");
	   			System.out.println("");
	   		} 
	               
		}
		
		
		
		
		sn.close();	
	}

} 


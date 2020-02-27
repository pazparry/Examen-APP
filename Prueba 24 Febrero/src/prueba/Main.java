package prueba;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// Variables
		Tablero tableroInicial = new Tablero();
		Scanner sn = new Scanner(System.in);
		int opcion = 0;
		boolean salir = false; //para salir del menu
		
		
		//Bienvenida al juego
		System.out.println("Los PKS han llegado, prepara esos huevos!!");
		System.out.println("Escoje en el menú la opción que deseas tomar,");
		System.out.println ("¡cuidado!, podría llegarte confeti, alto en calorías, desde Caguano");
		System.out.println ("");
	
		//Menu a mostrar en pantalla
		while (!salir) {
			   System.out.println("==========MENU==========");
			   System.out.println("1. Ver el estado del tablero");
	           System.out.println("2. Comenzar a atacar");
	           System.out.println("3. Mostrar puntaje acumulado");
	           System.out.println("4. Mostrar detalle de vehículos");
	           System.out.println("5. Salir");
	           
	           
	           System.out.println("Escribe una de las opciones");
	           opcion = sn.nextInt();
	        
	           //Switch para recorrer las opciones y salida en la op. 5
	           switch (opcion){
	   		case 1:
	   			System.out.println("Veamos el tablero!");
	   			tableroInicial.llenarTablero();
	   			//Tablero.mostrarTablero();
	   			tableroInicial.crearCarros();
	   			break;

	   		case 2:
	   			System.out.println("A Lanzar huevos!");
	   			tableroInicial.lanzarHuevo();
	   			break;
	   			
	   		case 3:
	   			System.out.println("===========PUNTAJE ACUMULADO==========");
	   			break;
	   			
	   		case 4:
	   			
	   			System.out.println("===========KROMI==========");
	   			System.out.println("El año de fabricación " + Kromi.getFabricacion());
	   			System.out.println("Fecha de ingreso a la PKS " + Kromi.getIngresoKromi());
	   			System.out.println("La marca de las Kromis es " + Kromi.getMarca());
	   			System.out.println("Cantidad de ocupantes " + Kromi.getCantOcupante());
	   			System.out.println("");
	   			
	   			System.out.println("===========CAGUANO==========");
	   			System.out.println("Fecha de ingreso a la PKS " + Caguano.getIngresoCaguano());
	   			System.out.println("Cantidad de ocupantes " + Caguano.getCantOcupanteCaguano());
	   			System.out.println("El alcance del Caguano es de " + Caguano.getAlcanceTiro() + " metros");
	   			System.out.println("El color del confeti del Caguano es " + Caguano.getColorConfeti());
	   			System.out.println("");
	   			
	   			System.out.println("===========TRUPALLA==========");
	   			System.out.println("El nivel de armadura es de " + Trupalla.getNivelArmadura());
	   			System.out.println("Fecha de ingreso a la PKS " + Trupalla.ingresoTrupalla);
	   			System.out.println("Cantidad de ocupantes " + Trupalla.cantOcupanteTrupalla);
	   			System.out.println("El conductor de la Trupalla es " + Trupalla.getNombreConductor());
	   			System.out.println("");
	   			break;
	   			
	   		case 5:
	   			System.out.println("===========RESUMEN==========");
	   			salir = true;
	   			break;
	   			
	   		default: //esto para cuando el usuario digite una opción fuera del rango del switch
	   			System.out.println("oh! no está esa opción, vuelve a intentar");
	   			System.out.println("");
	   		} 
	               
		}
		
		
		
		
		sn.close();	
	}

	

} 


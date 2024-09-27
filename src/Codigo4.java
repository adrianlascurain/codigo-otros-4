/* 
 * En este código se desarrollo el juego de piedra papel o tijeras
 * en donde dos jugadores seleccionan una de las 3 opciones y después
 * el programa compara las entradas a través de una serie de condicionales 
 * anidadas dentro de un ciclo switch para estipular un ganador, por último 
 * se imprime el número del jugador que ganó
 */

//Se importan las utilidades 
import java.util.Scanner;

// Se reestructuran las llaves de apertura y cierre de cada ciclo
public class Codigo4 {
	
	// Se copia todo el código dentro de un método main 
	public static void main(String[] args ) {
		
//		Se añade la entrada estándar a la clase Scanner 
	    Scanner s = new Scanner(System.in);
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
//	    Se retira el segundo scanner 
	    String j2 = s.nextLine();
	    s.close();
	    
	    // Se actualiza la condición para evaluar en objetos de tipo string
	    if (j1.equals(j2)) {
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      // Se agregan las sentencias break y se reestructura las condiciones
	      switch(j1) {
	        case "piedra":
	          if (j2.equals("tijeras")) {
	            g = 1;
	          }
	          break;
	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 1;
	          }
	          break;
	          // se cambia el case de tijera a tijeras
	        case "tijeras":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	        	System.out.println("Ha ocurrido un error");
	        	g = 0;
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	}
}
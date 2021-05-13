package vc_01;

import java.util.Scanner;

public class controlVersion {

	public static void main(String[] args) {
		 Scanner en = new Scanner(System.in);
	        int numero;
	        
	        System.out.println("Introducir un número entero");
	        numero = en.nextInt();
	        
	        System.out.println("El cuadrado de " + numero + " es " + numero*numero);

	}

}

/*Un Commit es un conjunto de cambios que se hayan realizado sobre el código de 
 * una Branch de un Repository. Cuando hago un Commit
 * se crea una nueva version del codigo fuente de la Branch de mi Repository
 */

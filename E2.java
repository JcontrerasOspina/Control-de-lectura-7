package Ejercicios;

import java.util.Scanner;

public class E2 {
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);

		System.out.print ("Nombre: ");
		String nombre=leer.nextLine();

		System.out.print ("Promedio: ");
		int promedio= leer.nextInt();

		if (promedio>=90)
		    System.out.println (nombre+", Tiene MUY BUENA recomendación");
		else
		    if (promedio>=80 && promedio<90)
		        System.out.println (nombre+", Tiene BUENA recomendación");
		    else
		        if (promedio>=70 && promedio<80)
		            System.out.println (nombre+", Tiene ENDEBLE recomendación");
		        else
		            System.out.println (nombre+", Checa tu promedio por favor");
	}

}

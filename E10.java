package Ejercicios;

import java.util.Scanner;

public class E10 {
	    public static void main(String[] args) {
	        Scanner leer = new Scanner(System.in);

	        int n;

	        System.out.print("Valor de n: ");
	        n=leer.nextInt();

	        System.out.print ("Equivalente en binario: ");
	        binario(n); //Ejecuta el procedimiento

	        //Salta de línea después de imprimir resultado
	        System.out.println ();
	    }

	    //Método recursivo para realizar la conversión
	    static void binario(int n) {
	        if (n>=2) {
	            binario(n/2);
	            //Imprime los digitos del módulo
	            System.out.print(n%2);
	        }
	        else {
	            System.out.print(n);
	        }
	    }
	}

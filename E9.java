package Ejercicios;

import java.util.Scanner;

public class E9 {
			public static void main(String[] args) {
	        Scanner leer = new Scanner(System.in);
	        
	        int n;
	        
	        System.out.print("Valor de n: ");
	        n=leer.nextInt();
	        
	        System.out.println(" n      Sumatoria");
	        System.out.println("Resultado="+sumatoria(n));
	    }
	    
	    //Función recursiva
	    static int sumatoria(int n) {
	        int c;
	        if (n>1) {
	            c=sumatoria(n-1)+2*n;
	            System.out.printf ("%4d %12d\n",n,c);
	        }
	        else {
	            c=2;
	            System.out.printf ("%4d %12d\n",n,c);
	        }
	        return c;
	    }
	}


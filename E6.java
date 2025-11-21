package Ejercicios;

import java.util.Scanner;

public class E6 {
	    static Scanner leer=new Scanner(System.in);
	    public static void main(String[] args) {
	        //se crea un arreglo de 7 elementos enteros
	        int calorias[]=new int[7];
	        int indice, suma=0;
	        
	        System.out.println("Captura las calorias consumidas cada día");
	        
	        for(indice=0;indice<calorias.length;indice++) {
	            System.out.print("Dia "+(indice+1)+": ");
	            
	            //Se lee cada elemento del arreglo
	            calorias[indice]=leer.nextInt();
	            suma+=calorias[indice];
	        }
	        
	        //Imprime las calorias leídas en orden inverso
	        System.out.println("Información leída en orden inverso");
	        for(indice=calorias.length-1;indice>=0;indice--)
	            System.out.print(calorias[indice]+" ");
	        
	        System.out.println(); //Salta a la siguiente línea
	        
	        System.out.println("El promedio de calorías quemadas es ="+
	                ((float)suma/calorias.length));
	    }
	}

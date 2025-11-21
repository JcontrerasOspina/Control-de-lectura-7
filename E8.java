package Ejercicios;

import java.util.Scanner;

public class E8 {
	    public static void main(String[] args){
	        Scanner leer = new Scanner(System.in);
	        
	        String nombre;
	        
	        System.out.print ("¿Cómo te llamas?: ");
	        nombre=leer.nextLine();
	        
	        System.out.print (nombre);
	        primermetodo(); //Llama al método 1
	        segundometodo(); //Llama el otro método
	        System.out.println (nombre);
	    }
	    
	    //Método 1
	    static void primermetodo() {
	        System.out.println (" es un nombre bonito");
	    }
	    
	    //Método 2
	    static void segundometodo() {
	        System.out.print ("Me gustaría llamarme ");
	    }
	}

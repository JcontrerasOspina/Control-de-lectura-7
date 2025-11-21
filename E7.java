package Ejercicios;

import java.util.Scanner;

public class E7 {
	    public static void main(String[] args){
	        Scanner leer = new Scanner(System.in);
	        
	        int a, b, c, resultado;
	        
	        System.out.print("a: "); a=leer.nextInt();
	        System.out.print("b: "); b=leer.nextInt();
	        System.out.print("a: "); c=leer.nextInt(); // Nota: Aquí se pide 'a' de nuevo, pero se guarda en 'c'.

	        resultado=mayor(a,b,c); //Se invoca la función mayor

	        System.out.printf("El mayor es = %d\n",resultado);
	    } // Fin de programa principal
	    
	    
	  //Función para encontrar el mayor de tres cantidades
	    static int mayor(int x, int y, int z){
	        int m=x;

	        if (x>=y && x>=z)
	            m=x;
	        else if (y>=x && y>=z)
	            m=y;
	        else if (z>=x && z>=y)
	            m=z;

	        return m; //Devuelve el valor encontrado por la función
	    } //Fin de función mayor
	}

package Ejercicios;

import java.util.Scanner;

public class E1 {
	public static void main(String[] args){
        String arti;
        double precio;

        Scanner leer= new Scanner(System.in);

        System.out.print ("Nombre del artículo: ");
        arti= leer.next();
        System.out.print("Precio (pesos):");
        precio= leer.nextDouble();

        if (precio>=100) {
            System.out.printf ("%s es muy caro, vale $%.2f\n",arti,precio);
            System.out.println ("máximo puedo pagar por un "+arti+" $100.00");
        }
    }
}

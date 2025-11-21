package Ejercicios;

import java.util.Scanner;

public class E4 {
	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n;

        System.out.print ("Valor de n: ");
        n=leer.nextInt();
        int fac=1;

        for (int x=1; x<=n; x++)
            fac=fac*x;

        System.out.printf ("El factorial de %d es = %d \n",n,fac);
    }
}

package Ejercicios;

import java.util.Scanner;

public class E3 {
	    public static void main(String[] args) {
	        Scanner lectura = new Scanner(System.in);

	        int n, i, num, par=0;

	        System.out.print("Cuántos números son: ");
	        n=lectura.nextInt();

	        System.out.println ("Dame los "+n+" números: ");
	        i=0;
	        while (i<n) {
	            num=lectura.nextInt();
	            if (num % 2==0)
	                par+=1;
	            i++;
	        }
	        System.out.printf("Números pares= %d, Números impares= %d\n", par, (n-par));
	    }
	}

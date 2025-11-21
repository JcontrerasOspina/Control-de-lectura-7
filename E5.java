package Ejercicios;

import java.util.Scanner;

public class E5 {
    // CORRECCIÓN 1: El Scanner se declara como un campo de la clase
    static Scanner leer= new Scanner(System.in); 
    
    public static void main(String[] args) {
        char carac[]={'P','R','O','G','R','A','M','A','C','I','O','N'};
        char aux;
        int i, opcion, longitud;
        longitud=carac.length;
        
        System.out.print ("\nMENU\n1) Recorrer a la derecha\n2) Recorrer a la izquierda\n3) Terminar\n\n");
        
        // CORRECCIÓN 2: Falta la llave de cierre para el switch/case
        do { 
            System.out.print ("La palabra es: ");
            for(i=0;i<longitud;i++)
                System.out.print(carac[i] + " ");
            
            System.out.println();
            System.out.print ("Qué deseas hacer: ");
            opcion=leer.nextInt();
            
            switch (opcion) {
                case 1: //se respalda el último caracter
                    aux=carac[longitud-1];
                    for(i=longitud-1;i>0;i--)
                        carac[i]=carac[i-1];
                    
                    /* en la celda cero se coloca el carácter respaldado */
                    carac[0]=aux;
                    break;
                    
                case 2: //se respalda el primer caracter
                    aux=carac[0];
                    // CORRECCIÓN 3: Se quitó el ';' y se añadió la lógica de desplazamiento a la izquierda
                    for(i=0;i<longitud-1;i++)
                        carac[i] = carac[i+1];
                    carac[longitud-1] = aux; // Se coloca el primer carácter al final
                    break;

                case 3: // Opción para Terminar
                    System.out.println("Programa terminado.");
                    break;
                    
                default:
                    System.out.println("Opción no válida.");
            }
        // CORRECCIÓN 4: La condición del do-while debe ser diferente de 3
        } while (opcion != 3); 
    }
}
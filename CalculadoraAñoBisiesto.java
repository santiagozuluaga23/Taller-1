/*
Escribe un programa que le pida al usuario que ingrese un año y determine si es un año bisiesto o
no. Recuerda que un año es bisiesto si es divisible entre 4, excepto aquellos que son divisibles entre
100, a menos que también sean divisibles entre 400.
*/

import java.util.Scanner;

public class CalculadoraAñoBisiesto {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numeroAño;
        System.out.println("Por favor ingrese un año: ");
        numeroAño = scanner.nextInt();

        if (numeroAño % 4 == 0) {
            System.out.println(numeroAño + " es un año bisiesto");
        }
        else{
            System.out.println(numeroAño + " no es un año bisiesto");
        }
    }
}

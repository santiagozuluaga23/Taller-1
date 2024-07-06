/*
Crea un programa que solicite al usuario ingresar tres números enteros y luego los muestre
ordenados de menor a mayor. Intenta resolverlo primero con if y else, y luego intenta crear una
solución usando el operador ternario para práctica adicional.
*/

import java.util.Scanner;

public class OrdenandoTresNumeros {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;

        System.out.println("Por favor ingresa el primer número: ");
        numero1 = scanner.nextInt();

        System.out.println("Por favor ingresa el segundo número: ");
        numero2 = scanner.nextInt();

        System.out.println("Por favor ingresa el tercer número: ");
        numero3 = scanner.nextInt();

        if (numero1 < numero2 && numero1 < numero3 && numero2 < numero3) {
            System.out.println("El orden de menor a mayor es: " + numero1 +", " +  numero2 + ", " + numero3);            
        }
        else if (numero1 < numero3 && numero1 < numero2 && numero3 < numero2 ) {
            System.out.println("El orden de menor a mayor es: " + numero1 +", " +  numero3 + ", " + numero2);            
        }
        else if (numero2 < numero1 && numero2 < numero3 && numero1 < numero3) {
            System.out.println("El orden de menor a mayor es: " + numero2 +", " +  numero1 + ", " + numero3);            
        }
        else if (numero2 < numero1 && numero2 < numero3 && numero3 < numero1) {
            System.out.println("El orden de menor a mayor es: " + numero2 +", " +  numero3 + ", " + numero1);            
        }
        else if (numero3 < numero2 && numero3 < numero1 && numero2 < numero1) {
            System.out.println("El orden de menor a mayor es: " + numero3 +", " +  numero2 + ", " + numero1);            
        }
        else if(numero3 < numero1 && numero3 < numero2 && numero1 < numero2) {
            System.out.println("El orden de menor a mayor es: " + numero3 +", " +  numero1 + ", " + numero2);            
        }
    }
}
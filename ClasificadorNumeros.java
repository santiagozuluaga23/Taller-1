/*
Crea un programa que solicite al usuario un número y muestre un mensaje indicando si el número
es positivo, negativo o cero. Además, indica si el número es par o impar.
*/

import java.util.Scanner;

public class ClasificadorNumeros {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Por favor ingresa un número: ");
        numero = scanner.nextInt();

        if(numero % 2 == 0 && numero > 0){
            System.out.println(numero + "es un número par y positivo");
        }
        else if(numero % 2 != 0 && numero > 0){
            System.out.println(numero + " es un número impar y positivo");
        }
        else if(numero % 2 == 0 && numero < 0){
            System.out.println(numero + " es un número par y negativo");
        }
        else if(numero % 2 != 0 && numero < 0){
            System.out.println(numero + " es un número impar y negativo");
        }
        else{
            System.out.println("Es el número 0");
        }
    }
}
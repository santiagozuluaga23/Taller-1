/*
Escribe un programa que pida al usuario dos números y luego muestre el resultado de sumar, restar, multiplicar y dividir esos números. Utiliza tipos de datos primitivos para almacenar los números y los resultados.
*/

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Por favor ingresa un número: ");
        numero1 = scanner.nextInt();

        System.out.println("Por favor ingrese otro número: ");
        numero2 = scanner.nextInt();

        int suma = (numero1 + numero2);
        int resta = (numero1 - numero2);
        int multiplicacion = (numero1 * numero2);
        double division = (numero1 / numero2);

        System.out.println("La suma entre los dos números es: " + suma);
        System.out.println("La resta entre los dos números es: " + resta);
        System.out.println("La multiplicación entre los dos números es: " + multiplicacion);
        System.out.println("La división entre los dos números es: " + division);
    }
}
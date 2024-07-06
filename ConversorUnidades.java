/*
Desarrolla un programa que convierta kilómetros a millas. El programa debe solicitar al usuario que
introduzca una distancia en kilómetros y luego debe mostrar la distancia equivalente en millas.
Utiliza el hecho de que una milla es igual a 1.60934 kilómetros.
*/

import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double distanciaKilometros; 

        System.out.println("Por favor ingresa una distancia en Kilómetros: ");
        distanciaKilometros = scanner.nextDouble();

        double distanciaMillas = (distanciaKilometros * 1.60934);

        System.out.println("La distancia en Millas es de: " + distanciaMillas + " millas");
    }
}

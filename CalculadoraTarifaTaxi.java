/*
Desarrolla un programa que calcule el costo de un viaje en taxi basándose en la distancia del viaje
(en kilómetros) y la tarifa base. Puedes añadir una tarifa adicional por kilómetro recorrido. El
usuario debe ingresar la distancia del viaje.
*/

import java.util.Scanner;

public class CalculadoraTarifaTaxi {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double tarifaBase = 50.0;
        double tarifaPorKilometro = 10.0;

        System.out.println("Por favor ingresa la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();

        double costoTotal = tarifaBase + (tarifaPorKilometro * distancia);

        System.out.println("El costo total del viaje es: " + costoTotal);
    }
}

/*
Crea un programa que convierta temperaturas entre grados Celsius y Fahrenheit. El usuario debe
poder elegir si quiere convertir de Celsius a Fahrenheit o viceversa, y luego ingresar la temperatura.
Utiliza la fórmula C = (F - 32) * 5/9 para Fahrenheit a Celsius y F = C * 9/5 + 32 para Celsius a
Fahrenheit.
*/

import java.util.Scanner;

public class ConvertidorTemperatura {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int opcion = scanner.nextInt();

        System.out.println("Por favor seleccione el tipo de conversión:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");

        double temperaturaCelsius;
        double temperaturaFahrenheit;

        switch (opcion) {
            case 1:
                temperaturaCelsius = scanner.nextDouble();
                System.out.print("Por favor ingresa la temperatura en Celsius: ");

                temperaturaFahrenheit = temperaturaCelsius * 9/5 + 32;
                System.out.println("Por favor ingresa la temperatura en Fahrenheit es: " + temperaturaFahrenheit);
                break;

            case 2:
                temperaturaFahrenheit = scanner.nextDouble();    
                System.out.print("Por favor ingresa la temperatura en Fahrenheit: ");
                
                temperaturaCelsius = (temperaturaFahrenheit - 32) * 5/9;
                System.out.println("Por favor ingresa la temperatura en Celsius es: " + temperaturaCelsius);
                break;

            default:
                break;
        }
    }
}

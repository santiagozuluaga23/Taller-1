/*
Desarrolla un programa que pida al usuario el número de un mes (1-12) y muestre el número de días
de ese mes. Asume que febrero tiene 28 días. Utiliza una estructura switch para resolverlo.
*/

import java.util.Scanner;

public class CalculadoraDiaMes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroMes; 

        System.out.println("Por favor ingresa un número del 1 al 12, que corresponden a los meses del año:");

        numeroMes = scanner.nextInt();

        switch (numeroMes) {
            case 1:
                System.out.println("Has seleccionado el mes de Enero y tiene 31 días.");
                break;

            case 2:
                System.out.println("Has seleccionado el mes de Febrero y tiene 28 días.");
                break;

            case 3:
                System.out.println("Has seleccionado el mes de Marzo y tiene 31 días.");
                break;

            case 4:
                System.out.println("Has seleccionado el mes de Abril y tiene 30 días.");
                break;

            case 5:
                System.out.println("Has seleccionado el mes de Mayo y tiene 31 días.");
                break;

            case 6:
                System.out.println("Has seleccionado el mes de Junio y tiene 30 días.");
                break;

            case 7:
                System.out.println("Has seleccionado el mes de Julio y tiene 31 días.");
                break;

            case 8:
                System.out.println("Has seleccionado el mes de Agosto y tiene 31 días.");
                break;

            case 9:
                System.out.println("Has seleccionado el mes de Septiembre y tiene 30 días.");
                break;

            case 10:
                System.out.println("Has seleccionado el mes de Octubre y tiene 31 días.");
                break;

            case 11:
                System.out.println("Has seleccionado el mes de Noviembre y tiene 30 días.");
                break;

            case 12:
                System.out.println("Has seleccionado el mes de Diciembre y tiene 31 días.");
                break;
            
            default:
                System.out.println("Ingresaste un dato erroneo.");
                break;
        }
    }
}

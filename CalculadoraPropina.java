/*
Desarrolla un programa que calcule cuánto dejar de propina en un restaurante. El usuario debe
ingresar el total de la cuenta y el porcentaje de propina que desea dejar. El programa debe mostrar
cuánto dinero en propina debe dejar.
*/

import java.util.Scanner;

public class CalculadoraPropina {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        float cuentaTotal;
        float porcentajePropina;

        System.out.println("Por favor ingrese el total de la cuenta: ");
        cuentaTotal = scanner.nextFloat();

        System.out.println("Por favor ingrese el porcentaje de propina que desea dejar: ");
        porcentajePropina = scanner.nextInt();

        float propina = (porcentajePropina / 100) * cuentaTotal;
        System.out.println("Deses dejar el " + porcentajePropina + "%, lo cual corresponde a " + propina + " de propina al restaurante");
    }
}

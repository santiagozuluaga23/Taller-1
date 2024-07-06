/*
Implementa un programa que muestre un menú con opciones para realizar diferentes operaciones
matemáticas (por ejemplo, sumar, restar, multiplicar, dividir). El usuario debe poder seleccionar una
opción ingresando un número, y luego el programa debe pedir los números necesarios para realizar
la operación elegida y mostrar el resultado. Utiliza una estructura switch para manejar las opciones
del menú.
*/

import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numeroOperacion;

        System.out.println("Por favor ingrese el número de la operación que desea realizar: 1. Sumar, 2. Restar, 3. Multiplicar, 4. Dividir :");
        numeroOperacion = scanner.nextInt();

        float numero1;
        float numero2;

        System.out.println("Por favor ingresa el primer número: ");
        numero1 = scanner.nextFloat();
        System.out.println("Por favor ingresa el segundo número: ");
        numero2 = scanner.nextFloat();

        float resultado;

        switch (numeroOperacion){

            case 1:
                resultado = (numero1 + numero2);

                System.out.println("El resultado de la suma es: " + resultado);              
                break;

            case 2:
            resultado = (numero1 - numero2);
                System.out.println("El resultado de la resta es: " + resultado);              
                break;

            case 3:
            resultado = (numero1 * numero2);
                System.out.println("El resultado de la multiplicación es:" + resultado);              
                break;

            case 4:
            resultado = (numero1 / numero2);
                System.out.println("El resultado de la división es: " + resultado);              
                break;

            default:
                break;
        }
    }
}

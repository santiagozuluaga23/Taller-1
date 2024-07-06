/* 
Escribe un programa que solicite al usuario ingresar tres calificaciones, calcule el promedio y
muestre un mensaje indicando si el alumno aprueba o no (considera que se aprueba con un
promedio de 6 o más).
*/

import java.util.Scanner;

public class CalculoPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float nota1;
        float nota2;
        float nota3;

        System.out.println("Por favor ingrese la primera nota: ");
        nota1 = scanner.nextFloat();

        System.out.println("Por favor ingrese la segunda nota: ");
        nota2 = scanner.nextFloat();

        System.out.println("Por favor ingrese la tercera nota: ");
        nota3 = scanner.nextFloat();

        float promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 6) {
            System.out.println("Aprobaste con un promedio de: " + promedio);
        }
        else{
            System.out.println("Aprobaste con un promedio de: " + promedio);
        }
    }
}

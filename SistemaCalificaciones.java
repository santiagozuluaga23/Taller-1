/*
Implementa un programa que le pida al usuario la calificación de un examen (0-100). Basado en la
calificación, el programa debe mostrar una letra (A, B, C, D, F), donde A es 90-100, B es 80-89,
etc. Considera utilizar if o switch.
*/

import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingresa la calificación del examen (0-100): ");
        int calificacion = scanner.nextInt();

        char letra;
        if (calificacion >= 90 && calificacion <= 100) {
            letra = 'A';
        }
        else if (calificacion >= 80 && calificacion < 90) {
            letra = 'B';
        }
        else if (calificacion >= 70 && calificacion < 80) {
            letra = 'C';
        }
        else if (calificacion >= 60 && calificacion < 70) {
            letra = 'D';
        }
        else if (calificacion >= 0 && calificacion < 60) {
            letra = 'F';
        }
        else {
            System.out.println("Calificación no válida.");
            return;
        }

        System.out.println("La letra correspondiente a la calificación es: " + letra);
    }
}

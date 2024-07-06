/*
Escribe un programa que calcule el índice de masa corporal (IMC) de una persona. El programa
debe pedir al usuario su peso en kilogramos y su altura en metros, calcular el IMC y mostrar un
mensaje con el resultado. La fórmula para calcular el IMC es peso / (altura * altura).
*/


import java.util.Scanner;

public class MasaCorporal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido(a), calcularemos su índice de su masa corporal");

        float altura;
        float peso;

        System.out.println("Por favor ingrese su altura: ");
        altura = scanner.nextFloat();

        System.out.println("Por favor ingrese su peso: ");
        peso = scanner.nextFloat();

        float indiceMasaCorporal = (peso / (altura * altura));

        System.out.println("Su índice de masa corporal es: " + indiceMasaCorporal);
    }
}

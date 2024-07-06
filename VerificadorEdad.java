/*
Crea un programa que solicite la edad del usuario y determine si es mayor de edad (18 años o más).
El programa debe imprimir un mensaje indicando si el usuario es mayor de edad o no.
*/

import java.util.Scanner;

public class VerificadorEdad {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int edad;

        System.out.println("Bienvenido(a)");
        System.out.println("Por favor ingresa tu edad:");
        edad = scanner.nextInt();

        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else if(edad < 18){
            System.out.println("Eres menor de edad");
        }
        else{
            System.out.println("Ingresaste un dato inválido");
        }
    }
}

package Ejercicios4;

import java.util.Scanner;

public class Ejercicio4_4Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre + " que tal");
        scanner.close();
    }
}

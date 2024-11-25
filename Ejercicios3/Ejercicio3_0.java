package Ejercicios3;

import java.io.Console;

public class Ejercicio3_0 {
    public static void main(String[] args) {
        int temp = Integer.parseInt(System.console().readLine());
        System.out.println("La temperatura es de: " + temp);
        if (temp > 0) {
            System.out.println(temp + "ºC positivos");
        }
        else if (temp < 0) {
            System.out.println(temp + "ºC negativos");
        }
    }
}

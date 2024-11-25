package Ejercicios4;

public class Ejercicio4_3parFor {
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        int num = Integer.parseInt(System.console().readLine());
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

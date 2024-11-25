package Ejercicios4;

public class Ejercicio4_01 {
    public static void main(String[] args) {
        int contador = 0;
        int num = Integer.parseInt(System.console().readLine());
        // Incrementamos con while
        while (contador < num) {
            contador++;
            System.out.println(contador);
        }
        System.out.println("Programa terminado");
    }
}

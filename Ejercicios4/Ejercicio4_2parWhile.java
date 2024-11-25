package Ejercicios4;

public class Ejercicio4_2parWhile {
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        int num = Integer.parseInt(System.console().readLine());
        int contador = 0;
        //Solo imprime numeros pares
        while (contador <= num) {
            System.out.println(contador);
                contador += 2;
        }
    }
}


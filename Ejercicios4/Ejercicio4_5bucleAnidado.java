package Ejercicios4;

public class Ejercicio4_5bucleAnidado {
    private static final int TAM = 10;

    public static void main(String[] args) {
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }

    }
}

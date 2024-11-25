package PiramideConsola;

public class piramideConsola {
    public static void main(String[] args) {
        System.out.println("Introduce la altura de la piramide: ");
        int altura = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < altura; i++) {
            //Imprimir asteriscos
            for (int j = 1; j <= ( i - 1); j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

package PiramideConsola;

public class piramideBuena {
    public static void main(String[] args) {
        System.out.println("Introduce altura de piramide: ");
        int altura = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= altura; i++) {
            //Imprime los espacios
            for (int j = i; j < altura; j++) {
                System.out.print(" ");
            }
            //Imprime los asteriscos
            for(int j = 1; j <= (2 * i - 1); j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}

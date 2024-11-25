package Ejercicios2;

public class Ejercicio2_7 {
    public static void main(String[] args) {
        String apellido1 = "Perez";
        String apellido2 = "Garcia";
        String hijo1 = "Juan";
        String hijo2 = "Mario";
        String hijo3 = "Lucas";
        String padre = "Alberto";
        String madre = "Maria";
        String apellidosHijos = apellido1 + " " + apellido2;
        System.out.println("Padre: " + padre +" " + apellido1);
        System.out.println("Madre: " + madre +" " + apellido2);
        System.out.println("Hijo1: " + " " + hijo1 + " " + apellidosHijos);
        System.out.println("Hijo2: " + " " + hijo2 + " " + apellidosHijos);
        System.out.println("Hijo3: " + " " + hijo3 + " " + apellidosHijos);
        System.out.println("Hijo1 " + args.length + " " + apellidosHijos);
    }
}

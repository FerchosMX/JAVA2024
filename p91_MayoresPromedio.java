import java.util.ArrayList;
import java.util.Scanner;

public class p91_MayoresPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");

        System.out.print("\nIngrese la cantidad de calificaciones: ");
        int n = scanner.nextInt();

        ArrayList<Float> calificaciones = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones.add(scanner.nextFloat());
        }

        System.out.println("\nCalificaciones ingresadas:");
        for (Float calificacion : calificaciones) {
            System.out.println(calificacion);
        }

        float suma = 0;
        for (Float calificacion : calificaciones) {
            suma += calificacion;
        }
        float promedio = suma / n;

        System.out.println("\nSuma de las calificaciones: " + suma);
        System.out.println("\nPromedio de las calificaciones: " + promedio);

        System.out.println("\nCalificaciones mayores al promedio: ");
        int cont = 0;
        for (Float calificacion : calificaciones) {
            if (calificacion > promedio) {
                System.out.println(calificacion);
                cont++;
            }
        }

        System.out.println("\nCantidad de calificaciones mayores al promedio: " + cont);

        scanner.close();
    }
}

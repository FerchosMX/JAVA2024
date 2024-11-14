import java.util.ArrayList;
import java.util.Scanner;

public class p92_MayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");

        System.out.print("\nIngrese la cantidad de números: ");
        int n = scanner.nextInt();
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }

        System.out.println("\nNúmeros del Arreglo:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        int mayor = numeros.get(0);
        int menor = numeros.get(0);

        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("\nEl número mayor es: " + mayor);
        System.out.println("\nEl número menor es: " + menor);

        scanner.close();
    }
}

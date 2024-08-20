/*  Objetivo - Calcular la hipotenusa de un triángulo dadas las longitudes de su lado

Formula: Hipotenusa = raizcuadrada (longitudlado1 * LongitudLado1 + longitudLado2 * longitudLado2) */
import java.util.Scanner;

public class p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        double longlad1, longlad2, hipo;

        System.out.println("Cuál es el valor de la 1ra longitud?: ");
        longlad1 = new Scanner(System.in).nextDouble();

        System.out.println("Cuál es el valor de la 2da longitud?: ");
        longlad2 = new Scanner(System.in).nextDouble();

        hipo = Math.sqrt((longlad1 * longlad1)+(longlad2 * longlad2));

        System.out.printf("La hipotenusa es: %.2f\n",hipo);
    }
}

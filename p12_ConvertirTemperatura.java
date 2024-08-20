// Objetivo - Se desea convertir una temperatura de grados fahrenheit a grados celsius
// Formula: celsius = (fahrenheit – 32) * (5/9)

import java.util.Scanner;

public class p12_ConvertirTemperatura {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        Double celsius,fahrenheit;

        System.out.println("\nEste es un programa para convertir de fahrenheit a Celsius\n");
        System.out.println("Cuál es el valor en fahrenheit?: ");
        fahrenheit = new Scanner(System.in).nextDouble();

        celsius = (fahrenheit - 32) * (5.0/9.0);

        System.out.format("El resultado en Celsius es: %.2f",celsius);
    }
}

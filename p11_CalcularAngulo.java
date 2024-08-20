// Objetivo - Calcular el 3er ángulo de un triángulo dados los dos primeros ángulos
// Angulo3 = 180 - (angulo1 + angulo2)

import java.util.Scanner;

public class p11_CalcularAngulo {
    public static void main(String[] args) {
        int angulo1, angulo2, angulo3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame el valor del primer ángulo: ");
        angulo1 = scanner.nextInt();
        
        System.out.println("Dame el valor del segundo ángulo: ");
        angulo2 = scanner.nextInt();

        angulo3 = 180 - (angulo1 + angulo2);

        System.out.println("El 3er ángulo es: "+angulo3);
    }
}


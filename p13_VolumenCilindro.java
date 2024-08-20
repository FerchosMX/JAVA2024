// Objetivo: Se desea calcular el volumen de un cilindro dado su radio y altura.
// Formula: volumen = PI * (radio * radio) * altura

import java.util.Scanner;

public class p13_VolumenCilindro { 
    public static void main(String[] args) {
        double radio, altura, volumen;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDame el valor de la altura: ");
        altura = scanner.nextDouble();

        System.out.println("\nDame el valor del radio: ");
        radio = scanner.nextDouble();

        scanner.close();
        volumen = Math.PI * (radio * radio) + altura;
        System.out.println("El resultado es: "+volumen);
    }
    
}

// Verifica si un numero es positivo, negativo o cero

import java.util.Scanner;

public class p21_VerificaNumero {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Verificando si un numero esp ositivo, negativo o cero");
        System.out.println("\nDame un numero: ");
        int numero = new Scanner(System.in).nextInt();
        
        if(numero>0) System.out.println("\nEl numero "+numero+ " es positivo");
        if(numero<0) System.out.println("\nEl numero "+numero+ " es negativo");
        if(numero==0) System.out.println("\nEl numero "+numero+ " es cero");

        System.out.println("\nGracias por usar este sistema tan sofisticado");
    }
}

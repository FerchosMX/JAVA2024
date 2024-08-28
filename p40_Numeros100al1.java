// Objetivo - Imprimir los numeros del 100 al 1

import java.util.Scanner;

public class p40_Numeros100al1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
 
        System.out.println("Imprimiendo numeros de un valor indicado a uno\n");
        System.out.println("Desde dónde deseas descender?: ");
        int c = new Scanner(System.in).nextInt();
        System.out.println("Decrementos en: ");
        int d = new Scanner(System.in).nextInt();

        while (c >= 1){ 
            System.out.printf("Burritos %d \n",c);
            c = c - d;
        }
        System.out.println("\nEl ciclo ha terminado...");
    }
}

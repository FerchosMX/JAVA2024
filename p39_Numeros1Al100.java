
// Objetivo -imprimir los numeros del 1 al 100 con while

import java.util.Scanner;

public class p39_Numeros1Al100 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Imprimiendo los numeros de 0 a n");
        System.out.println("Dime el valor límite: "); int n = new Scanner(System.in).nextInt();
        System.out.println("el valor subirá en incrementos de: "); int i = new Scanner(System.in).nextInt();
       
        int c = 0;

        while (c <= n){
            System.out.printf("Chilaquil %d \n ",c);
            c = c+i;
        }
        
        System.out.println(c);
        System.out.println("\nEl ciclo ha terminado");
    }
}

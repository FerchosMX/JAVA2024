// Objetivo - Imprime los numeros de 1 a 100

import java.util.Scanner;

public class p52_Numeros1aN {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); 

        System.out.println("Imprime los numeros de 1 a n usando for: ");
        System.out.println("Hasta dónde deseas llegar?: ");
        int n = new Scanner(System.in).nextInt();

        for(int i=1; i<=n; i++)
            System.out.println(i+" ");
    }
    
}

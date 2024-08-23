// Dado un nunero entre 1 y 4, se desea mostrar con letra la estación del año

import java.util.Scanner;

public class p25_EstacionesAño {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Dame un numero entre 1 y 4 y te diré que estación del año es: ");
        int n = new Scanner(System.in).nextInt();

        if (n>=1 && n<=4) { 
            // && Significa que queremos que se cumplan ambas condiciones-------
            if (n==1) System.out.println("\nPrimavera"); 
            if (n==2) System.out.println("\nVerano"); 
            if (n==3) System.out.println("\nOtoño"); 
            if (n==4) System.out.println("\nInvierno"); 
            System.out.println("\nChido");
        } else{ 
            System.out.println("\nEsa estación no existe, intente de nuevo");
        }
    }
}

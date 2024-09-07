// Objetivo - Se desea imprimir la secuencia de términos armónicos el número de renglones que el usuario deseé y su suma

import java.util.Scanner;

public class p63_SumaTerminos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        int i,n;
        double r = 0;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("Cuantos números ? "); n = obj.nextInt();
            
            System.out.print("Salida: ");
            for(i=1; i<=n; i++) {
                System.out.print("1/ "+i);
                if (i < n) {
                    System.out.print(" + ");
                }
                r += 1.0 / i;
                }
            System.out.printf("\nSuma es = %,.4f\n",r);
            System.out.print("\nDeseas continuar (S/N)?: ");
            resp=Character.toUpperCase(obj.next().charAt(0));
        } while( resp!= 'N');
        System.out.println("\nProceso terminado ..");
    }
    
}

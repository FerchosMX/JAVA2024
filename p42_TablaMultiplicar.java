// Objetivo - Imrpime la tabla de multiplicar

import java.util.Scanner;

public class p42_TablaMultiplicar {
    public static void main(String[] args) {

        int t,c,n;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush(); 
        System.out.println("Imprime la tabla de multiplicar\n");
        System.out.print("Qué tabla quiéres?: "); t=obj.nextInt();
        System.out.print("Hasta qué valor quiéres?: "); n=obj.nextInt();

        //t=1;
        c=1;

        while (c <= n) {
            System.out.printf("%d x %d = %d \n",t,c, t*c) ;
            c++;
        }
        System.out.println("\n Proceso Terminado :)");
    }
    
}

// Objetivo - Dados tres números, verificar cual es el mayor

import java.util.Scanner;

public class p34_NumeroMayor {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        int a,b,c,max;

        Scanner obj = new Scanner(System.in);

        System.out.println("---Dame 3 valores enteros---");
        System.out.println("1er Valor: "); a = obj.nextInt();
        System.out.println("2do Valor: "); b = obj.nextInt();
        System.out.println("3er Valor: "); c = obj.nextInt();

        if (a>b) {
            if (a>c) {
                System.out.println(+a+" es mayor");
            } else {
                System.out.println(+c+" es el valor mayor");
            } 
        }else if (b>c) {
            System.out.println(+b+" es el valor mayor");
        } else {   
            System.out.println(+c+" es el valor mayor");
        }
    }   
}

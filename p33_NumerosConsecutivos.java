// Objetivo - Crear un programa en el que dados 3 no. enteros, verificar si son consecutivos

import java.util.Scanner;

public class p33_NumerosConsecutivos {
    public static void main(String[] args) {
        int a,b,c;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Dame 3 numeros: "); 
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        if (a+1==b && b+1==c) {
                System.out.println("Si son números consecutivos: "+a+","+b+","+c);
        } else System.out.println("No son números consecutivos");
 
        }
    }
    


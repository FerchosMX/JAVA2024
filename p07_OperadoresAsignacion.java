// Objetivo - Efectua diferentes operaciones usando los diferentes operadores de asignación

import java.util.Scanner;

public class p07_OperadoresAsignacion {
    public static void main(String[] args) {
        //Borra la pantalla de la terminal
        System.out.print("\033[H\033[2J"); System.out.flush(); 

        System.out.println("Dame un numero: ");
        float num = new Scanner(System.in).nextInt();

        System.out.printf("El numero original es: %.2f\n",num);
        System.out.printf("Incrementar 1: %.2f\n",++num);
        System.out.printf("Sumar 80: %.2f\n",num+=80);
        System.out.printf("Restar 35: %.2f\n",num-=35);
        System.out.printf("Multiplicar por 15: %.2f\n",num*=15);
        System.out.printf("Dividr entre 4: %.2f\n",num/=4);
        System.out.printf("Decrementar 1: %.2f\n",--num);
    }
}

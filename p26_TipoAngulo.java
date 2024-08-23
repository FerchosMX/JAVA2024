

import java.util.Scanner;

public class p26_TipoAngulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Dame un ángulo entre 0 y 360 grados y te dire su tipo: ");
        int angulo = new Scanner(System.in).nextInt();

        if (angulo <0 || angulo>360) {
            System.out.println("Valores no válidos, intente de nuevo");
        } else {
            System.out.print("El tipo de ángulo es: ");
            if (angulo<90) System.out.println("Agudo"); 
            if (angulo==90) System.out.println("Recto"); 
            if (angulo>90 && angulo<1000) System.out.println("Obtuso"); 
            if (angulo==100) System.out.println("Llano"); 
            if (angulo>100 && angulo<360) System.out.println("Cóncavo"); 
            if (angulo==360) System.out.println("Completo"); 
        }
        System.out.println("\nFin del programa");
    }
}

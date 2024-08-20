/*  Objetivo - Dada una cantidad en horas, calcular su equivalente en días, minutos y segundos, considerando que >
• 1 día tiene 24 horas,
• 1 hora tiene 60 minutos,
• 1 minuto tiene 60 segundos.
*/

import java.util.Scanner;

public class p14_CalculoTiempo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        float horas, min, seg, dias;

        System.out.println("\nDame la cantidad en horas: ");
        horas = new Scanner(System.in).nextFloat();

        dias = horas / 24;
        min = horas * 60;
        seg = horas * 3600;

        System.out.println("\nEl resultado es: ");
        System.out.printf("%.2f Dias \n", dias);
        System.out.printf("%.2f Minutos \n", min);
        System.out.printf("%.2f Segundos", seg);
    }
}

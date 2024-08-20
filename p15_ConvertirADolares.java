// Objetivo: Crear un programa que dada una cantidad de pesos y el precio del dolar, de un valor equivalente en dolares

import java.text.DecimalFormat; //Función para limitar los decimales
import java.util.Scanner;

public class p15_ConvertirADolares {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        double pesos, dolares;
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("\nDame una cantidad en pesos MXN: ");
        pesos = new Scanner(System.in).nextDouble();

        dolares = pesos / 18.79;

        System.out.println("Dolares: "+df.format(dolares)+" USD");
    }  
}

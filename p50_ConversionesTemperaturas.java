/* Objetivo - Se desea calcular la temperatura convertida de grados centígrados a grados farenheit de un rango de valores
introducidos por el usuario, es decir el usuario introduce la temperatura inicial y la temperatura final en grados
centígrados y el programa realiza la conversión a farenheit incrementando el valor inicial en 1, hasta llegar al
valor final. Se deberá validar el rango, es decir Final no puede ser menor a Inicial. El proceso debe de poder
repetirse hasta que el usuario lo decida.
*/

import java.util.Scanner;

public class p50_ConversionesTemperaturas {
    public static void main(String[] args) {
        int ini, fin;
        char resp;

        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();

        do{ 
        System.out.println("Tabla de conversión de peso a Celsius a Fahrenheit");
            do {
                System.out.print("Dame el valor inicial en Celsius: "); ini = obj.nextInt();
                System.out.print("Dame el valor final en Celsiu:  "); fin = obj.nextInt();
                
                if (fin < ini) { // válida que el inicio sea menor que fin
                    System.out.println("El valor final no puede ser menor que el valor inicial");
                } 
            } while (fin < ini);
            System.out.println("Celsius \t Fahrenheit");
            System.out.println("------------------------------------------");
            for (int c = ini; c <= fin; c++) {
                float fahrenheit = (c * 9/5) + 32;
                System.out.printf("%d \t\t %.2f\n", c, fahrenheit);
            }
            System.out.println("------------------------------------------");

            System.out.print("\n¿Deseas continuar (S/N)?: ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');  

        obj.close();

    }
}

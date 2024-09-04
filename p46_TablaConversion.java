// Objetivo -

import java.util.Scanner;

public class p46_TablaConversion {
    public static void main(String[] args) {

        int ini, fin,c;
        float tc=18.74f, te=25.00f;
        char resp;

        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();

        do{ 
        System.out.println("Tabla de conversión de peso a dolar y Euro");
        do {
            System.out.println("Dame inicio: "); ini = obj.nextInt();
            System.out.println("Dame fin: "); fin = obj.nextInt();
            
        } while (fin < ini); // valida que el inicio sea menor que fin

        c = ini;
        System.out.println("Peso \t\t Dolar \t             Euro");
        System.out.println("------------------------------------------");
        while (c <= fin) {
            System.out.printf("%d  \t  - %10.2f\t -     %10.2f \n",c,c*tc,c*te);
            c++;
        }
        System.out.println("------------------------------------------");

        System.out.println("\n Deseas continuar (S/N)?: "); resp = Character.toUpperCase(obj.next().charAt(0));
    }  while(resp!='N');  
}
}

// Objetivo - Dado un número entre 1 y 6, regresar el continente que le corresponda

import java.util.Scanner;

public class p35_ContinentesMundo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("----Dame un número entre 1 y 6 y te diré el continente correspondiente----");
        int cont = new Scanner(System.in).nextInt();

        switch (cont) { 
            case 1: System.out.println("\n1 es Asia"); break;      
            case 2: System.out.println("\n2 es África"); break;      
            case 3: System.out.println("\n3 es América del Norte"); break;      
            case 4: System.out.println("\n4 es América del Sur"); break;      
            case 5: System.out.println("\n5 es Antártica"); break;      
            case 6: System.out.println("\n6 es Europa"); break;      
            default:
              System.out.println("Escriba un número entre 1 y 6 porfavor"); break;
        }
        System.out.println("\nGracias por utilizar este programa");
    }
}

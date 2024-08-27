// Objetivo - Hacer un programa en el que puedas configurar una pizza y pagarla

import java.util.Scanner;

public class p36_ComprarPizza {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner scanner = new Scanner(System.in);
        float cant,precio,total;
        float desc;
        int tamaño; 
        
        precio = total = 0;
        desc = .15f;

        System.out.println("--- Tamaños disponibles --- ");
        System.out.println("    Chica [a] - $50");
        System.out.println("    Mediana [b] - $100");
        System.out.println("    Grande [c] - $200");
        System.out.print("    Elige: ");
        char tamañoChar = scanner.next().charAt(0);

        switch (tamañoChar) {
             case 'a': tamaño = 50; break;
             case 'b': tamaño = 100; break;
             case 'c': tamaño = 200; break;
             default: System.out.println("Tamaño no válido");
             scanner.close();
              return;
        }
        
        System.out.print("\n¿Cuántas pizzas vas a comprar?: ");
        cant = scanner.nextInt();

        precio=cant*tamaño;

        if (precio>=1000) {
            total = precio * (1-desc);
        } else {
            total = precio;
        }

        System.out.println("--- Información de su Compra ---");
        System.out.println("    Cantidad de pizzas: "+cant);
        System.out.println("    Tamaño: "+tamaño);
        System.out.println("  \nCosto Final: "+total);

        scanner.close();
    }
}


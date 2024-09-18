// Objetivo - Dibuja un cuadro "r x c" del caractér deseado

import java.util.Scanner;

public class p75_CuadroCaracter {

    /**
     * Dibuja un cuadro de renglones x columnas del caracter deseado
     * @param r (int) el numero de renglones
     * @param c (int) el numero de columnas
     * @param car (char) el caracger usado para dibujar 
     * @return No regresa ningún valor (void)
     */
    
    public static void Cuadro(int r, int c, char car){
        for(int i=1; i<=r; i++) {
            for(int j=1; j<=i; j++) 
                System.out.print(car);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char car;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("Ingrese la cantidad de renglones: "); int r = obj.nextInt();
        System.out.print("Ingrese la cantidad de columnas "); int c = obj.nextInt();
        System.out.print("Ingrese el tipo de caractér: "); car = obj.next().charAt(0);

        Cuadro(r,c,car);
        Cuadro(3,4,'#');
        Cuadro(10,23,'&');

        obj.close();
    }
}

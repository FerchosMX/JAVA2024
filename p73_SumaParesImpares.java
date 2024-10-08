/**
 * Innerp73_SumaParesImpares - Suma pares o impares 
 */

import java.util.Scanner;

public class p73_SumaParesImpares {

    public static int SumaParImpar(int ini, int fin, char poi){
        int suma=0;
        for(int i=ini; i<=fin; i++) {
            if(poi=='P' && i%2==0){
                System.out.println(i+" ");
                suma+=i;
        } else if(poi=='I' && i%2!=0){
                System.out.println(i+" ");
                suma+=i;
        }
        }
        return suma;
    }

    public static void main(String[] args) {
        int ini, fin, suma;
        char poi;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.println("Suma pares o impares en un rango de valores: ");
        do { 
            System.out.print("Dame el inicio: "); ini = obj.nextInt();
            System.out.print("Dame el fin: "); fin = obj.nextInt();
        } while(fin<ini);
        System.out.println("[P]ares | [I]mpares"); poi = Character.toUpperCase(obj.next().charAt(0));

        suma = SumaParImpar(ini,fin,poi);

        if(suma!=-1)
            System.out.println("La suma es: "+suma);
        else 
            System.out.println("Solo puedo sumar pares e impares");
    }
}

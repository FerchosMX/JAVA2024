// Dado tres números enteros positivos, verificar si la suma de los dos primeros es igual al tercero

import java.util.Scanner;

public class p22_VerificarSuma {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        float n1,n2,n3;
        Scanner obj=new Scanner(System.in);

        System.out.println("Dame dos valores: \n ");
        System.out.println("\nPrimer numero: "); n1 = obj.nextFloat();
        System.out.println("\nSegundo numero: "); n2 = obj.nextFloat();
        System.out.println("\nTercer numero: "); n3 = obj.nextFloat();

        System.out.println(+n1+" + "+n2+" = "+n3);

        if (n1+n2==n3) {
            System.out.println("\nSon iguales :)"); 
        } else {
            System.out.println("\nNo son iguales >:( ");
        }
            

    }
    
}


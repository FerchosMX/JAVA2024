
// Calcula la 2da ley de newton f = m * a  | m = f / a | a = f / m 

import java.util.Scanner;

public class p28_leyDeNewton {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        float f,m,a;
        int op;
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Elige lo que deseas calcular: ");
        System.out.println("Fuerza      [1]");
        System.out.println("Masa        [2]");
        System.out.println("Aceleración [3]");
        System.out.println("---EXIT---  [4] \n");
        System.out.print("Elige una opción: "); op = obj.nextInt();

        f = m = a = 0; //Dando las 3 variables como cero (Un por si acaso no se inicializan en 0)

        if(op==1){
            System.out.println("\n----Calculando la Fuerza----");
            System.out.print("Dame la masa: "); m = obj.nextFloat();
            System.out.print("Dame la aceleración: "); a = obj.nextFloat();
            f = m * a;
            System.out.printf("La Fuerza es %.2f", f);
        }else if (op==2) {
            System.out.println("\n----Calculado la Masa----");
            System.out.print("Dame la fuerza: "); f = obj.nextFloat();
            System.out.print("Dame la aceleración: "); a = obj.nextFloat();
            m = f / a;
            System.out.printf("La Masa es %.2f", f);
        } else if (op==3){
            System.out.println("\n----Calculado la Aceleración----");
            System.out.print("Dame la fuerza: "); f = obj.nextFloat();
            System.out.print("Dame la masa: "); m = obj.nextFloat();
            a = f / m;
            System.out.printf("La Aceleración es %.2f", f);
        } else if (op==4){
            System.out.println("\nGracias por usar el programa");
        } else
            System.out.println("----Opción Inválida----");
    }
}

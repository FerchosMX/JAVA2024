import java.util.Scanner;
public class p55_SumaParesImpares {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); 

        Scanner obj = new Scanner(System.in);
        int n,s=0;
        System.out.println("---Imprime los numeros de 1 a n o de n a 1 según lo decidas---\n");
        System.out.println("Numeros de 1 a n - impares....[ 1 ]");
        System.out.println("Numeros de n a 1 - pares  ....[ 2 ]");
        System.out.println("Salir ..... ..... ....... ....[ 3 ]");
        System.out.print("Elije: "); int op = obj.nextInt();

        switch (op) {
            case 1:
                System.out.println("Imprimiendo de 1 a n ...");
                System.out.println("Hasta donde?: "); n = obj.nextInt();
                for(int i=1; i<= n; i+=2) { 
                    System.out.println(i + " ");
                    s += i;
                }
                System.out.println("La suma de impares es: "+s);
                break;
            case 2:
                System.out.println("Imprimiendo de n a 1 ...");
                System.out.println("Hasta donde?: "); n = obj.nextInt();
                for(int i=n; i>= 1; i-=2) { 
                    if(i%2==0) System.out.println(i + " ");
                    s += i;
                }
                break;
            case 3:
                System.out.println("Haz decididos salir del sistema ...");
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
        System.out.println("Proceso terminado");
        obj.close();
    }
}

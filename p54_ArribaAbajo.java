import java.util.Scanner;
public class p54_ArribaAbajo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush(); 

        int n;
        System.out.println("Imprime los numeros de 1 a n o de n a 1 según lo decidas");
        System.out.println("numeros de 1 a n ....[ 1 ]");
        System.out.println("numeros de 2 a n ....[ 2 ]");
        System.out.println("Salir ..... .... ....[ 3 ]");
        System.out.println("Elije: "); int op = obj.nextInt();

        switch (op) {
            case 1:
                System.out.println("Imprimiendo de 1 a n ...");
                System.out.println("Hasta donde?: "); n = obj.nextInt();
                for(int i=1; i<= n; i++) System.out.println(i + " ");
                break;
            case 2:
                System.out.println("Imprimiendo de n a 1 ...");
                System.out.println("Hasta donde?: "); n = obj.nextInt();
                for(int i=n; i<= 1; i--) System.out.println(i + " ");
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

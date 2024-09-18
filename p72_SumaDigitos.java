import java.util.Scanner;

public class p72_SumaDigitos {
    public static int SumaDigitos(int n){
        int suma = 0, digito;
        while (n!=0){
            digito = n%10;
            suma += digito;
            n = n / 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        int numero;
        System.out.print("\033[H\033[2J");
        System.out.println("Dame un numero entero y sumaré sus dígitos");
        numero = new Scanner(System.in).nextInt();
        System.out.println("Suma dígitos "+ SumaDigitos(numero));

        
    }
    
}

// Objetivo - Calcular el area de un tríangulo
import java.util.Scanner;

public class p03_AreaTriangulo {
    public static void main(String[] args) {
        int base, altura;
        double area;
        Scanner obj = new Scanner(System.in);

        System.out.println("Calculado el área de un triángulo");
        System.out.println("Dame la base: ");   base = obj.nextInt();
        System.out.println("Dame la Altura: "); altura = obj.nextInt();

        area = (base * altura) /2;

        System.out.println("Para un triángulo de base " + base + " y altura de " + altura + " , el area es: " + area);
    }
}

// Objetivo - Comprobar distintas operaciones matemáticas
public class p05_OperacionesMatematicas {
    public static void main(String[] args) {
        double x,y,suma,resta,multi,div,res,pot;
        x = 10.5;
        y = 2.5;
        suma = x+y;
        resta = x-y;
        multi = x*y;
        div = x/y;
        res = x%y;
        pot =Math.pow(x,y);

        System.out.println(String.format("Los numeros son: %.2f, %.2f",x,y));
        System.out.println(String.format("\nEL resultado de las operaciones es el siguiente:\n"));
        System.out.println(String.format("Suma: %.2f\nResta: %.2f",suma,resta));
        System.out.println(String.format("Multiplicación: %.2f\nDivision: %.2f",multi,div));
        System.out.println(String.format("Residuo: %.2f\nPotencia: %.2f",res,pot));
    }
}


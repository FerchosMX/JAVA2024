package p107_Forma;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Forma f1 = new forma("Rojo"); No se puede instanciar una clase abstracta.
        Circulo c1 = new Circulo ("Rojo", 10);
        Triángulo t1 = new Triángulo("Azul", 10, 20);

        ArrayList<Forma> formas = new ArrayList<>();

        System.out.print("\033[H\033[2J"); 

        System.out.println("Circulo");
        System.out.println(c1);

        System.out.println("Triángulo");
        System.out.println(t1);

        formas.add(c1);
        formas.add(t1);
        formas.add(new Circulo("Cafe",45));
        formas.add(new Triángulo("Purpura",100,200));

        System.out.println("Las formas dentro del arreglo: ");
        for(Forma forma : formas){
            System.out.println(forma);

        }  
    }
}

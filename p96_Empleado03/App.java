package p96_Empleado03;

public class App {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan Perez",25);
        Empleado empleado2 = new Empleado("Lupita",30);
        Empleado empleado3 = new Empleado();

        empleado3.setNombre("Jorge");
        empleado3.setEdad(2);

        System.out.print("\033[H\033[2J");
        
        System.out.println("Empleado 1: "+ empleado1.toString());
        System.out.println("Empleado 2: "+ empleado2.toString());
        System.out.println("Empleado 3: "+ empleado3.toString());

        empleado2.setNombre("Anastasia");
        empleado2.setEdad(15);
        System.out.println("Empleado 2 después de la transformación");
    }
}
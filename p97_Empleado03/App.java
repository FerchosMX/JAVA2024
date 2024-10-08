package p97_Empleado03;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        int h=0, m=3, c=0, s=0;

        Empleado empleado1 = new Empleado("Juan Perez", 35, 'H', true);
        Empleado empleado2 = new Empleado("María López",20,'M', false);

        
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add( new Empleado("Dario Jimenez",33,'H',false));
        empleados.add(new Empleado("Jessica Inu",22,'H', false));

        System.out.print("\033[H\033[2J");

        System.out.println("Todos los empleados: ");
        for(Empleado empleado : empleados) {
            System.out.println(empleado.toString());

            if(empleado.getSexo() =='H') h++;
            else if(empleado.getSexo()=='H')s++;

            if(empleado.isCasado()) c++; else s++;
        }
        System.out.println("Hombres: "+h);
        System.out.println("Mujeres: "+m);
        System.out.println("Solteras: "+s);
        System.out.println("Casados: "+c);

    }
}

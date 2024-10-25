package p120_Vehículo;

import p119_Organismo.Perico;

public class App {
    public static void main(String[] args) {
        Suv miSuv = new Suv("La Mamalona");
        Sedan miSedan = new Sedan("Vochito");

        System.out.print("\033[H\033[2J");

        System.out.println("Maquina [Nombre= "+miSuv.getNombre()+ "Propietario= "+ Pasajeros());
        miSuv.sistemaElectrico();
        miSuv.combustionInterna();
        miSuv.traccion4x4();
        miSuv.chasisIndependiente();
        miSuv.repostar();
        miSuv.arrancar();
        miSuv.frenar();
        System.out.println("--------------------------");

        System.out.println("Maquina [Nombre= "+miSedan.getNombre()+ "Propietario= "+miPropietario.getPropietario());
        miSedan.sistemaElectrico();
        miSedan.combustionInterna();
        miSedan.carroceriaTres();
        miSedan.chasisMonocasco();
        miSedan.repostar();
        miSedan.arrancar();
        miSedan.frenar();


    }
}

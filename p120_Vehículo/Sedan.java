package p120_Vehículo;

public class Sedan extends Maquina implements Familiar {
    public Sedan (String Nombre){
        super(Nombre);
    }

    @Override
    public void carroceriaTres() {
        System.out.println("Es un automóvil con carroceria en tres partes -> Es un Sedan");
        
    }

    @Override
    public void chasisMonocasco() {
        System.out.println("Es un automóvil con chasis monocasco -> Es un Sedan");
        
    }
    
    public void sistemaElectrico(){
        System.out.println("Es un automóvil con sistema eléctrico -> Es un Sedan");

    }
    
    public void combustionInterna(){
        System.out.println("Es un automóvil con combustión interna -> Es un Sedan");

    }
}

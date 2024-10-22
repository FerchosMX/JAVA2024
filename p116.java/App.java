package p116.java;

public class App {
    public static void main(String[] args) {
        
        JuegoDados miDados = new JuegoDados();

        System.out.print("\033[H\033[2J");
        miDados.iniciar();
        miDados.jugar();
        miDados.finazliar();
        
        juegoAdivina miAdivina = new JuegoAdivina();
        miAdivina.Iniciar();
        miAdivina.jugar();
        miAdivina.finalizar();
    }
}

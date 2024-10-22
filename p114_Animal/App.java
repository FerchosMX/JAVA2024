package p114_Animal;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        gato migato = new gato();

        migato.sonido();
        migato.dormir();
    }
}

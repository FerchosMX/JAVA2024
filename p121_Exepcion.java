public class p121_Exepcion {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        try {
            System.out.print("\033[H\033[2J");
            int c = a/b;
            System.out.println("El resultado es "+c);
        } catch (Exception e) {
            System.out.println("El denominado no puede ser 0");
        }
    }
}

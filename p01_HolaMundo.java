//Out, main 
public class p01_HolaMundo {
    public static void main(String[] args) {
        //Variables
        String amigo = "Marco";
        String hermano = "Ricardo";
        String mensaje = String.format("Tnato %s como %s desean aprender java", amigo, hermano);

        System.out.println("Hola mundo en el lenguaje Java");
        System.out.println("\nHola amigo " + amigo + " ,bienvenido a java");
        System.out.println("\nMi amigo es "+ amigo + " mi hermano es " + hermano);
        System.out.println("\n" + mensaje);
    }
}


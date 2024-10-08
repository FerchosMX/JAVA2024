package p102_AutorLibro;

public class App {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Autor autor = new Autor();

        libro1.setIsbn("124466-25-67");
        libro1.setNombre("Java para principiantes");
        libro1.setPrecio(300);
        autor.setNombre("Carlos Castañeda");
        autor.setEdad(45);
        autor.setCorreo("Castro@uaz.edu.mx");
        libro1.setAutor(autor);

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Datos del Libro 1: ");
        System.out.println("Isbn      : " + libro1.getIsbn());
        System.out.println("Nombre    : " + libro1.getNombre());
        System.out.println("Precio    : " + libro1.getPrecio());
        System.out.println("Autor     : " + libro1.getAutor().getNombre());
        System.out.println("Edad      : " + libro1.getAutor().getEdad());
        System.out.println("Correo    : " + libro1.getAutor().getCorreo());
        System.out.println(" \n" + libro1.toString());
    }
}

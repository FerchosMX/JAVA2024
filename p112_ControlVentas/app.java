package p112_ControlVentas;

public class app {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); 
        Tienda mitienda = new Tienda("Copell", "Carlos Castañeda", "Av. México 113");

        mitienda.agregarCliente(new Cliente("Felipe Calderón", "Las Lomas 123", "Cald@msn.com"));
        mitienda.agregarCliente(new Cliente("Enique Peña", "5 de mayo 321", "quiq@msn.com"));
        mitienda.agregarCliente(new Cliente("José Pepé", "Las Lomas 123", "Josed@msn.com"));
        mitienda.agregarCliente(new Cliente("Claudia Gálvez", "Palacio Nacional 321", "Peje@msn.com"));

        mitienda.getClientes().get(0).agregarVenta(new VentaContado("Martillo", 10, 60.50, 0.10, "Sacabrocados"));
        mitienda.getClientes().get(0).agregarVenta(new VentaCrédito("Pala", 2, 1170.55, 3, 0.10));

        mitienda.getClientes().get(1).agregarVenta(new VentaCrédito("Clavo", 2, 160.34, 2, 0.20));
        mitienda.getClientes().get(1).agregarVenta(new VentaCrédito("Cinta", 5, 71.34, 6, 0.20));
        mitienda.getClientes().get(1).agregarVenta(new VentaCrédito("Pala", 10, 650.33, .20, "Taladro"));

        mitienda.Reporte();
    }
    
}

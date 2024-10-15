package p111_CuentaBancariaV2;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); 

        Banco mibanco = new Banco("Barra del Bienestar","Av. México 120, La Florida");

        // Datos del Banco
        System.out.println(mibanco.getNombre());
        System.out.println(mibanco.getDomicilio());
        System.out.println();

        // Agregamos cliente al banco
        mibanco.agregarCliente(new Cliente(" Carlos Fuentes"));
        mibanco.agregarCliente(new Cliente(" José Ortiz"));
        mibanco.agregarCliente(new Cliente(" María Vazquez"));
        mibanco.agregarCliente(new Cliente(" Armando De la Fuente"));
        System.out.println("\n>>>Los clientes del banco son: ");
        mibanco.reporte();

        /// Agregamos cuentas de diferentes tipos a los clientes del Banco
        mibanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000, 0.10));
        mibanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000, 0.20));
        mibanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000, 500));
        mibanco.getClientes().get(1).agregarCuenta(new CuentaDeAhorro(2500, 500));
        mibanco.getClientes().get(2).agregarCuenta(new CuentaDeAhorro(2000, 600));
        mibanco.getClientes().get(2).agregarCuenta(new CuentaDeAhorro(2000, 0.40));
        System.out.println("\n>>>Los clientes con sus cuentas y saldos inicales son: ");
        mibanco.reporte();

        // Retiramos y depositamos a las diferentes cuentas de algunos clientes
        mibanco.getClientes().get(0).getCuentas().get(0).retira(500);
        mibanco.getClientes().get(0).getCuentas().get(1).retira(500);
        mibanco.getClientes().get(1).getCuentas().get(0).retira(100);
        mibanco.getClientes().get(2).getCuentas().get(0).retira(300);
        mibanco.getClientes().get(2).getCuentas().get(1).retira(1000);
        mibanco.reporte();
    }
}

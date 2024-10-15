package p110_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J"); 

        System.out.println("---Probanco clase cuentaBancaria---");
        CuentaBancaria c1 = new CuentaBancaria(5000);
        System.out.println("Saldo Inicial: "+ c1.getSaldo());
        c1.deposita(10000);
        System.out.println("Saldo después de 1er depósito "+c1.getSaldo());
        double cr = 400;
        boolean rsn = c1.retira(cr);
        if(rsn) System.out.println("Retiraste "+cr + " te quedan "+ c1.getSaldo());
        else System.out.println("No tienes dinero");

        System.out.println("\n---Probando clase cliente---");
        Cliente cliente1 = new Cliente("Juan Perez", c1);
        System.out.println("Cliente 1: "+ cliente1);
        Cliente cliente2 = new Cliente("Carlos Castañeda", new CuentaBancaria(1000));
        System.out.println("Cliente2: "+cliente2);
        double nvoretiro = 50;
        cliente2.getCuenta().retira(nvoretiro);
        if (cliente2.getCuenta().retira(nvoretiro))
            System.out.println("El retiro de "+ nvoretiro+ " efectuado con exito, nuevo saldo: " + cliente2.getCuenta().getSaldo());
        else System.out.println("No money man :("); 
        cliente2.getCuenta().retira(900);
        System.out.println(cliente2);
        cliente1.getCuenta().retira(9000);
        System.out.println(cliente2);

        System.out.println("\n---Probando la clase Banco---");
        Banco miBanco = new Banco("Banco del bienestar", " Campus Siglo XXI");
        miBanco.agregarCliente(cliente1);
        miBanco.agregarCliente(cliente2);
        miBanco.agregarCliente(new Cliente("Claudia la Presi", new CuentaBancaria(10000000)));
        miBanco.getClientes().get(0).getCuenta().deposita(3000);
        miBanco.getClientes().get(1).getCuenta().retira(3000);
        miBanco.getClientes().get(2).getCuenta().deposita(3000);
        System.out.println("CLIENTES DEL BANCO");
        System.out.println(miBanco);
        double total = 0.0;
        for (Cliente cte : miBanco.getClientes()){
            System.out.println(cte);
            total = total + cte.getCuenta().getSaldo();
        }
        System.out.println("Total de dinero en el banco: %."+ total);
        //Añadir comentario tarea de porqué no se marca bien el total?
    }
}

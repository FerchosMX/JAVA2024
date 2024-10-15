package p110_CuentaBancariaV1;

import java.util.ArrayList;

public class Banco {
    private String Nombre;
    private String Domicilio;
    private ArrayList<Cliente> clientes;

    public Banco(){
        clientes = new ArrayList();
        
    }
    public Banco(String nombre, String domicilio){
        this(); // Invoca el constructor vacio de la misma clase
        this.Nombre = nombre;
        this.Domicilio = domicilio;
    }
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
    @Override
    public String toString() {
        return "Banco [Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", clientes=" + clientes.size()+ "]";
    }
    
}

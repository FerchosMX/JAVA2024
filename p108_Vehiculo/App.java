package p108_Vehiculo;

public class App {
    public static void main(String[] args) {
        
    }
    /*
    package p108_Vehiculo;
    
    import java.util.Scanner;
    import java.util.ArrayList;
    
    public class App {
        public static Factura Llenar(){
            Factura f = new Factura();
            Cliente c = new Cliente();
            Scanner obj = new Scanner(System.in);
            System.out.println("Dame los datos de la Factura y el Cliente");
            System.out.println("Id Factura     : "); f.setSerie(obj.nextInt());
            System.out.println("Monto          : "); f.setPrecio(obj.nextDouble());
            System.out.println("Cliente Id     : "); c.setAño(obj.nextInt());
            return f;
            }
    
        public static void main(String[] args) {
            ArrayList <Factura> facturas = new ArrayList<>();
    
            Factura f1 = new Factura(1, 1500, new Cliente(1, "Juan Perez",0.03f));
            Factura f2 = new Factura(2, 2300, new Cliente(1, "Juan Perez",0.03f));
            facturas.add(f1);
            facturas.add(f2);
            Factura f3 = new Factura();
            f3 = Llenar();
            System.out.println("Mi Factura es: "+f3.toString());
            facturas.add(f3);
    
            Factura f4 = new Factura();
            f4 = Llenar();
            System.out.println("Mi otra factura es: "+f4.toString());
            facturas.add(f4);
    
            System.out.println("---Todas las facturas---");
            System.out.print("\033[H\033[2J");
            for (Factura factura : facturas){
                System.out.println("Id Factura     : "+factura.getId());
                System.out.println("Monto          : "+factura.getMonto());
                System.out.println("Cliente Id     : "+factura.getCliente().getId());
                System.out.println("Cliente nombre : "+factura.getCliente().getNombre());
                System.out.println("Cliente Desc   : "+factura.getCliente().getDescuento());
        }
    }
    }
    
}


import p103_ClienteFactura.Factura;


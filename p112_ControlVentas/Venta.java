package p112_ControlVentas;

public abstract class Venta {
    private String Artículo;
    private int Cantidad;
    private double Precio;
    public double Total;

    public Venta(String artículo, int cantidad, double precio) {
        Artículo = artículo;
        Cantidad = cantidad;
        Precio = precio;
        Total = Cantidad * Precio;
    }
    public abstract double getTotalVenta();
    @Override
    public String toString() {
        return "Venta [Artículo = " + Artículo + ", Cantidad = " + Cantidad + ", Precio = " + Precio + ", Total = " + Total
                + "]";
    }
    
    
}

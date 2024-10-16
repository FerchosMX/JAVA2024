package p112_ControlVentas;

public class VentaCrédito extends Venta{
    private int Meses;
    private double Intereses;
    
    public VentaCrédito(String artículo, int cantidad, double precio, int meses, double intereses) {
        super(artículo, cantidad, precio);
        Meses = meses;
        Intereses = intereses;
    }

    public double getTotalVenta(){
        Total = Total + (Meses * Intereses);
        return Total;
    }

    @Override
    public String toString() {
        return "VentaCrédito [Meses=" + Meses + ", Intereses=" + Intereses + ", Total = " + getTotalVenta()
                + "]";
    }



    
}

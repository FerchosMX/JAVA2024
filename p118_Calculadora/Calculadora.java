package p118_Calculadora;

public class Calculadora implements Calcular {
// Override and implement methods
    public void mostrarResultado(double resultado) {
        System.out.printf("%.2f \n", resultado);        
    }

    @Override
    public void restar(double x, double y) {
        double resultado = x - y;
        mostrarResultado(resultado);
        
    }

    @Override
    public void sumar(double x, double y) {
        double resultado = x + y;
        mostrarResultado(resultado);
        
    }

    @Override
    public void dividir(double x, double y) {
        double resultado = x / y;
        mostrarResultado(resultado);
        
    }

    @Override
    public void multiplicar(double x, double y) {
        double reusltado = x * y;
        mostrarResultado(reusltado);
        
    }
    
}

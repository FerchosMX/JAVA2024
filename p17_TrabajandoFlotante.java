// Trabajando con numeros y literales de tipo flotantes
public class p17_TrabajandoFlotante {
    public static void main(String[] args) {
        float num1 = 423.54f; //Se agrega la f para catagolar el valor como flotantes
        float num2 = 123;
        float num3 = 1.9e-8f;

        double num4 = 123123.4343d;
        double num5 = .4523;

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Uso de String.format para formateo de numeros flotantes: \n");
        System.out.println(String.format("num1 y num2 en formato flotantes: %f - %f",num1,num2));
        System.out.println(String.format("num1 y num2 en formato flotantes con decimales: %.2f - %.3f",num1,num2));
        System.out.println(String.format("num1 en formato flotantes alineado: %10.2f",num1)); //El "10" es que se dejaran 10 espacios en la izquiera
        System.out.println(String.format("num2 en formato flotantes alineado: %10.2f",num2));
        System.out.println(String.format("num3 en formato exponencial: %e",num3));
        System.out.println(String.format("num3 en formato exponencial cifras: %.3e",num3));
        System.out.println(String.format("num4 con separador de miles y decimales: %.2f",num4));
        System.out.println(String.format("num5 en formato flotantes: %f",num5));

        System.out.printf("\nUso de System.out.printf para format de numeros flotantes \n");
        System.out.printf("num1 y num2 en formato flotante: %f - %f \n",num1,num2);
        System.out.printf("num3 y num4 en formato flotante con decimales: %.2f - %.2f \n",num3,num4);
        System.out.printf("num4 y num5 en formato exponencial: %e - %e \n",num4,num5);
        System.out.printf("num4 y num5 en formato exponencial con decimales: %.2e - %.2e \n",num4,num5);

        System.out.println("\n uso MIN_VALUE y MAX_VALUE conocer los rangos de los útlimos flotantes ");
        System.out.println(String.format("\n Tipo: float Min: float, Min: %.f Max: %f",Float.MIN_VALUE,Float.MAX_VALUE));
        System.out.println(String.format("\n Tipo: float Min: float, Min: %f Max: %f",Double.MIN_VALUE,Double.MAX_VALUE));

    }
    
}

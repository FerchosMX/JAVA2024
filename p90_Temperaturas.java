import java.util.ArrayList;
import java.util.Arrays;

public class p90_Temperaturas {
    public static void main(String[] args) {
        ArrayList<Float> temperaturas = new ArrayList<>(Arrays.asList(
            2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f
        ));

        System.out.print("\033[H\033[2J");

        System.out.println("\nPrimer elemento: " + temperaturas.get(0));

        System.out.println("\nTercer elemento: " + temperaturas.get(2));

        System.out.println("----------------------------");

        System.out.println("\nElementos del ArrayList: ");
        for (Float temp : temperaturas) {
            System.out.print(temp+", ");
        }

        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > 10) {
                temperaturas.set(i, 0f);
            }
        }

        System.out.println("\nElementos después de poner a 0 los mayores a 10: ");
        for (Float temp : temperaturas) {
            System.out.print(temp+", ");
        }
    }
}

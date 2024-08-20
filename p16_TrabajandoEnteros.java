// Objetivo - 
public class p16_TrabajandoEnteros {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        int num1 = 42;
        int num2 = 0x2A; //mismo numero pero formato hexadecimal
        int num3 = 0b00101010; // Lo mismo pero en binario

        byte val1 = 120, val2 = 1;
        short horas = 24, dias = 9999;
        long ganancia = 391579108;

        System.out.println("\nUso de String.format para formateo de numeros enteros: ");
        System.out.println(String.format("num1 en base decimal : %d", num1));
        System.out.println(String.format("num1 en base octal: %o", num1));
        System.out.println(String.format("num2 en base hexadecimal: %x", num2));
        //La %,d hace que el valor utilice comas "1,000"
        System.out.println(String.format("La ganancia anual : %,d", ganancia)); 

        System.out.println("\nUso de Integer.toString para formateo de números enteros: ");
        System.out.println("num2 en base decimal: "+Integer.toString(num2));
        System.out.println("num2 en base octal: "+Integer.toString(num2,8));
        System.out.println("num2 en base hexadecimal: "+Integer.toString(num2,16));
        System.out.println("num2 en base binaria:: "+Integer.toString(num2,2));
        System.out.println("num3 en base binaria:: "+Integer.toString(num3,2));

        System.out.println("\nUso de System.out.printf para dar formato a numeros enteros: ");
        System.out.printf("val1, val2 en forma decimal: %d - %d \n",val1 ,val2);
        System.out.printf("horas, dias en forma decimal: %d - %d \n",horas, dias);
        System.out.printf("horas, dias en forma octal: %o - %o \n",horas, dias);
        System.out.printf("horas, dias en forma hexadecimal: %x - %x \n",horas, dias);

        System.out.println("\n Uso de MIN_Value y MAX_VALUE para conocer los rangos de la ");
        System.out.println(String.format("\n Tipo: byte MIN: %d Max: %d",Byte.MIN_VALUE, Byte.MAX_VALUE));
        System.out.println(String.format("\n Tipo: short MIN: %d Max: %d",Short.MIN_VALUE, Short.MAX_VALUE));
        System.out.println(String.format("\n Tipo: int MIN: %d Max: %d",Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.println(String.format("\n Tipo: long MIN: %d Max: %d",Long.MIN_VALUE, Long.MAX_VALUE));

    }
    
}

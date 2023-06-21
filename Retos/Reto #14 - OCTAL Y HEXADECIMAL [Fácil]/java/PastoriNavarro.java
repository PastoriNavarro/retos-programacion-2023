## Numero Octal y Hexadecimal de un número introducido por teclado

  import java.util.HashMap;
import java.util.Scanner;

public class OctalHexagesimal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número decimal");
        int numero10 = teclado.nextInt();

        System.out.println("Numero Octal De " + numero10 + " es: " + octal(numero10));
        System.out.println("Numero Hexadecimal De " + numero10 + " es: " + hexadecimal(numero10));

    }

    public static int octal(int numeroDecimal) {
        String resultado = "";
        int residuo;
        int cociente;
        residuo = numeroDecimal % 8;
        cociente = numeroDecimal / 8;
        resultado += residuo;

        for (int i = 0; i < numeroDecimal; i++) {

            if (cociente > 7) {
                residuo = cociente % 8;
                cociente = cociente / 8;
                resultado += residuo;

            } else {
                resultado += cociente;
                break;
            }
        }
        String invertida = new StringBuilder(resultado).reverse().toString();
        return Integer.parseInt(invertida);
    }

    public static String hexadecimal(int numeroDecimal) {
        HashMap<Integer, String> hexa = new HashMap<>();
        hexa.put(0, "0");
        hexa.put(1, "1");
        hexa.put(2, "2");
        hexa.put(3, "3");
        hexa.put(4, "4");
        hexa.put(5, "5");
        hexa.put(6, "6");
        hexa.put(7, "7");
        hexa.put(8, "8");
        hexa.put(9, "9");
        hexa.put(10, "A");
        hexa.put(11, "B");
        hexa.put(12, "C");
        hexa.put(13, "D");
        hexa.put(14, "E");
        hexa.put(15, "F");

        String resultado = "";
        int residuo;
        int cociente;
        residuo = numeroDecimal % 16;
        cociente = numeroDecimal / 16;
        resultado += residuo;

        for (int i = 0; i < numeroDecimal; i++) ;

        if (cociente > 15) {
            residuo = cociente % 16;
            cociente = cociente / 16;
            resultado += hexa.get(residuo);

        } else {
            resultado += hexa.get(cociente);

        }
        return new StringBuilder(resultado).reverse().toString();
    }


}



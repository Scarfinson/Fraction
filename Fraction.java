
//@author scarfinson
import java.util.InputMismatchException;
import java.util.Scanner;

public class Fraction {

    public static void main(String[] args) {
        Fraction metodo = new Fraction();
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.print("Entrada: ");
            String x = metodo.obtenerFraccion(entrada.nextDouble());
            System.out.println("Salida: " + x);
        } catch (InputMismatchException e) {
            System.err.println("Ha ingresado datos no válidos. Revise de nuevo.");
        }
    }

    public String obtenerFraccion(double x) {
        double denominador = Math.pow(10, String.valueOf(x).length() - 1);
        double numerador = denominador * x;
        int numeros[] = {2, 5};
        for (int i = 0; i < numeros.length; i++) {
            while (true) {
                if (numerador % numeros[i] == 0 && denominador % numeros[i] == 0) {
                    numerador = numerador / numeros[i];
                    denominador = denominador / numeros[i];
                } else {
                    break;
                }
            }
        }
        return (int) numerador + "/" + (int) denominador;
    }
}

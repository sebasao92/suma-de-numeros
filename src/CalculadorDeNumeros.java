import java.util.List;
import java.util.Scanner;

public class CalculadorDeNumeros {

    private static Scanner scanner = new Scanner(System.in);

    public static void calcular(){

        String cadena = scanner.nextLine();

        List<Integer> listaDeNumeros = ExtractorDeNumeros.extraerNumerosDe(cadena);
        Integer resultado = SumadorDeNumeros.sumarNumeros(listaDeNumeros);

        System.out.println("El resultado de la suma de los números es: " + resultado);
    }
}

import java.util.LinkedList;
import java.util.List;

public class ExtractorDeNumeros {

    public static List<Integer> extraerNumerosDe(String cadena) {

        String[] cadenaDividida = cadena.trim().split(" ");
        List<Integer> listaDeNumeros = new LinkedList<>();

        for (String elemento : cadenaDividida) {
            Integer numero = convertirANumero(elemento);
            if(numero != null) {
                listaDeNumeros.add(numero);
            }
        }

        return listaDeNumeros;
    }

    public static Integer convertirANumero(String numeroComoString){

        try {
            return Integer.parseInt(numeroComoString);
        }catch (NumberFormatException ex){
            if(!numeroComoString.isEmpty()) {
                System.out.println("\"" + numeroComoString + "\"" + " no es un número");
            }
        }

        return null;
    }
}

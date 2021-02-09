import java.util.List;

public class SumadorDeNumeros {

    public static Integer sumarNumeros(List<Integer> numeros) {

        Integer resultado = 0;

        for(Integer numero : numeros){
            resultado+=numero; // resultado = resultado + numero;
        }

        return resultado;
    }
}

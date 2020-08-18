package Lambda;

import java.util.HashMap;
import java.util.Map;


public class InterfaceFuncional {
    private static Map<Integer, Long> mapaFat = new HashMap<>();

    public static Long fatorialMemoization (int valor) {
        if (valor == 1) return 1L;
        if (mapaFat.containsKey(valor)) return mapaFat.get(valor);
        Long resultado = valor *  fatorialMemoization(valor-1);
         mapaFat.put(valor, resultado);
         return resultado;
    }

    public static void main(String args[]) {
        //testando a interface funcional
        Funcao fun = valor -> "Interface Funcional :: " + valor;
        System.out.println(fun.gerar("teste abracadabra"));

        //testando a eficcácia do mapeamento
        long start = System.nanoTime();
        System.out.println(InterfaceFuncional.fatorialMemoization(7));
        long end = System.nanoTime();
        System.out.println("Tempo gasto em nanosegundos sem mapeamento foi: "+(end-start));

        start = System.nanoTime();
        System.out.println(InterfaceFuncional.fatorialMemoization(9));
        end = System.nanoTime();
        System.out.println("Tempo gasto em nanosegundos com mapeamento foi: "+(end-start));
      }

    }

    @FunctionalInterface
            // obrigo a ser uma interface
    interface Funcao {
        String gerar(String valor);
    }

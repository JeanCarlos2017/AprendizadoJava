package Lambda;


import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

// Recursive.java
// @param <I> - Functional Interface Type
public class Recursive<I> {
   public I func;
   private static Map<Integer, Long> MAPA_FATORIAL = new HashMap<>();

    // Test.java
    static double factorial(int n) {

        Recursive<IntToDoubleFunction> recursive = new Recursive<>();
        recursive.func = x -> (x == 0) ? 1 : x * recursive.func.applyAsDouble(x - 1);

        return recursive.func.applyAsDouble(n);
    }

    Function<Integer, Long> fact = x -> {
        BiFunction<BiFunction, Integer, Long> factHelper =
                (f, d) -> (d == 0) ? 1 :
                        d*(long)f.apply(f,d-1);

        return factHelper.apply(factHelper, x);
    };

    static Function<Integer, Long> fatorialRecursiveMemoizing= x -> {
        BiFunction<BiFunction, Integer, Long> factHelper =
                (f, d) -> {
                    if (d == 0) return 1L;
                    if (MAPA_FATORIAL.containsKey(d)) return MAPA_FATORIAL.get(d);
                    Long resultado = d*(long)f.apply(f,d-1);
                    MAPA_FATORIAL.put(d, resultado);
                    return resultado;
                };
        return factHelper.apply(factHelper, x);
    };


    public static void main (String args[]){
        //System.out.println(Recursive.fatorialRecursiveMemoizing.apply(3));
        //testando a eficcácia do mapeamento
        long start = System.nanoTime();
        System.out.println(Recursive.fatorialRecursiveMemoizing.apply(15));
        long end = System.nanoTime();
        System.out.println("Tempo gasto em nanosegundos sem mapeamento foi: "+(end-start));

        start = System.nanoTime();
        System.out.println(Recursive.fatorialRecursiveMemoizing.apply(19));
        end = System.nanoTime();
        System.out.println("Tempo gasto em nanosegundos com mapeamento foi: "+(end-start));
    }

}
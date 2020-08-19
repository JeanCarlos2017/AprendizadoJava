package Threads;

import java.util.stream.IntStream;

public class ParallelStream {
    public static long fatorial (int num){
        long fat = 1;
        for (int i = num; i > 1; i--){
            fat*=i;
        }
        return fat;
    }
    public static void main (String[] args){
        //System.out.println(PararelStream.fatorial(5));
        long inicio, fim;
        inicio = System.currentTimeMillis();
        IntStream.range(1, 100000).forEach(num-> fatorial(num));
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto em nanosegundos no processamento ::"+(fim - inicio));

        inicio = System.currentTimeMillis();
        IntStream.range(1, 100000).parallel().forEach(num-> fatorial(num));
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto em nanosegundos no processamento paralelo ::"+(fim - inicio));
    }
}

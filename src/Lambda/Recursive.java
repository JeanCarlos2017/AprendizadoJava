package Lambda;


import java.util.function.IntToDoubleFunction;

// Recursive.java
// @param <I> - Functional Interface Type
public class Recursive<I> {
   public I func;

    // Test.java
    static double factorial(int n) {

        Recursive<IntToDoubleFunction> recursive = new Recursive<>();
        recursive.func = x -> (x == 0) ? 1 : x * recursive.func.applyAsDouble(x - 1);

        return recursive.func.applyAsDouble(n);
    }



    public static void main (String args[]){
        System.out.println(factorial(6));
    }

}
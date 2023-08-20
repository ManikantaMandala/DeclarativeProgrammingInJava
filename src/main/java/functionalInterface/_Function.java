package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int num = 5;
        //Function<T, R> -> takes 1 input{T} and returns 1 output{R}
        Function<Integer, Integer> incrementBy1 = n -> ++n;
        Function<Integer, Integer> multiplyBy10 = n -> n*10;
        System.out.println(multiplyBy10.apply(num)); // 50

        Function<Integer, Integer> add1ThenMultiplyBy10 = incrementBy1.andThen(multiplyBy10);

        System.out.println(add1ThenMultiplyBy10.apply(num)); // 60

        // BiFunction<T, U, R> -> takes 2 inputs{T, U} and returns 1 output{R}
        BiFunction<Integer, Integer, Integer> incrementBy1AndMultiplyBy = (n,x) -> (n+1)*x;
        System.out.println(incrementBy1AndMultiplyBy.apply(num, 100)); // 60
    }
}

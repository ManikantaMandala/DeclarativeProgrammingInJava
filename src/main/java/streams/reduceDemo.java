package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class reduceDemo {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 7, 18, 10, 24, 17, 5);

        Optional<Integer> product = intList.stream().reduce((a, b) -> a*b);
        System.out.println("Product as Optional: " + product.get());

        int productVal = intList.stream().reduce(1,(a, b)-> {
            if(b%2 == 0) return a*b;
            return a;
        });
        System.out.println("Product as int: " + productVal);

        productVal = intList.parallelStream().reduce(1, (a, b) -> {
            if(b%2 == 0) return a*b;
            return a;
        }, (a, b)-> a*b);

        System.out.println("Product as int by 3 param reduce: " + productVal);
    }
}

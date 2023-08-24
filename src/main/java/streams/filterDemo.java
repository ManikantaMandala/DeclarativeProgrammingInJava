package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class filterDemo {
    public static void main(String[] args) {
        //Example - 1:
        List<Integer> numbers = Arrays.asList(1, 4, 5, 2, 10, 25, 28);
        int[] intArr = new int[]{1, 4, 5 ,2, 10, 25, 28};
        long length = Arrays.stream(intArr).count();
        System.out.println(length);
        List<Integer> evenNumbers = new ArrayList<>();

        // without using streams filter
        System.out.println("Without using streams filter");
        for(int i: numbers){
            if(i%2 == 0) evenNumbers.add(i);
        }
        System.out.println(evenNumbers);

        System.out.println();

        // with using streams filter
        System.out.println("With using streams filter");
        Stream<Integer> stream = numbers.stream();
        evenNumbers = numbers.stream().filter(i -> i%2 == 0).toList();
        evenNumbers = evenNumbers.stream().sorted().toList();

        System.out.println(evenNumbers);

        //Finding MaxElement
        Optional<Integer> maxElement = numbers.stream().min((a, b) -> b-a);
        System.out.println("The maximum element: " + maxElement.get());


        // Example 2:

    }
}

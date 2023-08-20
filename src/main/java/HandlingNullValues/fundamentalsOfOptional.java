package HandlingNullValues;

import java.util.Optional;

public class fundamentalsOfOptional {
    public static void main(String[] args) {
        //Creating an Optional
        // static methods:
        // 1. of(notNullValue) => The value shouldn't be null
        // 2. ofNullable(value) => The value can be null
        // 3. empty() => Returns an empty Optional
        Optional<String> str = Optional.ofNullable("nullValue");

        //Accessing value
        // you can access the value in the optional using get() static method
        String strVal = str.get();
        System.out.println(strVal);

        //Avoiding NullPointerExceptions:
        // One of the main advantages of using Optional is to avoid NullPointerExceptions.
        // If you try to access the value of an empty Optional using get(),
        // it will throw a NoSuchElementException rather than a NullPointerException.

        //Conditional Actions:
        // You can perform actions based on the presence or absence of a value
        // using methods like ifPresent(Consumer<? super T> action) and
        // ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction).
        str.ifPresent(System.out::println);
        str.ifPresentOrElse(System.out::println, ()->System.out.println("No Such Element"));

        //Default Values:
        // You can provide a default value to use when the Optional is empty using methods like
        // orElse(T other) and
        // orElseGet(Supplier<? extends T> other).
        strVal = str.orElse("No Such Element");
        System.out.println(strVal);

        strVal = str.orElseGet(() -> {
            // .. Extra operations
            return "No Such Element";
        });
        System.out.println(strVal);

        //Mapping and Transformation:
        // You can apply mapping and transformation functions
        // to the contained value using methods
        // like map(Function<? super T, ? extends U> mapper) and
        // flatMap(Function<? super T, Optional<U>> mapper).
        strVal = str.map(String::toLowerCase).toString();
        System.out.println(strVal);
        strVal = str.flatMap(s -> Optional.ofNullable(s.toLowerCase())).toString();
        System.out.println(strVal);

        //Chaining:
        // You can chain operations on an Optional using its methods in a fluent manner,
        // allowing you to handle different scenarios without nested if-else blocks.

        //Filtering:
        // You can apply filters to the contained value using methods like
        // filter(Predicate<? super T> predicate).
        str = str.filter(s -> s.startsWith("M"));
        System.out.println(str.get());

        // Overall, Optional provides a more structured and
        // clear way to handle cases where a value might be missing,
        // reducing the risk of null-related errors and
        // improving the readability of your code.
        // However, it's important to use Optional judiciously and
        // not to overcomplicate simple scenarios where a simple null check would suffice.







    }
}

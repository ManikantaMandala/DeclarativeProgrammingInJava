package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println("Using static method");
        System.out.println(getDBConnectionUrls());

        System.out.println();

        System.out.println("Using Supplier functional interface with lambda expression");
        System.out.println(getDBConnectionUrlsUsingSupplier.get());

        System.out.println();

        System.out.println("Using Supplier functional interface with static method reference");
        System.out.println(getDBConnectionUrlsUsingMethodReference.get());
    }
    static Supplier<List<String>> getDBConnectionUrlsUsingSupplier = () -> List.of("jdbc://localhost:5432/users", "jdbc://localhost:5432/consumers");
    static Supplier<List<String>> getDBConnectionUrlsUsingMethodReference = _Supplier::getDBConnectionUrls;
    static List<String> getDBConnectionUrls(){
        return List.of("jdbc://localhost:5432/users", "jdbc://localhost:5432/consumers");
    }
}

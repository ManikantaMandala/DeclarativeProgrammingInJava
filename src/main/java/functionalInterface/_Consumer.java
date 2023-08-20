package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer c1 = new Customer("Mani", "+918688014820");
        // Consumer Functional Interface: takes 1 input and return type is void
        Consumer<Customer> greetCustomerUsingConsumer = c -> {
            System.out.println("Hello "+ c.name +
                    "!, thanks for registering with phone number " +
                    c.phoneNumber);
        };
        System.out.println("Using Consumer Functional Interface");
        greetCustomerUsingConsumer.accept(c1);

        System.out.println();

        System.out.println("Using static method in _Consumer class");
        greetCustomerUsingConsumer.accept(c1);

        System.out.println();
        //BiConsumer functional interface: take 2 inputs and return type is void
        System.out.println("Using BiConsumer Functional Interface");
        BiConsumer<Customer, Boolean> greetCustomerUsingBiConsumer = (c, showPhoneNumber) ->
                System.out.println("Hello "+ c.name +
                        "!, thanks for registering with phone number " +
                        (showPhoneNumber? c.phoneNumber: "+918688******"));
        greetCustomerUsingBiConsumer.accept(c1, false);

    }
    static void greetCustomer(Customer customer){
        System.out.println("Hello "+ customer.name +
                "!, thanks for registering with phone number " +
                customer.phoneNumber);
    }
    static class Customer{
        private final String name;
        private final String phoneNumber;

        public Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}

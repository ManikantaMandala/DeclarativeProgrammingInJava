package HandlingNullValues;

import java.util.Optional;

public class _OptionalsImplementation {
    public static void main(String[] args) {
        Person p1 = new Person("Mani", null);
        String email = p1.getEmail()
                .map(x -> x.toLowerCase().toString())
                .orElse("email not given");
        System.out.println(email);
    }
}
class Person{
    private final String name;
    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}

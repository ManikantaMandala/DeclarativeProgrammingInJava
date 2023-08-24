package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;
public class Main {
    public static void main(String[] args) {
        List<Person> family = List.of(
            new Person("Manikanta", MALE),
            new Person("Vijaysurya", MALE),
            new Person("Manjusree", FEMALE ),
            new Person("Anandam", MALE)
        );

        //Imperative approach
        System.out.println("Imperative programming");
        List<Person> male1 = new ArrayList<>();
        for(Person p : family){
            if(p.gender.equals(MALE)){
                male1.add(p);
            }
        }
        for (Person p : male1) {
            System.out.println(p.name);
        }

        //Declarative approach
        System.out.println("Declarative programming");
        Stream<Person> personStream = family.stream();
        List<Person> male2 = personStream
                .filter(p -> p.gender.equals(MALE))
                .toList();

        male2.forEach(m -> System.out.println(m.name));
    }
    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    public static enum Gender{
        FEMALE, MALE;
    }
}

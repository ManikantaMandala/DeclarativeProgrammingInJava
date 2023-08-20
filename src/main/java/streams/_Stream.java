package streams;


import java.util.List;

import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;

public class _Stream {
    public static void main(String[] args) {

        List<Person> family = List.of(
                new Person("Manikanta", MALE),
                new Person("Vijaysurya", MALE),
                new Person("Manjusree", FEMALE ),
                new Person("Anandam", MALE)
        );

        // filtering Demo
        family.stream().filter(p -> p.name.startsWith("M")).forEach(p -> System.out.println(p.name));
    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
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

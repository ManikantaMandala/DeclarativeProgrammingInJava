package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        Predicate<String> isValidPhoneNumberUsingPredicate1 = p -> p.startsWith("+91") && p.length() == 13;
        Predicate<String> isValidPhoneNumberUsingPredicate2 = _Predicate::isValidPhoneNumber;
        System.out.println("checking phone number validity using static method");
        System.out.println(isValidPhoneNumber("+918688014820"));
        System.out.println(isValidPhoneNumber("+818688014820"));
        System.out.println(isValidPhoneNumber("+91868014820"));

        System.out.println();

        System.out.println("checking phone number validity using Predicate using lambda expression");
        System.out.println(isValidPhoneNumberUsingPredicate1.test("+918688014820"));
        System.out.println(isValidPhoneNumberUsingPredicate1.test("+818688014820"));
        System.out.println(isValidPhoneNumberUsingPredicate1.test("+91868014820"));

        System.out.println();

        System.out.println("checking phone number validity using Predicate with method reference");
        System.out.println(isValidPhoneNumberUsingPredicate2.test("+918688014820"));
        System.out.println(isValidPhoneNumberUsingPredicate2.test("+818688014820"));
        System.out.println(isValidPhoneNumberUsingPredicate2.test("+91868014820"));
    }
    static boolean isValidPhoneNumber(String phoneNumber){
        return phoneNumber.startsWith("+91") && phoneNumber.length() == 13;
    }
}

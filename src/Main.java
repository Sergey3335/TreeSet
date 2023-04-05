import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        List<Person> personList = new ArrayList<>();
        Predicate<Person> personPredicate = a -> a.getAge() < 18;

        personList.add(new Person("Petya", "Pet", 25));
        personList.add(new Person("Vanya", "Peta", 17));
        personList.add(new Person("Olya", "Petrova", 15));
        personList.add(new Person("Sergey", "Sergeev", 35));
        personList.add(new Person("Pashsa", "Pashov", 40));

        personList.removeIf(personPredicate);

        System.out.println(personList);


    }
}
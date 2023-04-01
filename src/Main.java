import java.util.*;

public class Main {
    public static void main(String[] args) {

        Comparator<Person> comp = new ComparatorNamePerson();
        //TreeSet<Person> personList = new TreeSet<>(comp);
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Petya", "Pet", 25));
        personList.add(new Person("Vanya", "Peta", 18));
        personList.add(new Person("Olya", "Petrova", 22));
        personList.add(new Person("Sergey", "Sergeev", 35));

        Collections.sort(personList, comp);

        System.out.println(personList);


    }
}
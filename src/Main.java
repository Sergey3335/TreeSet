import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        Comparator<Person> comp = (Person o1, Person o2) ->{
            if (o1.getSurname().length() < o2.getSurname().length())
                return 1;
            else if (o1.getSurname().length() > o2.getSurname().length())
                return -1;
            else if (o1.getAge() < o2.getAge())
                return 1;
            else if (o1.getAge() > o2.getAge())
                return -1;
            else
                return 0;
        };

        personList.add(new Person("Petya", "Pet", 25));
        personList.add(new Person("Vanya", "Peta", 18));
        personList.add(new Person("Olya", "Petrova", 22));
        personList.add(new Person("Sergey", "Sergeev", 35));

        Collections.sort(personList, comp);

        System.out.println("Самый важный: " + personList);


    }
}
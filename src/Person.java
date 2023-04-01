public class Person {

    private String name;
    private String surname;
    private int age;

    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    String getSurname() {
        return surname;
    }

    Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + age + " лет";
    }
}

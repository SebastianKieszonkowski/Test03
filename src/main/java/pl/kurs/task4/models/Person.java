package pl.kurs.task4.models;

public class Person implements Comparable<Person>{
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        int result = Integer.compare(age, o.age);
        if(result == 0)
            result = o.surname.compareTo(surname);
        if(result == 0)
            result = o.name.compareTo(name);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

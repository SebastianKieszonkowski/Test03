package pl.kurs.task4.models;

public class Person implements Comparable<Person>{
    private String firstName;
    private String secondName;
    private int age;

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        int result = Integer.compare(age, o.age);
        if(result == 0)
            result = secondName.compareTo(o.secondName);
        if(result == 0)
            result = o.firstName.compareTo(firstName);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + firstName + '\'' +
                ", surname='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}

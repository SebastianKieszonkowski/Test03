package pl.kurs.task4;

import pl.kurs.task4.models.MinMax;
import pl.kurs.task4.models.Person;

import java.util.ArrayList;
import java.util.List;

public class RunnerClass {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Bartek");
        stringList.add("Zenek");
        stringList.add("Sebastian");
        stringList.add("Paweł");
        stringList.add("Adam");
        stringList.add("Karol");

        MinMax<String> result1 = MinMaxService.getMinAndMax(stringList);
        System.out.println(result1);
        System.out.println("++++++++++++++++++++");

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Adam", "Walenty", 25));
        personList.add(new Person("Zbigniew", "Kowalski", 37));
        personList.add(new Person("Romuald", "Amerek", 52));
        personList.add(new Person("Ludwik", "Bogusz", 25));
        personList.add(new Person("Kazimierz", "Walenty", 25));
        MinMax<Person> result2 = MinMaxService.getMinAndMax(personList);
        System.out.println(result2);
        System.out.println("++++++++++++++++++++");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(3);
        integerList.add(50);
        integerList.add(1);
        integerList.add(12);
        MinMax<Integer> result3 = MinMaxService.getMinAndMax(integerList);
        System.out.println(result3);

    }
}

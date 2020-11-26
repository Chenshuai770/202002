package 廖雪峰_java.stream.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * FileName: Main
 * Date: 2020/11/24 10:17
 * Author:cs
 * Description:
 */

class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Alice");
        names.add("Tim");
        List<Person> persons = new ArrayList<>();
        for (String name : names) {
            persons.add(new Person(name));
        }
        System.out.println(persons);


        List<Person> collect = names.stream().map(Person::new).collect(Collectors.toList());
        System.out.println(collect);

    }
}

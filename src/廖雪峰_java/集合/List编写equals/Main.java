package 廖雪峰_java.集合.List编写equals;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: Main
 * Date: 2020/10/22 11:59
 * Author:cs
 * Description:
 */

class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }*/
}

public class Main {
    public static void main(String[] args) {
        List<String> list_string = new ArrayList<>();
        list_string.add("A");
        list_string.add("B");
        list_string.add("C");

        System.out.println(list_string.contains("A"));
        System.out.println(list_string.contains("X"));
        System.out.println(list_string.indexOf("C"));

        List<Person> list_person = new ArrayList<>();
        list_person.add(new Person("Xiao Ming"));
        list_person.add(new Person("Xiao Hong"));
        list_person.add(new Person("Bob"));


        boolean bob = list_person.contains(new Person("Bob"));
        System.out.println(bob);


    }
}

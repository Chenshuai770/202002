package 慕课教.java基础.stream使用.创建Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * FileName: Main
 * Date: 2020/11/26 10:59
 * Author:cs
 * Description:
 */

class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class StreamDemo2 {
    public static void main(String[] args) {
//        create1();

        List<Person> people = createPeople();
        Stream<Person> stream = people.stream();
        Stream<Person> personStream = stream.filter(person -> person.getAge() >= 20);
//        personStream.forEach(System.out::println);
        personStream.limit(2).forEach(System.out::println);


    }


    /**
     * 创建一个Person的集合
     * @return List
     */
    public static List<Person> createPeople() {
        ArrayList<Person> people = new ArrayList<>();
        Person person1 = new Person("小明", 15);
        Person person2 = new Person("小芳", 20);
        Person person3 = new Person("小李", 18);
        Person person4 = new Person("小付", 23);
        Person person5 = new Person("大飞", 22);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        return people;
    }

    private static void create1() {
        List<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("world");
        stringList.add("java");

        Stream<String> stream = stringList.stream();//串行流
        Stream<String> stream1 = stringList.parallelStream();//并行流
    }
}

package 廖雪峰_java.集合.TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * FileName: Main
 * Date: 2020/10/22 14:09
 * Author:cs
 * Description:
 */

class Person implements Comparable{
    public String name;
    Person(String name) {
        this.name = name;
    }
    public String toString() {
        return "{Person: " + name + "}";
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Person) {

            return this.name.compareTo(((Person) o).name);
        }
        return 0;
    }
}

class Student {
    public String name;
    public int score;
    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String toString() {
        return String.format("{%s: score=%d}", name, score);
    }
}


public class Main {
    public static void main(String[] args) {
        TreeMap<Person, Integer> map = new TreeMap<>();
        map.put(new Person("Tom"), 1);
        map.put(new Person("Bob"), 2);
        map.put(new Person("Lily"), 3);
        for (Person key : map.keySet()) {
            System.out.println(key);
        }


        Map<Student, Integer> map2 = new TreeMap<>(new Comparator<Student>() {
            public int compare(Student p1, Student p2) {
                if (p1.score == p2.score) {
                    return 0;
                }
                return p1.score > p2.score ? -1 : 1;
            }
        });
        map2.put(new Student("Tom", 77), 1);
        map2.put(new Student("Bob", 66), 2);
        map2.put(new Student("Lily", 99), 3);
        for (Student key : map2.keySet()) {
            System.out.println(key);
        }
        System.out.println(map2.get(new Student("Bob", 66))); // null?
    }
}

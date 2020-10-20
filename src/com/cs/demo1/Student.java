package com.cs.demo1;


import java.util.Comparator;

class Student{
    private String name;
    private Integer age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    public static Comparator ageComparator = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            return ( ((Student) o1).getAge() < ((Student) o2).getAge() ? -1 :
                    (((Student) o1).getAge() ==((Student) o2).getAge() ? 0 : 1));
        }
    };
    public Student() {
        super();
    }


}





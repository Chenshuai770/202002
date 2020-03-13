package com.cs.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import static com.cs.demo1.Student.ageComparator;

public class TestJava {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("张三");
        s.setAge(17);
        Student st=new Student();
        st.setName("李四");
        st.setAge(-1);
        List<Student> list=new ArrayList<>();
        list.add(s);
        list.add(st);
        Collections.sort(list,ageComparator);
        System.out.println(list);

    }
}

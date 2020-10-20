package com.cs.异常.抛出异常;

/**
 * Created by pc on 2020/10/19 21:48
 * Description: Demo1
 */
public class Main {
    public static void main(String[] args) {
        process1();
    }
    static void process1(){
        process2();
    }

    static void process2(){
        Integer.parseInt(null);
    }
}

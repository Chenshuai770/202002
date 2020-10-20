package com.cs.异常.抛出异常;

/**
 * Created by pc on 2020/10/19 21:54
 * Description: Demo1
 */
public class Main3 {
    static void process1(){
        try {
            process2();
        } catch (NullPointerException e) {
            throw new IllegalArgumentException(e);
        }
    }

    static void process2(){
        throw new NullPointerException();
    }

    public static void main(String[] args) {
//        process1();

        try {
            process1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

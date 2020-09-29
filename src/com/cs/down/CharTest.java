package com.cs.down;

public class CharTest {
    public static void main(String[] args) {
        String str = "ava中如何用代码实现将一段字符串每隔5个字符就加上";
        StringBuffer s = new StringBuffer(str);
        for (int index = 0; index < s.length(); index++) {


            if (index % 5 == 0) {
                s.insert(index, "\n");
            }


        }
        System.out.println("After insert:" + s.toString());


        String randomCode = getRandomCode(5);
        System.out.println(randomCode);

    }

    public static String getRandomCode(int n) {
        String a = "ava中如何用代码实现将一段字符串每隔5个字符就加上";
        char[] rands = new char[n];
        for (int i = 0; i < rands.length; i++) {
            int rand = (int) (Math.random() * a.length());
            rands[i] = a.charAt(rand);
        }
        return String.valueOf(rands);
    }

}

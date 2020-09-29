package e_java.chapter4.item16.test;

/**
 * FileName: Test
 * Date: 2020/9/29 11:24
 * Author:cs
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        Ponit_Public ponit_public = new Ponit_Public();
        ponit_public.x = 1;
        System.out.println(ponit_public.getXY());
        ponit_public.x = 2;
        System.out.println(ponit_public.getXY());
    }
}

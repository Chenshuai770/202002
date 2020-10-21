package 廖雪峰_java.异常.java异常;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created by pc on 2020/10/19 21:35
 * Description: Demo1
 */
public class Main {

    public static void main(String[] args) {
        byte[] bs = toGBK1("中文");
        System.out.println(Arrays.toString(bs));

        try {
            byte[] bs2 = toGBK2("英文");
            System.out.println(Arrays.toString(bs2));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    static byte[] toGBK1(String s){
        try {
            return s.getBytes(s);
        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
            System.out.println(e);
            return s.getBytes();
        }
    }

    static byte[] toGBK2(String s) throws UnsupportedEncodingException {
        return s.getBytes("GBK");

    }
}

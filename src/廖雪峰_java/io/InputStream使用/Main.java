package 廖雪峰_java.io.InputStream使用;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * FileName: Main
 * Date: 2020/10/23 10:30
 * Author:cs
 * Description:
 */
public class Main {
    public static void main(String[] args) {
//        readFile1("readme.txt");
        try {
            readFile2("readme.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile1(String text) {
        InputStream input = null;
        try {
            input = new FileInputStream(text);
            for (; ; ) {
                int n = input.read();
                if (n == -1) {
                    break;
                }
                System.out.println(n);

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void readFile2(String text) throws IOException {

        String s;
        try (InputStream input = new FileInputStream(text)) {
            int n;
            StringBuilder sb = new StringBuilder();
            while ((n = input.read()) != -1) {
                sb.append((char) n);
            }
            s = sb.toString();
        }
        System.out.println(s);


    }


}

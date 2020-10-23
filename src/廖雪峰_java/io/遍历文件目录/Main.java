package 廖雪峰_java.io.遍历文件目录;

import java.io.File;
import java.io.FileFilter;

/**
 * FileName: Main
 * Date: 2020/10/23 10:12
 * Author:cs
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        File f = new File("C:\\Windows");
        File[] files = f.listFiles();
//        printFiles(files);
        File[] files2 = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".exe");

            }
        });
        printFiles(files2);
    }

    static void printFiles(File[] files){
        System.out.println("==========");
        if (files != null) {
            for (File f : files) {
                System.out.println(f);
            }
        }
        System.out.println("==========");
    }
}

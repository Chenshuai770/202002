package e_java.chapter6.item39.markerannotation;

import java.lang.reflect.Method;

/**
 * FileName: RunTests
 * Date: 2020/10/14 11:39
 * Author:cs
 * Description:
 */
public class RunTests {
    public static void main(String[] args) {
        Class<Test> testClass = Test.class;
        Method[] declaredMethods = testClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(Test.class)) {
                System.out.println("adsf");
            }
        }
    }
}

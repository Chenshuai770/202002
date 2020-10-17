package com.cs.注解.item1;

/**
 * FileName: Test
 * Date: 2020/10/12 16:49
 * Author:cs
 * Description:
 */
@MyTestAnnotation
public class Test {
    @MyTestAnnotation
    public static void main(String[] args) {
        /**
         * 获取类注解属性
         */
        Class<Father> fatherClass = Father.class;
        boolean annotationPresent = fatherClass.isAnnotationPresent(MyTestAnnotation.class);
        if (annotationPresent){
            MyTestAnnotation annotation = fatherClass.getAnnotation(MyTestAnnotation.class);
            System.out.println(annotation.name());
            System.out.println(annotation.age());
        }




    }
}

package 廖雪峰_java.注解.item1;

import java.lang.annotation.*;

/**
 * FileName: MyTestAnnotation
 * Date: 2020/10/12 16:49
 * Author:cs
 * Description: 测试注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Inherited
public @interface MyTestAnnotation {
    String name() default "mao";
    int age() default 18;
}

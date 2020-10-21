package 廖雪峰_java.注解.item1;

/**
 * FileName: Father
 * Date: 2020/10/12 16:56
 * Author:cs
 * Description:
 */
@MyTestAnnotation(name = "father",age = 50)
public class Father {
}

class Son extends Father{

}

class TestAnnotion{
    public static void main(String[] args) {
        Class<Son> sonClass = Son.class;
        MyTestAnnotation annotation = sonClass.getAnnotation(MyTestAnnotation.class);
    }
}

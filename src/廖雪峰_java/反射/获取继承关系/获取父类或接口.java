package 廖雪峰_java.反射.获取继承关系;

/**
 * FileName: main
 * Date: 2020/10/17 16:37
 * Author:cs
 * Description: 获取父类或者接口
 */
public class 获取父类或接口 {
    public static void main(String[] args) {
        Class<Integer> integerClass = Integer.class;
        Class<? super Integer> numberClass = integerClass.getSuperclass();
        System.out.println(numberClass);
        Class<? super Integer> objectclass = numberClass.getSuperclass();
        System.out.println(objectclass);
        System.out.println(objectclass.getSuperclass());

        Class<Runnable> runtimeClass = Runnable.class;
        System.out.println(runtimeClass.getSuperclass());

        Class<?>[] integer_interfaces = integerClass.getInterfaces();
        for (Class<?> i : integer_interfaces) {
            System.out.println(i.getName());
        }

        Class<?>[] number_interfaces = integerClass.getSuperclass().getInterfaces();
        for (Class<?> i : number_interfaces) {
            System.out.println(i.getName());
        }


    }
}

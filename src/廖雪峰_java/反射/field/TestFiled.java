package 廖雪峰_java.反射.field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * FileName: TestFiled
 * Date: 2020/10/17 14:47
 * Author:cs
 * Description:
 */
public final class TestFiled {
    private final byte[] value;

    public TestFiled(byte[] value) {
        this.value = value;
    }

    public static void main(String[] args) throws NoSuchFieldException {
        Field value = TestFiled.class.getDeclaredField("value");
        System.out.println(value.getName());
        System.out.println(value.getType());
        int modifiers = value.getModifiers();//返回java的修饰符
        System.out.println(Modifier.isFinal(modifiers));
        System.out.println(Modifier.isPublic(modifiers));
        System.out.println(Modifier.isProtected(modifiers));
        System.out.println(Modifier.isPrivate(modifiers));
        System.out.println(Modifier.isStatic(modifiers));
    }
}



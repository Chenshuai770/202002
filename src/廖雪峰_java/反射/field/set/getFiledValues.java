package 廖雪峰_java.反射.field.set;

import java.lang.reflect.Field;

/**
 * FileName: getFiledValues
 * Date: 2020/10/17 14:52
 * Author:cs
 * Description: 通过反射获取字段的值类型
 */

class PeoPle{
    private String name;

    public PeoPle(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class getFiledValues {
    public static void main(String[] args) throws Exception {
        PeoPle p = new PeoPle("xiao min");
        Class<?> aClass = p.getClass();
        Field nameField = aClass.getDeclaredField("name");
        nameField.setAccessible(true);//忽略访问的修饰符
        Object o_valus = nameField.get(p);
        System.out.println(o_valus);
        nameField.set(p,"我是高手");
        System.out.println(p.getName());

    }

}

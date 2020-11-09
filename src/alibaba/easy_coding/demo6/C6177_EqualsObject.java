package alibaba.easy_coding.demo6;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by pc on 2020/11/8 22:41
 * Description: JavaStudy
 */
public class C6177_EqualsObject {
    private int id;
    private String name;


    public C6177_EqualsObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        //如果为null 或者非同类,直接返回false
        if (obj==null ||  this.getClass()!=obj.getClass()) {
            return false;
        }
        //如果引用指向同一对象,则返回true
        if (this==obj) {
            return true;
        }

        //需要强制转换来获取EqualseObject的方法
        C6177_EqualsObject temp = (C6177_EqualsObject) obj;
        if (temp.getId()==this.id && name.equals(temp.getName())){
            return true;
        }else {
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  /*  @Override
    public int hashCode() {
        return id + name.hashCode();
    }
*/
    public static void main(String[] args) {
        Set<C6177_EqualsObject> haseSet = new HashSet<>();
        C6177_EqualsObject a = new C6177_EqualsObject(1, "one");
        C6177_EqualsObject b = new C6177_EqualsObject(1, "one");
        C6177_EqualsObject c = new C6177_EqualsObject(1, "one");
        haseSet.add(a);
        haseSet.add(b);
        haseSet.add(c);

        //不覆写hasecode就无法完成set去重
        System.out.println(haseSet.size());
    }


}

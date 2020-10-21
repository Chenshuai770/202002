package 廖雪峰_java.java基础.参数绑定;

/**
 * FileName: 引用类型
 * Date: 2020/10/20 16:23
 * Author:cs
 * Description:引用类型参数的传递，调用方的变量，和接收方的参数变量，指向的是同一个对象。双方任意一方对这个对象的修改，都会影响对方（因为指向同一个对象嘛）。
 */
class PeoPle {
    private String[] name;

    public String getName() {
      /*  if (name[0].equals("Bart")) {
            name[1] = "我是高手";
        }*/

        return this.name[0] + " " + this.name[1];
    }

    public void setName(String[] name) {
        this.name = name;
    }
}

public class 引用类型 {
    public static void main(String[] args) {
        PeoPle p = new PeoPle();
        String[] fullname = new String[]{"Homer", "Simpson"};
        p.setName(fullname); // 传入fullname数组
        System.out.println(p.getName()); // "Homer Simpson"
        fullname[0] = "Bart"; // fullname数组的第一个元素修改为"Bart"
        System.out.println(p.getName()); // "Homer Simpson"还是"Bart Simpson"?
    }
}



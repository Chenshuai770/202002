package 廖雪峰_java.泛型.extends和super通配符;

/**
 * FileName: Main
 * Date: 2020/10/21 21:24
 * Author:cs
 * Description:上界通配符
 * 实际类型是Integer，引用类型是Number，没有问题。问题在于方法参数类型定死了只能传入Pair<Number>。
 * 使用extends通配符表示可以读，不能写。
 * 使用super通配符表示可以写，不能读。
 *
 * <? extends T>允许调用读方法T get()获取T的引用，但不允许调用写方法set(T)传入T的引用（传入null除外）；
 *
 * <? super T>允许调用写方法set(T)传入T的引用，但不允许调用读方法T get()获取T的引用（获取Object除外）
 */
class Pair<T>{
    private T first;
    private T last;

    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public T getLast() {
        return last;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setLast(T last) {
        this.last = last;
    }
}

public class Main {
    public static void main(String[] args) {
        Pair<Integer> p = new Pair<>(123, 456);
        int n1 = add1(p);
        int n3 = add3(p);
        System.out.println(n1);
        System.out.println(n3);

//        Collections.copy();//源码解释了泛型的详细使用
    }

    /*static int add0(Pair<Number> p){//编译会出现问题
        Number first = p.getFirst();
        Number last = p.getLast();
        return first.intValue() + last.intValue();
    }*/
    static int add1(Pair<? extends Number> p){
        Number first = p.getFirst();
        Number last = p.getLast();
        return first.intValue() + last.intValue();
    }

  /*  static int add2(Pair<? extends Number> p){//编译会出现问题
        Number first = p.getFirst();
        Number last = p.getLast();
        p.setFirst(new Integer(first.intValue()+100));
        return first.intValue() + last.intValue();
    }*/

    static int add3(Pair<? super Integer> p){
        p.setFirst(1);
        p.setLast(2);
        Number first = (Number) p.getFirst();
        Integer last = (Integer) p.getLast();
        return first.intValue() + last.intValue();
    }
}

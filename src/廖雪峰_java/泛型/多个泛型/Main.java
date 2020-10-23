package 廖雪峰_java.泛型.多个泛型;

/**
 * FileName: 多个泛型
 * Date: 2020/10/21 21:39
 * Author:cs
 * Description:
 */
public class Main<T,K> {
    private T first;
    private T last;

    public Main(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public T getLast() {
        return last;
    }


}

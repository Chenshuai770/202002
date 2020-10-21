package 廖雪峰_java.泛型;

/**
 * FileName: 多个泛型
 * Date: 2020/10/21 21:39
 * Author:cs
 * Description:
 */
public class 多个泛型<T,K> {
    private T first;
    private T last;

    public 多个泛型(T first, T last) {
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

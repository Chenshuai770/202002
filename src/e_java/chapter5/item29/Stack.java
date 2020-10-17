package e_java.chapter5.item29;

import java.util.Arrays;

/**
 * FileName: Stack
 * Date: 2020/10/12 11:37
 * Author:cs
 * Description:
 */
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;//默认初始化容量

    public Stack(){
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    /**
     *确保至少再增加一个元素的空间，
     * 每次需要增长阵列时，容量大约都会增加一倍。
     */
    private void ensureCapacity(){
        if (elements.length==size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
    public void push(Object e){
        ensureCapacity();
        elements[size++] = e;
    }
    public Object pop(){
        if (size==0){
            throw new EmptyStackException();
        }
        return elements[--size];
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        for (String arg : args){
            stack.push(arg);
        }

        while (true)
            System.err.println(stack.pop());
    }
}

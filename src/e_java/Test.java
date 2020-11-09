package e_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next == 3) {
                iterator.remove();
                continue;
            }
            System.out.println(next);
        }

        CopyOnWriteArrayList<Long> copy = new CopyOnWriteArrayList<>();
        long start = System.nanoTime();
        for (int i = 0; i < 20 * 10000; i++) {
            copy.add(System.nanoTime());
        }
        long end = System.nanoTime();
        long l = end - start;
        System.out.println(l);


    }


}

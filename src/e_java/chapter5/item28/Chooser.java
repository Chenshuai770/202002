package e_java.chapter5.item28;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * FileName: Chooser
 * Date: 2020/10/12 10:52
 * Author:cs
 * Description:
 */
public class Chooser<T> {
    private final List<T> chooserList;
    public Chooser(List<T> chooserList) {
        this.chooserList = chooserList;
    }

    public T getChoose(){
        Random random = ThreadLocalRandom.current();
        return chooserList.get(random.nextInt(chooserList.size()));
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);

        Chooser<Integer> chooser = new Chooser<>(intList);

        for (int i = 0; i < 10; i++) {
            Number choice = chooser.getChoose();
            System.out.println(choice);
        }
    }
}

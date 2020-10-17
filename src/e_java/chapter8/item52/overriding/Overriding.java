package e_java.chapter8.item52.overriding;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: Overriding
 * Date: 2020/10/17 9:59
 * Author:cs
 * Description:
 */
public class Overriding {
    public static void main(String[] args) {
        List<Wine> winList = new ArrayList<>();
        winList.add(new Wine());
        winList.add(new SparklingWine());
        winList.add(new Champagne());

        for (Wine wine : winList) {
            System.out.println(wine.name());
        }

    }
}

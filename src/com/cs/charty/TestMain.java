package com.cs.charty;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
       /* int num=(int) (Math.random()*16777216);
        String hex = Integer.toHexString(num);
        System.err.println(hex);*/
        List<Integer> mList = new ArrayList<>();
        mList.add(3);
        mList.add(4);
        mList.add(mList.size()-2, 2);
        System.out.println(mList);


        for (int i = 0; i < mList.size(); i++) {
            mList.set(i, i + 1);
        }

        System.out.println(mList);

    }
}

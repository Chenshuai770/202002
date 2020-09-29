package com.cs.test1;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<String> mData = new ArrayList<>();
        mData.add("大高手是群主");
        mData.add("小云是群主");
        mData.add("桂林行");

        String a = "群";

        ArrayList<String> arrayList = new ArrayList<>();
        for (String mDatum : mData) {
            boolean contains = mDatum.contains(a);
            if (contains) {
                arrayList.add(mDatum);
            }
        }
        System.out.println(JSON.toJSONString(arrayList));
    }
}

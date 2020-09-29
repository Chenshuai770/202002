package com.cs.demo3;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.math.BigDecimal;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        String text = "[{\"coordinates\":[[[121.23138428,30.32680392],[121.2426281,30.32729745],[121.24264956,30.32691121],[121.23138428,30.32635331],[121.23138428,30.32680392]]]},{\"coordinates\":[121.23692036,30.32692194],\"type\":\"Point\"},{\"coordinates\":[[[121.23138428,30.32680392],[121.2426281,30.32729745],[121.24264956,30.32691121],[121.23138428,30.32635331],[121.23138428,30.32680392]]],\"type\":\"Polygon\"},{\"coordinates\":[[122.10755467,30.02006248],[122.10757881,30.01919612],[122.10777462,30.01833245]],\"type\":\"LineString\"}]";


        List<EasyFishResult> easyFishResultList = JSON.parseArray(text, EasyFishResult.class);
        for (EasyFishResult easyFishResult : easyFishResultList) {
//            System.out.println(jsonRootBean.getType());
            if (easyFishResult.getType() != null) {
                List coordinates = easyFishResult.getCoordinates();
                if (easyFishResult.getType().equals("Point")) {
                    BigDecimal bigDecimal1 = (BigDecimal) coordinates.get(0);
                    BigDecimal bigDecimal2 = (BigDecimal) coordinates.get(1);
                /*    System.out.println(bigDecimal1);
                    System.out.println(bigDecimal2);*/
                } else if (easyFishResult.getType().equals("LineString")) {
                    for (Object coordinate : coordinates) {
                        JSONArray jsonArray = (JSONArray) coordinate;
                        System.out.println(jsonArray.get(0));
                    }

                } else if (easyFishResult.getType().equals("Polygon")) {

                    for (Object coordinate : coordinates) {
                        JSONArray jsonArray = (JSONArray) coordinate;
                        for (Object o : jsonArray) {
                            JSONArray subJsonArray = (JSONArray) o;
//                            System.out.println(subJsonArray.get(0));
                        }
                    }

                }
            }

        }

    }
}

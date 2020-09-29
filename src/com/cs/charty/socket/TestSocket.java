package com.cs.charty.socket;

import com.alibaba.fastjson.JSON;
import com.cs.charty.MapLoaction;

public class TestSocket {
    public static void main(String[] args) {
        String bean1 = " {\"action\":\"post_track\",\"data\":{\"usn\":\"19\",\"location\":\"30.155368,121.234354,7.62,330282\"}}";

        BeChartyLocationReslut beChartyLocationReslut = JSON.parseObject(bean1, BeChartyLocationReslut.class);
        MapLoaction location = (MapLoaction) beChartyLocationReslut.getData().getLocation();



        System.out.println(JSON.toJSON(location));
    }
}

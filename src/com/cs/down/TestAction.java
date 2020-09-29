package com.cs.down;

import com.alibaba.fastjson.JSON;
import com.cs.charty.ActionType;
import com.cs.charty.LocationResult;
import com.cs.charty.MapLoaction;
import com.cs.charty.MultipleResult;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class TestAction {
    public static void main(String[] args) {
        MultipleResult<LocationResult> result = new MultipleResult<>();
        result.setAction(ActionType.post_track);
        LocationResult locationResult = new LocationResult();
        MapLoaction mapLoaction = new MapLoaction();
        DateTime now = DateTime.now(DateTimeZone.UTC);
        mapLoaction.setTime(String.valueOf(now.getMillis()));
        mapLoaction.setLatitude(31);
        mapLoaction.setLongitude(123);
        mapLoaction.setAltitude(12);
        String s0 = JSON.toJSONString(mapLoaction);
        System.out.println(s0);
//        locationResult.setLocation("我是歌手,我说个,我是,我");
        locationResult.setHour("12");

        result.setData(locationResult);

        String s = JSON.toJSONString(result);
        String s2 = JSON.toJSONString(locationResult);
        System.out.println(s);
        System.out.println(s2);

    }
}

package com.cs.charty;

import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JsonTest {
    public static void main(String[] args) {
        String s = "{\"_name\": \"跌倒求助 - 春暖花开 (14:58:33)\",\"_time\": \"e_time\",\"_creator\": \"春暖花开\",\"_record\": \"none\",\"wpt\": [{\"name\":\"跌倒求助 - 春暖花开 (14:58:33)\",\"lat\":\"30.155109\",\"lon\":\"121.234471\",\"ele\":\"28.62\",\"time\":\"2020-09-06 14:58:33\",\"desc\":\"<b>春暖花开</b><br>1992年03月13日 (28 岁)<hr>经纬度: 121.234471,30.155109<br>时间: 2020-09-06 14:58:33<hr>血型: A+<br>体重: 70.0 公斤<br>身高: 170 厘米<br>过敏史: 红霉素药物过敏\"}],\"trk\": [{\"name\": \"2020-09-06 13:40:07.750 - 2020-09-06 14:58:28.537\",\"distance\": \"0\",\"begin_time\": \"2020-09-06 13:40:07.750\",\"end_time\": \"2020-09-06 14:58:28.537\",\"begin_latlon\": [30.155112,121.234469,28.62],\"end_latlon\": [30.155123,121.234507,28.62],\"trkseg\": [[0,30.155112,121.234469,28.62,0,0],[0,30.155467,121.234457,28.62,0,0],[0,30.155266,121.234406,28.62,0,0],[0,30.155229,121.234463,28.62,0,0],[0,30.155327,121.234391,28.62,0,0],[0,30.155458,121.234388,28.62,0,0],[0,30.155492,121.234456,28.62,0,0],[0,30.155416,121.234291,28.62,0,0],[0,30.155597,121.234370,28.62,0,0],[0,30.155412,121.234356,28.62,0,0],[0,30.155441,121.234369,28.62,0,0],[0,30.155134,121.234488,28.62,0,0],[0,30.155109,121.234468,28.62,0,0],[0,30.155108,121.234468,28.62,0,0],[0,30.155108,121.234468,28.62,0,0],[0,30.155108,121.234468,28.62,0,0],[0,30.155111,121.234475,28.62,0,0],[0,30.155267,121.234407,28.62,0,0],[0,30.155333,121.234464,28.62,0,0],[0,30.155458,121.234393,28.62,0,0],[0,30.155202,121.234453,28.62,0,0],[0,30.155296,121.234408,28.62,0,0],[0,30.155283,121.234406,28.62,0,0],[0,30.155173,121.234459,28.62,0,0],[0,30.155120,121.234416,28.62,0,0],[0,30.155102,121.234383,28.62,0,0],[0,30.155087,121.234356,28.62,0,0],[0,30.155074,121.234333,28.62,0,0],[0,30.155083,121.234380,28.62,0,0],[0,30.155111,121.234474,28.62,0,0],[0,30.155114,121.234481,28.62,0,0],[0,30.155114,121.234482,28.62,0,0],[0,30.155114,121.234482,28.62,0,0],[0,30.155109,121.234471,28.62,0,0],[0,30.155105,121.234459,28.62,0,0],[0,30.155441,121.234300,28.62,0,0],[0,30.155137,121.234420,28.62,0,0],[0,30.155440,121.234372,28.62,0,0],[0,30.155037,121.234189,28.62,0,0],[0,30.155143,121.234382,28.62,0,0],[0,30.155106,121.234336,28.62,0,0],[0,30.155084,121.234309,28.62,0,0],[0,30.155067,121.234288,28.62,0,0],[0,30.155054,121.234271,28.62,0,0],[0,30.155044,121.234259,28.62,0,0],[0,30.155034,121.234247,28.62,0,0],[0,30.155028,121.234239,28.62,0,0],[0,30.155024,121.234234,28.62,0,0],[0,30.155213,121.234226,28.62,0,0],[0,30.155109,121.234436,28.62,0,0],[0,30.155074,121.234372,28.62,0,0],[0,30.155104,121.234458,28.62,0,0],[0,30.155106,121.234462,28.62,0,0],[0,30.155106,121.234462,28.62,0,0],[0,30.155108,121.234467,28.62,0,0],[0,30.155109,121.234470,28.62,0,0],[0,30.155107,121.234466,28.62,0,0],[0,30.155109,121.234471,28.62,0,0],[0,30.155097,121.234439,28.62,0,0],[0,30.155130,121.234524,28.62,0,0],[0,30.155122,121.234502,28.62,0,0],[0,30.155123,121.234507,28.62,0,0]]}]}";

        HelpDetailResult helpDetailResult = JSON.parseObject(s, HelpDetailResult.class);
//        List<HelpDetailResult.TrkBean> trk = helpDetailResult.getTrk();
//
//        List<MapLoaction> mapLoactionList = new ArrayList<>();
//
//        for (HelpDetailResult.TrkBean trkBean : trk) {
//            List<List> trkseg = trkBean.getTrkseg();
//            List<ArrayList> list = trkseg.get(0);
//            for (ArrayList alist : list) {
//                MapLoaction mapLoaction = new MapLoaction(alist);
//                mapLoactionList.add(mapLoaction);
//            }
//        }
//
        List<HelpDetailResult.TrkBean> trk = helpDetailResult.getTrk();
        List<MapLoaction> trkseg = trk.get(0).getTrkseg();
        System.out.println(trkseg.size());
//        System.out.println(helpDetailResult);
    }
}

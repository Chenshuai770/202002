package com.cs.charty.url;

import com.alibaba.fastjson.JSON;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UrlTest {
    public static void main(String[] args) {

        String url = "https://www.etx365.cn/info.rsex?get_users&sign=70deea191bcc60e438bad7b89eef45de&userid=charity_b39e154de951522f0d0cc69c&timestamp=1600220412";
        String url2 = "www.xxxx.com?get_users&a=117.191364&b=36.684343";
        Map<String, String> parameter = getParameter(url);
        System.out.println(parameter);
        parameter.remove("sign");
        System.out.println(parameter);
//        String s = JSON.toJSONString(parameter);
//        System.out.println(parameter);

        String urlParamsByMap = getUrlParamsByMap(parameter);
        System.out.println(urlParamsByMap);

        String[] split = url.split("&");
        String s = split[0];
        System.out.println(s);

//        String test = "get_user";
//        int i = test.indexOf("=");
//        System.out.println(i);
    }
    /**
     * 将map转换成url
     * @param map
     * @return
     */
    public static String getUrlParamsByMap(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey() + "=" + entry.getValue());
            sb.append("&");
        }
        String s = sb.toString();
        if (s.endsWith("&")) {
            s = s.substring(0, s.length()-1);
        }
        return s;
    }





        /**
         * 获取全部参数放进HashMap中返回
         *
         * @param url
         * @return
         */
    public static Map<String, String> getParameter(String url) {
        Map<String, String> map = new HashMap<String, String>();
        try {
            final String charset = "utf-8";
            url = URLDecoder.decode(url, charset);
            if (url.indexOf('?') != -1) {
                final String contents = url.substring(url.indexOf('?') + 1);
                String[] keyValues = contents.split("&");
                for (int i = 0; i < keyValues.length; i++) {
                    if (keyValues[i].indexOf("=") == -1) {
                        continue;
                    }
                    String key = keyValues[i].substring(0, keyValues[i].indexOf("="));
                    String value = keyValues[i].substring(keyValues[i].indexOf("=") + 1);
                    map.put(key, value);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 获取某一个参数的具体值,需要提供key值
     *
     * @param url
     * @param keyWord
     * @return
     */
    public static String getOneParameter(String url, String keyWord) {
        String retValue = "";
        try {
            final String charset = "utf-8";
            url = URLDecoder.decode(url, charset);
            if (url.indexOf('?') != -1) {
                final String contents = url.substring(url.indexOf('?') + 1);
                String[] keyValues = contents.split("&");
                for (int i = 0; i < keyValues.length; i++) {
                    if (keyValues[i].indexOf("=") == -1) {
                        continue;
                    }
                    String key = keyValues[i].substring(0, keyValues[i].indexOf("="));
                    String value = keyValues[i].substring(keyValues[i].indexOf("=") + 1);
                    if (key.equals(keyWord)) {
                        if (value != null || !"".equals(value.trim())) {
                            retValue = value;
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retValue;
    }
}

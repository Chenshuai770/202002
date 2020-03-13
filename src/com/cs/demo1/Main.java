package com.cs.demo1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Main {

    public static void main(String[] args) {
       /// System.out.println("Hello World!");


        String html = "<a href=\"https://s.etx365.cn/picture/202002/dc70e778ed6b90b1f20e0384ae566bb8.jpg\" target=\"_blank\"><img width=\"320\" style=\"height:360\" src=\"https://s.etx365.cn/picture/202002/thumbs/dc70e778ed6b90b1f20e0384ae566bb8.jpg\"/></a >";

        Document document = Jsoup.parse(html);
        //像js一样，通过标签获取 a标签
        Element aTag =  document.getElementsByTag("a").first();
        // 拿到a标签的 href字段
        String href = aTag.attr("href");
        // 获取a标签里面的img标签
        Element imgTag = aTag.getElementsByTag("img").first();
        // 获取img标签的src
        String src = imgTag.attr("src");

        System.out.println("a标签的href:" + href);

        System.out.println("img标签的src:" + src);
    }







}

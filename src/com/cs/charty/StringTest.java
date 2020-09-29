package com.cs.charty;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.util.List;

public class StringTest {
    public static void main(String[] args) {
        String dex = "<b>天天</b><br>1991年09月16日 (28 岁)<hr>经纬度: 30.155078,121.234417<br>时间: 2020-09-05 17:20:00<hr>血型: B+<br>体重: 50.0 公斤<br>身高: 175 厘米<br>过敏史: 青霉素药物过敏";

        Document document = Jsoup.parse(dex);
        //像js一样，通过标签获取 a标签
        Element child = document.child(0);
        Element target = null;
        List<Node> nodes1 = child.childNodes();
        for (Node node : nodes1) {
            Element element = (Element) node;
            String s = element.tagName();
            if (s.equals("body")) {
                target = element;
                break;
            }
        }
        if (target != null) {
            List<Node> nodes = target.childNodes();
            for (Node node : nodes) {
                if (node instanceof TextNode) {
                    TextNode node1 = (TextNode) node;
                }
            }

        }


    }
}

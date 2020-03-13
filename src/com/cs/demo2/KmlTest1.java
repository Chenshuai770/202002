package com.cs.demo2;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class KmlTest1 {
    public static void main(String[] args) {
        SAXReader sax = new SAXReader();// 创建一个SAXReader对象
        File xmlFile = new File("k2.kml");// 根据指定的路径创建file对象
        Document document = null;// 获取document对象,如果文档无节点，则会抛出Exception提前结束
        try {
            document = sax.read(xmlFile);
        } catch (DocumentException e) {
            e.printStackTrace();
        }


        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements();
        Element kmlDoc = rootElement.element("Document");
        List<Element> elementList = kmlDoc.elements();
        for (Element element : elementList) {
            System.out.println(element.getName());
        }


    }
}

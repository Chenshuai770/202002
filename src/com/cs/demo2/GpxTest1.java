package com.cs.demo2;

import org.dom4j.*;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class GpxTest1 {
    public static void main(String[] args) {
        SAXReader sax = new SAXReader();// 创建一个SAXReader对象
        File xmlFile = new File("etx.gpx");// 根据指定的路径创建file对象
        Document document = null;// 获取document对象,如果文档无节点，则会抛出Exception提前结束
        try {
            document = sax.read(xmlFile);
        } catch (DocumentException e) {
            e.printStackTrace();
        }


        Element rootElement = document.getRootElement();



        List<Attribute> attributes = rootElement.attributes();
        System.out.println(rootElement.getNamespace());
        QName qName = rootElement.getQName();
        System.out.println(qName.toString());
        System.out.println(rootElement.getQName("xmlns"));
        /*Iterator<Attribute> iterator = attributes.iterator();
        while (iterator.hasNext()) {
            Attribute next = iterator.next();
            System.out.println(next.getName());
        }*/

       /* List<Element> elements = rootElement.elements();

        List<Element> wpt = rootElement.elements("wpt");
        for (Element element : wpt) {
            //Attribute attribute = element.attribute(0);
            Attribute attribute = element.attribute("lon");
            System.out.println(attribute.getName()+"\t"+attribute.getText());
            List<Element> elements1 = element.elements();
            for (Element element1 : elements1) {

                System.out.println(element1.getName()+"\t"+element1.getText());
            }
        }*/




        /*for (Element element : elements) {
            System.out.println(element.getName());
        }*/

    }
}

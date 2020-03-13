package com.cs.kml.util;

import com.cs.kml.bean.*;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class KmlParser {
    private static final String DOCUMENT_TAG = "Document";
    private static final String PLACEMARK_TAG = "Placemark";
    private static final String PLACEMARK_NAME_TAG = "name";
    private static final String PLACEMARK_OPEN_TAG = "open";
    private static final String PLACEMARK_POINT_TAG = "Point";
    private static final String PLACEMARK_POINT_COORDINATES_TAG = "coordinates";
    private static final String STYLE_TAG = "Style";
    private static final String STYLE_MAP_TAG = "StyleMap";
    private static final String STYLE_ICON_SCALE_TAG = "scale";
    private static final String STYLE_ICON_HREF_TAG = "href";
    private static final String PLACEMARK_DESCRIPTION_TAG = "description";
    private static final String PLACEMARK_ADDRESS_TAG = "address";
    private static final String PLACEMARK_SNIPPET_TAG = "Snippet";
    private static final String PLACEMARK_XDATA_TAG = "ExtendedData";
    private static final String PLACEMARK_STYLE_URL_TAG = "styleUrl";
    private static final String STYLE_MAP_PAIR_TAG = "Pair";
    private static final String KEY_TAG = "key";
    private static final String POLYGON_TAG = "Polygon";
    public static final String LINE_STRING_TAG = "LineString";
    private static final String LINE_STYLE_TAG = "LineStyle";
    private static final String POLY_STYLE_TAG = "PolyStyle";
    private static final String COLOR_TAG = "color";
    private static final String WIDTH_TAG = "width";
    private static final String DATA_TAG = "Data";
    private static final String VALUE_TAG = "value";
    private static final String KML_TAG = "kml";
    private static final String FOLDER_TAG = "Folder";
    private static final String TIMEINSTANT_TAG = "TimeInstant";
    private static final String TESSELLATE_TAG = "tessellate";



    public Kml parse(String path) {
        try {
            File file = new File(path);
            SAXReader sax = new SAXReader();// 创建一个SAXReader对象
            Document document = null;// 获取document对象,如果文档无节点，则会抛出Exception提前结束
            try {
                document = sax.read(file);
            } catch (DocumentException e) {
                e.printStackTrace();
            }
            return readKml(document);
        } finally {

        }
    }

    private Kml readKml(Document document) {
        Element eRoot = document.getRootElement();
        Element kmlDoc = eRoot.element("Document");
        Folder.Builder folderBuilder = getFolder(kmlDoc);

        Placemark.Builder placemarkBuilder = new Placemark.Builder();
        Element elementPlacemark = kmlDoc.element(PLACEMARK_TAG);
        //System.out.println(elementPlacemark.getName());
        for (Element element : elementPlacemark.elements()) {
            switch (element.getName()) {
                case PLACEMARK_NAME_TAG:
                    placemarkBuilder.setName(element.getText());
                    break;
                case PLACEMARK_DESCRIPTION_TAG:
                    placemarkBuilder.setDescription(element.getText());
                    break;
                case LINE_STRING_TAG:
                    List<Element> elementList = element.elements();
                    LineString.Builder lineBuilder = new LineString.Builder();
                    for (Element sElement : elementList) {
                        switch (sElement.getName()) {
                            case TESSELLATE_TAG:
                                lineBuilder.setTessellate(sElement.getText());
                                break;
                            case PLACEMARK_POINT_COORDINATES_TAG:
                                String text = sElement.getTextTrim();
                                String[] nodeContentSplit = text.split(" ");
                                List<FolderPoint> mFolderPointList=new ArrayList<>();
                                for (int i = 0; i < nodeContentSplit.length; i++) {
                                    FolderPoint folderPoint = new FolderPoint();
                                    String[] split = nodeContentSplit[i].split(",");
                                    folderPoint.setLongitude(Double.parseDouble(split[0]));
                                    folderPoint.setLatitude(Double.parseDouble(split[1]));
                                    folderPoint.setHeight(Double.parseDouble(split[2]));
                                    mFolderPointList.add(folderPoint);
                                }
                                lineBuilder.setPoints(mFolderPointList);
                                break;
                        }
                    }
                    placemarkBuilder.setLineString(lineBuilder.Builder());
                    break;
            }
        }

        Kml.Builder builder = new Kml.Builder();
        return builder.setFolder(folderBuilder.Builder())
                .setPlacemark(placemarkBuilder.Builder())
                .build();
    }

    /**
     * 第一步 获取Folder对象
     * @param kmlDoc
     * @return
     */
    private Folder.Builder getFolder(Element kmlDoc) {
        Folder.Builder folderBuilder = new Folder.Builder();
        Element folderElement = kmlDoc.element(FOLDER_TAG);
        List<Element> folderElementList = folderElement.elements();
        List<FolderPlacemark> folderPlacemarList=new ArrayList<>();
        //List<Lap> mLapList = new ArrayList<>();
        for (Element folderSeElement : folderElementList) {
            //Lap.Builder lapBuilder = new Lap.Builder();
            switch (folderSeElement.getName()) {
                case PLACEMARK_NAME_TAG:
                    folderBuilder.setName(folderSeElement.getText());
                    break;
                case PLACEMARK_OPEN_TAG:
                    folderBuilder.setOpen(folderSeElement.getText());
                    break;
                case PLACEMARK_TAG:

                    List<Element> folderPlacemarkElementList = folderSeElement.elements();
                    FolderPlacemark.Builder folderPlacemarkBuilder = new FolderPlacemark.Builder();
                    for (Element element : folderPlacemarkElementList) {
                        //System.out.println(element.getName());

                        switch (element.getName()) {
                            case PLACEMARK_NAME_TAG:
                                folderPlacemarkBuilder.setName(element.getText());
                                break;
                            case PLACEMARK_POINT_TAG:
                                FolderPoint folderPoint = new FolderPoint();
                                Element pointElement = element.element(PLACEMARK_POINT_COORDINATES_TAG);
                                String[] nodeContentSplit = pointElement.getTextTrim().split(" ");
                                for (int i = 0; i < nodeContentSplit.length; i++) {
                                    String[] split = nodeContentSplit[i].split(",");
                                    folderPoint.setLongitude(Double.parseDouble(split[0]));
                                    folderPoint.setLatitude(Double.parseDouble(split[1]));
                                    folderPoint.setHeight(Double.parseDouble(split[2]));
                                }
                                folderPlacemarkBuilder.setFolderPoint(folderPoint);

                                break;
                            case TIMEINSTANT_TAG:
                                folderPlacemarkBuilder.setTime(element.element("timePosition").getText());
                                break;
                            case PLACEMARK_DESCRIPTION_TAG:
                                folderPlacemarkBuilder.setDescription(element.getText());
                                break;
                        }

                    }
                    folderPlacemarList.add(folderPlacemarkBuilder.Builder());
                    folderBuilder.setmFolderPlacemark(folderPlacemarList);
                    break;

            }

        }
        return folderBuilder;
    }
}

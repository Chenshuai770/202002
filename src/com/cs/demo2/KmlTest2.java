package com.cs.demo2;

import com.cs.kml.bean.*;
import com.cs.kml.util.KmlParser;

import java.util.List;

public class KmlTest2 {
    public static void main(String[] args) {
        KmlParser mParser = new KmlParser();
        Kml parse = mParser.parse("etx.kml");
        Folder folder = parse.getFolder();


        //System.out.println(folder.getmFolderPlacemark().size());
        List<FolderPlacemark> folderPlacemarkList = folder.getmFolderPlacemark();
        for (FolderPlacemark folderPlacemark : folderPlacemarkList) {
//            System.out.println(folderPlacemark.getName());
            //System.out.println(folderPlacemark.getDescription());
            //FolderPoint folderPoint = folderPlacemark.getFolderPoint();
            //System.out.println(folderPoint.getLatitude());
        }

       /* Placemark placemark = parse.getPlacemark();
        LineString lineString = placemark.getLineString();
        List<FolderPoint> points = lineString.getPoints();
        System.out.println(lineString.getTessellate());
        System.out.println(points.size());
        System.out.println(placemark.getName());*/


    }
}

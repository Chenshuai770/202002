package com.cs.gpx.uitl;

import com.cs.gpx.domain.*;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.joda.time.DateTime;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GPXParser {

    static private final String TAG_GPX = "gpx";
    static private final String TAG_VERSION = "version";
    static private final String TAG_CREATOR = "creator";
    static private final String TAG_METADATA = "metadata";
    static private final String TAG_TRACK = "trk";
    static private final String TAG_SEGMENT = "trkseg";
    static private final String TAG_TRACK_POINT = "trkpt";
    static private final String TAG_LAT = "lat";
    static private final String TAG_LON = "lon";
    static private final String TAG_ELEVATION = "ele";
    static private final String TAG_TIME = "time";
    static private final String TAG_WAY_POINT = "wpt";
    static private final String TAG_ROUTE = "rte";
    static private final String TAG_ROUTE_POINT = "rtept";
    static private final String TAG_NAME = "name";
    static private final String TAG_DESC = "desc";
    static private final String TAG_CMT = "cmt";
    static private final String TAG_SRC = "src";
    static private final String TAG_LINK = "link";
    static private final String TAG_NUMBER = "number";
    static private final String TAG_TYPE = "type";
    static private final String TAG_TEXT = "text";
    static private final String TAG_AUTHOR = "author";
    static private final String TAG_COPYRIGHT = "copyright";
    static private final String TAG_KEYWORDS = "keywords";
    static private final String TAG_BOUNDS = "bounds";
    static private final String TAG_EXTENSIONS = "extensions";
    static private final String TAG_MIN_LAT = "minlat";
    static private final String TAG_MIN_LON = "minlon";
    static private final String TAG_MAX_LAT = "maxlat";
    static private final String TAG_MAX_LON = "maxlon";
    static private final String TAG_HREF = "href";
    static private final String TAG_YEAR = "year";
    static private final String TAG_LICENSE = "license";
    static private final String TAG_EMAIL = "email";
    static private final String TAG_ID = "id";
    static private final String TAG_DOMAIN = "domain";
    static private final String TAG_INDEX = "index";
    static private final String TAG_SPEED = "speed";
    static private final String TAG_LAP = "lap";
    static private final String TAG_STARTTIME = "startTime";
    static private final String TAG_ELAPSEDTIME = "elapsedTime";
    static private final String TAG_ALTITUDE = "altitude";
    static private final String TAG_DISTANCE = "distance";
    static private final String TAG_RISEFALL = "riseFall";
    static private final String TAG_AVGSPEED = "avgSpeed";



    public Gpx parse(String path) {
        try {
            File file = new File(path);
            SAXReader sax = new SAXReader();// 创建一个SAXReader对象
            Document document = null;// 获取document对象,如果文档无节点，则会抛出Exception提前结束
            try {
                document = sax.read(file);
            } catch (DocumentException e) {
                e.printStackTrace();
            }
            return readGpx(document);
        } finally {

        }
    }

    private Gpx readGpx(Document document) {

        List<WayPoint> wayPoints = new ArrayList<>();
        List<Track> tracks = new ArrayList<>();
        List<Route> routes = new ArrayList<>();

        Element eRoot = document.getRootElement();
        readWayPoint(wayPoints, eRoot);
        readTrk(tracks, eRoot);
        Metadata.Builder metadataBuilder = readMetadata(eRoot);


        Extensions.Builder extensionBuilder = new Extensions.Builder();
        Element extensions = eRoot.element(TAG_EXTENSIONS);
        System.out.println(extensions);
        if (extensions!=null) {
            List<Element> lapList = extensions.elements(TAG_LAP);
            List<Lap> mLapList = new ArrayList<>();
            for (Element lap : lapList) {
                Lap.Builder lapBuilder = new Lap.Builder();
                //System.out.println(lap.getName());
                for (Element element : lap.elements()) {
                    switch (element.getName()) {
                        case TAG_INDEX:
                            lapBuilder.setIndex(Integer.valueOf(element.getText()));
                            break;
                        case TAG_STARTTIME:
                            DateTime dateTime = new DateTime(element.getText());
                            lapBuilder.setStartTime(dateTime);
                            break;
                        case TAG_ELAPSEDTIME:
                            lapBuilder.setElapsedTime(element.getText());
                            break;
                        case TAG_ALTITUDE:
                            lapBuilder.setAltitude(element.getText());
                            break;
                        case TAG_RISEFALL:
                            lapBuilder.setRiseFall(element.getText());
                            break;
                        case TAG_DISTANCE:
                            lapBuilder.setDistance(element.getText());
                            break;
                        case TAG_AVGSPEED:
                            lapBuilder.setAltitude(element.getText());
                            break;
                    }

                }
                mLapList.add(lapBuilder.build());

            }
            extensionBuilder.setLap(mLapList);
        }else {
            List<Lap> mLapList = new ArrayList<>();
            extensionBuilder.setLap(mLapList);
        }

        
        
        

      /*  List<Lap> mLapList = new ArrayList<>();
       
        for (Element element : lapList) {
            System.out.println(element.getName());
            Lap.Builder lapBuilder = new Lap.Builder();
            switch (element.getName()) {
                case TAG_INDEX:
                    lapBuilder.setIndex(Integer.valueOf(element.getText()));
                    break;
                case TAG_STARTTIME:
                    DateTime dateTime = new DateTime(element.getText());
                    lapBuilder.setStartTime(dateTime);
                    break;
                case TAG_ELAPSEDTIME:
                    lapBuilder.setElapsedTime(element.getText());
                    break;
                case TAG_ALTITUDE:
                    lapBuilder.setAltitude(element.getText());
                    break;
                case TAG_RISEFALL:
                    lapBuilder.setRiseFall(element.getText());
                    break;
                case TAG_DISTANCE:
                    lapBuilder.setDistance(element.getText());
                    break;
                case TAG_AVGSPEED:
                    lapBuilder.setAltitude(element.getText());
                    break;

            }
            mLapList.add(lapBuilder.build());
        }
        extensionBuilder.setLap(mLapList);*/


        Gpx.Builder builder = new Gpx.Builder();
        return builder.setWayPoints(wayPoints)
                .setTracks(tracks)
                .setRoutes(routes)
                .setMetadata(metadataBuilder.build())
                .setExtensions(extensionBuilder.build())
                .build();
    }

    /**
     * Metadata 数据的对应读取思路
     *
     * @param eRoot
     */
    private Metadata.Builder readMetadata(Element eRoot) {
        Metadata.Builder metadataBuilder = new Metadata.Builder();
        List<Element> metadataList = eRoot.elements(TAG_METADATA);
        for (Element element : metadataList) {
            //System.out.println(element.getName());
            List<Element> selementList = element.elements();
            for (Element seEment : selementList) {
                //System.out.println(seEment.getName());
                switch (seEment.getName()) {

                    case TAG_NAME:
                        metadataBuilder.setName(seEment.getText());
                        break;
                    case TAG_DESC:
                        metadataBuilder.setDesc(seEment.getText());
                        break;
                    case TAG_AUTHOR:
                        //todo 由于格式问题,这个xml config 是写在copyright里面了
                        break;
                    case TAG_COPYRIGHT:
                        Copyright.Builder copyright = new Copyright.Builder();
                        Attribute attribute = seEment.attribute(TAG_AUTHOR);
                        copyright.setmAttAuthor(attribute.getText());

                        List<Element> copyrightList = seEment.elements();
                        for (Element selement : copyrightList) {
                            switch (selement.getName()) {
                                case TAG_YEAR:
                                    copyright.setYear(Integer.valueOf(selement.getText()));
                                    break;
                                case TAG_VERSION:
                                    copyright.setmVersion(selement.getText());
                                    break;
                                case TAG_LICENSE:
                                    copyright.setLicense(selement.getText());
                                    break;
                                case TAG_AUTHOR:
                                    copyright.setAuthor(selement.getText());
                                    break;
                            }

                        }
                        metadataBuilder.setCopyright(copyright.build());
                        break;
                    case TAG_LINK:

                        //System.out.println(seEment.attribute(TAG_HREF).getName());
                        Link.Builder link = new Link.Builder();
                        link.setLinkHref(seEment.attribute(TAG_HREF).getText());
                        String text = seEment.element(TAG_TEXT).getText();
                        link.setLinkText(text);
                        metadataBuilder.setLink(link.build());
                        break;
                    case TAG_TIME:
                        DateTime dateTime = new DateTime(seEment.getText());
                        metadataBuilder.setTime(dateTime);
                        break;

                }

            }
        }
        return metadataBuilder;
    }

    /**
     * 去读取轨迹点，看是否能正常显示出来
     *
     * @param tracks
     * @param eRoot
     */
    private void readTrk(List<Track> tracks, Element eRoot) {
        List<Element> trkElements = eRoot.elements(TAG_TRACK);
        for (Element eTrk : trkElements) {
            Track.Builder eTrBuilder = new Track.Builder();
            List<TrackSegment> segments = new ArrayList<>();//这里特殊处理下就行了
            List<Element> esTrakElements = eTrk.elements();
            for (Element seTrk : esTrakElements) {

                switch (seTrk.getName()) {
                    case TAG_NAME:
                        eTrBuilder.setTrackName(seTrk.getText());
                        break;
                    case TAG_INDEX:
                        eTrBuilder.setTrackNumber(Integer.valueOf(seTrk.getText()));
                        break;
                    case TAG_SEGMENT:
                        TrackSegment.Builder trackSegment = new TrackSegment.Builder();
                        List<TrackPoint> trackPointList = new ArrayList<>();
                        List<Element> segElements = seTrk.elements();
                        for (Element segE : segElements) {
                            Attribute aLat = segE.attribute(TAG_LAT);
                            Attribute alon = segE.attribute(TAG_LON);
                            TrackPoint.Builder trackPoint = new TrackPoint.Builder();
                            trackPoint.setLatitude(Double.valueOf(aLat.getText()));
                            trackPoint.setLongitude(Double.valueOf(alon.getText()));
                            List<Element> esWptElements = segE.elements();
                            for (Element esWpt : esWptElements) {
                                switch (esWpt.getName()) {
                                    case TAG_ELEVATION:
                                        trackPoint.setElevation(Double.valueOf(esWpt.getText()));
                                        break;
                                    case TAG_TIME:
                                        DateTime dateTime = new DateTime(esWpt.getText());
                                        trackPoint.setTime(dateTime);
                                        break;
                                    case TAG_SPEED:
                                        trackPoint.setName(esWpt.getText());
                                        break;

                                }
                            }
                            trackPointList.add(trackPoint.build());

                        }
                        trackSegment.setTrackPoints(trackPointList);
                        segments.add(trackSegment.build());

                        break;

                }
            }
            eTrBuilder.setTrackSegments(segments);
            Track build = eTrBuilder.build();
            tracks.add(build);

        }
    }


    /**
     * way 数据读取出来 对应的应该是marker点
     *
     * @param wayPoints
     * @param eRoot
     */
    private void readWayPoint(List<WayPoint> wayPoints, Element eRoot) {
        List<Element> wptElements = eRoot.elements(TAG_WAY_POINT);
        for (Element eWpt : wptElements) {
            Attribute aLat = eWpt.attribute(TAG_LAT);
            Attribute alon = eWpt.attribute(TAG_LON);
            WayPoint.Builder wayPoint = new WayPoint.Builder();
            wayPoint.setLatitude(Double.valueOf(aLat.getText()));
            wayPoint.setLongitude(Double.valueOf(alon.getText()));
            List<Element> esWptElements = eWpt.elements();
            for (Element esWpt : esWptElements) {
                switch (esWpt.getName()) {
                    case TAG_ELEVATION:
                        wayPoint.setElevation(Double.valueOf(esWpt.getText()));
                        break;
                    case TAG_TIME:
                        DateTime dateTime = new DateTime(esWpt.getText());
                        wayPoint.setTime(dateTime);
                        break;
                    case TAG_NAME:
                        wayPoint.setName(esWpt.getText());
                        break;
                    case TAG_DESC:
                        wayPoint.setDesc(esWpt.getText());
                        break;
                }
            }
            wayPoints.add(wayPoint.build());
        }
    }
}

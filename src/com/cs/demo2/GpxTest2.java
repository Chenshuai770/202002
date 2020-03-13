package com.cs.demo2;

import com.cs.gpx.domain.*;
import com.cs.gpx.uitl.GPXParser;

import java.util.List;

public class GpxTest2 {
    public static void main(String[] args) {
        GPXParser mParser = new GPXParser();
        Gpx parse = mParser.parse("test.gpx");


        List<WayPoint> wayPoints = parse.getWayPoints();
        List<Route> routes = parse.getRoutes();
        List<Track> tracks = parse.getTracks();
        Metadata metadata = parse.getMetadata();
        Copyright copyright = metadata.getCopyright();
        Extensions extensions1 = parse.getExtensions();
       /* System.out.println(copyright.getmAttAuthor());
        System.out.println(copyright.getYear());
        System.out.println(copyright.getmVersion());
        System.out.println(copyright.getLicense());
        System.out.println(copyright.getAuthor());
        System.out.println(metadata.getName());
        System.out.println(metadata.getDesc());
        Link link = metadata.getLink();
        System.out.println(link.getHref());
        System.out.println(link.getText());*/
        Extensions extensions = parse.getExtensions();
        List<Lap> lap = extensions.getLap();
        List<WayPoint> wayPoints2 = parse.getWayPoints();


        List<WayPoint> wayPoints1 = parse.getWayPoints();

        for (Lap lap1 : lap) {
            System.out.println(lap1.getStartTime());
        }


        for (Track track : tracks) {
            //System.out.println(track.getTrackName());
            List<TrackSegment> trackSegments = track.getTrackSegments();
            //System.out.println(trackSegments.size());
            for (TrackSegment trackSegment : trackSegments) {
                List<TrackPoint> trackPoints = trackSegment.getTrackPoints();
                for (TrackPoint trackPoint : trackPoints) {
                    //System.out.println(trackPoint.getElevation());
                }
            }
        }

        //System.out.println(tracks.size());

    }
}

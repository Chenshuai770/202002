package com.cs.charty;

public class JaveStringTest {
    public static void main(String[] args) {
        String a = "ffmpeg -y -i /storage/emulated/0/AAA/source.mp4 -filter_complex scale=1280:1280/a -b:v 1500k -r 24 -ar 44100 -c:a aac -c:v libx264 -movflags faststart /storage/emulated/0/AAA/G.mp4";
        String b = "ffmpeg -y -i /storage/emulated/0/AAA/source.mp4 -i /storage/emulated/0/AAA/watermark.png -filter_complex [0:v]scale=1280:1280/a[bg];[bg][1:v]overlay=main_w-overlay_w-20:main_h-overlay_h-20 -b:v 1500k -r 24 -ar 44100 -c:a aac -c:v libx264 -movflags faststart /storage/emulated/0/AAA/W.mp4";
        String c = "ffmpeg -i /storage/emulated/0/AAA/source.JPG -vf scale=1280:1280/a -q:v 2 /storage/emulated/0/AAA/D.JPG";
        String d = "ffmpeg -i /storage/emulated/0/AAA/source.JPG -i /storage/emulated/0/AAA/watermark.png -filter_complex [0:v]scale=1280:1280/a[bg];[bg][1:v]overlay=main_w-overlay_w-20:main_h-overlay_h-20 -q:v 2 /storage/emulated/0/AAA/E.JPG";

        String video = getVideo("/storage/emulated/0/AAA/source.mp4", "/storage/emulated/0/AAA/G.mp4");
        String videoWater = getVideoWater("/storage/emulated/0/AAA/source.mp4", "/storage/emulated/0/AAA/watermark.png","/storage/emulated/0/AAA/W.mp4");
        String image = getImage("/storage/emulated/0/AAA/source.JPG", "/storage/emulated/0/AAA/D.JPG");
        String imageWater = getImageWater("/storage/emulated/0/AAA/source.JPG", "/storage/emulated/0/AAA/watermark.png","/storage/emulated/0/AAA/E.JPG");
        System.out.println(video);
        System.out.println(videoWater);
        System.out.println(a.equals(video));
        System.out.println(b.equals(videoWater));
        System.out.println(c.equals(image));
        System.out.println(d.equals(imageWater));

    }



    public final static String getVideo(String source, String target) {
        String format = String.format("ffmpeg -y -i %s -filter_complex scale=1280:1280/a -b:v 1500k -r 24 -ar 44100 -c:a aac -c:v libx264 -movflags faststart %s", source, target);
        return format;
    }



    public final static String getVideoWater(String source, String water, String target) {
        String format = String.format("ffmpeg -y -i %s -i %s -filter_complex [0:v]scale=1280:1280/a[bg];[bg][1:v]overlay=main_w-overlay_w-20:main_h-overlay_h-20 -b:v 1500k -r 24 -ar 44100 -c:a aac -c:v libx264 -movflags faststart %s", source, water, target);
        return format;
    }

    public final static String getImage(String source, String target) {
        String format = String.format("ffmpeg -i %s -vf scale=1280:1280/a -q:v 2 %s", source, target);
        return format;
    }

    public final static String getImageWater(String source, String water, String target) {
        String format = String.format("ffmpeg -i %s -i %s -filter_complex [0:v]scale=1280:1280/a[bg];[bg][1:v]overlay=main_w-overlay_w-20:main_h-overlay_h-20 -q:v 2 %s", source, water, target);
        return format;
    }


}

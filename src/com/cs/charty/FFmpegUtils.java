package com.cs.charty;

/**
 * String a = "ffmpeg -y -i /storage/emulated/0/AAA/source.mp4 -filter_complex scale=1280:1280/a -b:v 1500k -r 24 -ar 44100 -c:a aac -c:v libx264 -movflags faststart /storage/emulated/0/AAA/G.mp4";
 * String b = "ffmpeg -y -i /storage/emulated/0/AAA/source.mp4 -i /storage/emulated/0/AAA/watermark.png -filter_complex [0:v]scale=1280:1280/a[bg];[bg][1:v]overlay=main_w-overlay_w-20:main_h-overlay_h-20 -b:v 1500k -r 24 -ar 44100 -c:a aac -c:v libx264 -movflags faststart /storage/emulated/0/AAA/W.mp4";
 * String c = "ffmpeg -i /storage/emulated/0/AAA/source.JPG -vf scale=1280:1280/a -q:v 2 /storage/emulated/0/AAA/D.JPG";
 * String d = "ffmpeg -i /storage/emulated/0/AAA/source.JPG -i /storage/emulated/0/AAA/watermark.png -filter_complex [0:v]scale=1280:1280/a[bg];[bg][1:v]overlay=main_w-overlay_w-20:main_h-overlay_h-20 -q:v 2 /storage/emulated/0/AAA/E.JPG";
 */
public class FFmpegUtils {
    public final static String getVideo(String source, String target) {
        String format = String.format("ffmpeg -y -i %s -filter_complex scale=1280:1280/a -b:v 1500k -r 24 -ar 44100 -c:a aac -c:v libx264 -movflags faststart %s", source, target);
        return format;
    }

    /**
     * 视频水印
     *
     * @param source 原目录 /storage/emulated/0/AAA/source.mp4
     * @param water  水印 /storage/emulated/0/AAA/watermark.png
     * @param target 目标目录 /storage/emulated/0/AAA/target.ma4
     */
    public final static String getVideoWater(String source, String water, String target) {
        String format = String.format("ffmpeg -y -i %s -i %s -filter_complex [0:v]scale=1280:1280/a[bg];[bg][1:v]overlay=main_w-overlay_w-20:main_h-overlay_h-20 -b:v 1500k -r 24 -ar 44100 -c:a aac -c:v libx264 -movflags faststart %s", source, water, target);
        return format;
    }


    /**
     * 图片不管是png 还是 jpg ,target统一设置 JPG
     *
     * @param source
     * @param target
     * @return
     */
    public final static String getImage(String source, String target) {
        String format = String.format("ffmpeg -i %s -vf scale=1280:1280/a -q:v 2 %s", source, target);
        return format;
    }

    public final static String getImageWater(String source, String water, String target) {
        String format = String.format("ffmpeg -i %s -i %s -filter_complex [0:v]scale=1280:1280/a[bg];[bg][1:v]overlay=main_w-overlay_w-20:main_h-overlay_h-20 -q:v 2 %s", source, water, target);
        return format;
    }
}

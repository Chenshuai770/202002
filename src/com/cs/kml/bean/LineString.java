package com.cs.kml.bean;

import java.util.List;

public class LineString {
    private String tessellate;
    private List<FolderPoint> mPoints;

    public LineString(Builder builder) {
        tessellate=builder.tessellate;
        mPoints=builder.mPoints;

    }

    public String getTessellate() {
        return tessellate;
    }

    public List<FolderPoint> getPoints() {
        return mPoints;
    }
    public static class Builder{
        private String tessellate;
        private List<FolderPoint> mPoints;

        public Builder setTessellate(String tessellate) {
            this.tessellate = tessellate;
            return this;
        }

        public Builder setPoints(List<FolderPoint> mPoints) {
            this.mPoints = mPoints;
            return this;
        }

        public LineString Builder(){
            return new LineString(this);
        }
    }
}

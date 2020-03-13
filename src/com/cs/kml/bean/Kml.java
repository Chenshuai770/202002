package com.cs.kml.bean;

public class Kml {

    private Folder mFolder;
    private Placemark mPlacemark;

    private Kml(Builder builder) {
        mFolder = builder.mFolder;
        mPlacemark = builder.mPlacemark;
    }

    public static class Builder {

        private Folder mFolder;
        private Placemark mPlacemark;


        public Builder setFolder(Folder folder) {
            this.mFolder = folder;
            return this;
        }

        public Builder setPlacemark(Placemark placemark) {
            mPlacemark = placemark;
            return this;
        }

        public Kml build() {
            return new Kml(this);
        }


    }

    public Folder getFolder() {
        return mFolder;
    }

    public Placemark getPlacemark() {
        return mPlacemark;
    }
}

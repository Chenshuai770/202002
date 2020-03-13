package com.cs.kml.bean;

/**
 * Created by vashisthg on 23/03/14.
 */
public class FolderPlacemark {

    private String name;
    private String description;
    private FolderPoint folderPoint;
    private String time;


    public FolderPlacemark(FolderPlacemark.Builder builder) {
        name = builder.name;
        folderPoint = builder.folderPoint;
        description = builder.description;
        time = builder.time;
    }


    public static class Builder {
        private String name;
        private FolderPoint folderPoint;
        private String description;
        private String time;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setFolderPoint(FolderPoint folderPoint) {
            this.folderPoint = folderPoint;
            return this;
        }

        public Builder setTime(String time) {
            this.time = time;
            return this;
        }

        public FolderPlacemark Builder() {
            return new FolderPlacemark(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public FolderPoint getFolderPoint() {
        return folderPoint;
    }


    public String getTime() {
        return time;
    }
}

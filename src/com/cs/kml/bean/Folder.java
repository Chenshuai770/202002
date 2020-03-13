package com.cs.kml.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Folder {
    private String name;
    private String open;
    private List<FolderPlacemark> mFolderPlacemark;


    public String getName() {
        return name;
    }

    public String getOpen() {
        return open;
    }

    public List<FolderPlacemark> getmFolderPlacemark() {
        return mFolderPlacemark;
    }

    public Folder(Builder builder) {
        name = builder.name;
        open = builder.open;
        mFolderPlacemark = Collections.unmodifiableList(new ArrayList<>(builder.mFolderPlacemark));

    }

    public static class Builder {
        private String name;
        private String open;
        private List<FolderPlacemark> mFolderPlacemark;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setOpen(String open) {
            this.open = open;
            return this;
        }

        public Builder setmFolderPlacemark(List<FolderPlacemark> mFolderPlacemark) {
            this.mFolderPlacemark = mFolderPlacemark;
            return this;
        }

        public Folder Builder() {
            return new Folder(this);
        }
    }
}

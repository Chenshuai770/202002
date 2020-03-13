package com.cs.gpx.domain;

public class Copyright {

    private final String mAuthor;
    private final Integer mYear;
    private final String mLicense;
    private final String  mVersion;
    private final String mAttAuthor;

    private Copyright(Builder builder) {
        mAuthor = builder.mAuthor;
        mYear = builder.mYear;
        mLicense = builder.mLicense;
        mVersion = builder.mVersion;
        mAttAuthor = builder.mAttAuthor;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public Integer getYear() {
        return mYear;
    }

    public String getLicense() {
        return mLicense;
    }

    public String getmVersion() {
        return mVersion;
    }

    public String getmAttAuthor() {
        return mAttAuthor;
    }

    public static class Builder {
        private String mAuthor;
        private Integer mYear;
        private String mLicense;
        private String mVersion;
        private String mAttAuthor;

        public Builder setAuthor(String author) {
            mAuthor = author;
            return this;
        }

        public Builder setYear(Integer year) {
            mYear = year;
            return this;
        }

        public Builder setLicense(String license) {
            mLicense = license;
            return this;
        }

        public Copyright build() {
            return new Copyright(this);
        }

        public void setmVersion(String mVersion) {
            this.mVersion = mVersion;
        }

        public void setmAttAuthor(String mAttAuthor) {
            this.mAttAuthor = mAttAuthor;
        }
    }
}

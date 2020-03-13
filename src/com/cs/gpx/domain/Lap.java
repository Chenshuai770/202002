package com.cs.gpx.domain;

import org.joda.time.DateTime;

public class Lap {
    private Integer mIndex;
    private DateTime mStartTime;
    private String mElapsedTime;
    private String mAltitude;
    private String mRiseFall;
    private String mDistance;
    private String mAvgSpeed;

    public Integer getIndex() {
        return mIndex;
    }

    public DateTime getStartTime() {
        return mStartTime;
    }

    public String getElapsedTime() {
        return mElapsedTime;
    }

    public String getAltitude() {
        return mAltitude;
    }

    public String getRiseFall() {
        return mRiseFall;
    }

    public String getDistance() {
        return mDistance;
    }

    public String getAvgSpeed() {
        return mAvgSpeed;
    }


    Lap(Lap.Builder builder) {
        mIndex = builder.mIndex;
        mStartTime = builder.mStartTime;
        mElapsedTime = builder.mElapsedTime;
        mAltitude = builder.mAltitude;
        mRiseFall = builder.mRiseFall;
        mDistance = builder.mDistance;
        mAvgSpeed = builder.mAvgSpeed;
    }


    public static class Builder {
        private Integer mIndex;
        private DateTime mStartTime;
        private String mElapsedTime;
        private String mAltitude;
        private String mRiseFall;
        private String mDistance;
        private String mAvgSpeed;

        public Lap.Builder setIndex(Integer index) {
            mIndex = index;
            return this;
        }

        public Lap.Builder setStartTime(DateTime startTime) {
            mStartTime = startTime;
            return this;
        }

        public Lap.Builder setElapsedTime(String elapsedTime) {
            mElapsedTime = elapsedTime;
            return this;
        }

        public Lap.Builder setRiseFall(String riseFall) {
            mRiseFall = riseFall;
            return this;
        }

        public Lap.Builder setAltitude(String altitude) {
            mAltitude = altitude;
            return this;
        }

        public Lap.Builder setDistance(String distance) {
            mDistance = distance;
            return this;
        }

        public Lap.Builder setAvgSpeed(String avgSpeed) {
            mAvgSpeed = avgSpeed;
            return this;
        }


        public Lap build() {
            return new Lap(this);
        }


    }
}

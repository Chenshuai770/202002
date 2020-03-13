package com.cs.gpx.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Extensions {

    private final List<Lap> mLap;

    public List<Lap> getLap() {
        return mLap;
    }

    private Extensions(Extensions.Builder builder) {
        mLap = Collections.unmodifiableList(new ArrayList<>(builder.mLap));
    }

    public static class Builder {
        List<Lap> mLap;

        public Extensions.Builder setLap(List<Lap> lap) {
            mLap = lap;
            return this;
        }

        public Extensions build() {
            return new Extensions(this);
        }

    }


}

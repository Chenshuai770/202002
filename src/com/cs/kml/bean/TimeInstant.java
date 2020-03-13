package com.cs.kml.bean;

public class TimeInstant {
    public TimeInstant() {
    }

    public TimeInstant(String timePosition) {
        this.timePosition = timePosition;
    }

    public String getTimePosition() {
        return timePosition;
    }

    public void setTimePosition(String timePosition) {
        this.timePosition = timePosition;
    }

    private String timePosition;
}

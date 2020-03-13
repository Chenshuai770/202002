package com.cs.kml.bean;

public class Placemark {
    private String name;
    private String description;
    private LineString lineString;

    public Placemark(Builder builder) {
        name=builder.name;
        description=builder.description;
        lineString=builder.lineString;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LineString getLineString() {
        return lineString;
    }

    public static class Builder {


        private String name;
        private String description;
        private LineString lineString;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setLineString(LineString lineString) {
            this.lineString = lineString;
            return this;
        }

        public Placemark Builder() {
            return new Placemark(this);
        }
    }
}

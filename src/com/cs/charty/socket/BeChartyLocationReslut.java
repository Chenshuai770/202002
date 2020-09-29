package com.cs.charty.socket;

import com.cs.charty.MapLoaction;

public class BeChartyLocationReslut {

    /**
     * action : post_track
     * data : {"usn":"22","location":"30.155446,121.234354,7.69,330282"}
     */

    private String action;
    private DataBean data;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * usn : 22
         * location : 30.155446,121.234354,7.69,330282
         */

        private String usn;
        private Object location;

        public String getUsn() {
            return usn;
        }

        public void setUsn(String usn) {
            this.usn = usn;
        }

        public Object getLocation() {
            return location;
        }

        public void setLocation(Object location) {
            String json = (String) location;
            String[] split = json.split(",");
            MapLoaction mapLoaction = new MapLoaction();
            mapLoaction.setLatitude(Double.parseDouble(split[0]));
            mapLoaction.setLongitude(Double.parseDouble(split[1]));
            mapLoaction.setAltitude(Double.parseDouble(split[2]));
            mapLoaction.setAdcode(split[3]);
            this.location = mapLoaction;
        }
    }
}

package com.cs.demo3;

import java.util.List;

/**
 * FileName: yyy
 * Date: 2020/8/7 21:35
 * Author:cs
 * Description:
 */
public class yyy {

    /**
     * coordinates : [[[121.23138428,30.32680392],[121.2426281,30.32729745],[121.24264956,30.32691121],[121.23138428,30.32635331],[121.23138428,30.32680392]]]
     * type : Polygon
     */

    private String type;
    private List<List<List<Double>>> coordinates;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<List<List<Double>>> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<List<List<Double>>> coordinates) {
        this.coordinates = coordinates;
    }
}

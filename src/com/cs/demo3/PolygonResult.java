package com.cs.demo3;

import java.util.List;

/**
 * FileName: PolygonResult
 * Date: 2020/8/7 21:25
 * Author:cs
 * Description: 面积区域的显示
 */
public class PolygonResult {

    /**
     * coordinates : [121.23692036,30.32692194]
     * type : Point
     */

    private String type;
    private List<Double> coordinates;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }
}

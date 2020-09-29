package com.cs.charty;

public class AddressUtils {


    public static String getFilterName(String address) {

        String name = "";
        if (address.equals("内蒙古自治区")) {
            name = "内蒙古";
        } else if (address.equals("广西壮族自治区")) {
            name = "广西";
        } else if (address.equals("西藏自治区")) {
            name = "西藏";
        } else if (address.equals("宁夏回族自治区")) {
            name = "宁夏";
        } else if (address.equals("新疆维吾尔自治区")) {
            name = "新疆";
        } else if (address.equals("香港特别行政区")) {
            name = "香港";
        } else if (address.equals("澳门特别行政区")) {
            name = "澳门";
        } else {
            name = address.substring(0, address.length() - 1);
        }
        return name;
    }

    public static void main(String[] args) {
        System.out.println(getFilterName("杭州市"));
    }


}

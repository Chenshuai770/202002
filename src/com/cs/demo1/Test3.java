package com.cs.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        String path="<a href=\"https://s.etx365.cn/picture/202002/dc70e778ed6b90b1f20e0384ae566bb8.jpg\" target=\"_blank\"><img width=\"320\" style=\"height:360\" src=\"https://s.etx365.cn/picture/202002/thumbs/dc70e778ed6b90b1f20e0384ae566bb8.jpg\"/></ a>";

        String[] split = path.split("\\\"");
        List<String > mList=new ArrayList<>();
        for (String s : split) {
            if (s.contains("http")) {
                mList.add(s);
            }
        }

        System.out.println(Arrays.toString(split));
        System.out.println(mList);

    }
}

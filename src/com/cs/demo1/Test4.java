package com.cs.demo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test4 {
    public static void main(String[] args) {
        String str1="<a href=\"https://s.etx365.cn/picture/202002/dc70e778ed6b90b1f20e0384ae566bb8.jpg\" target=\"_blank\"><img width=\"320\" style=\"height:360\" src=\"https://s.etx365.cn/picture/202002/thumbs/dc70e778ed6b90b1f20e0384ae566bb8.jpg\"/></ a>";

        Pattern pattern = Pattern.compile("https://s.etx365.cn/picture/[0-9]+/[A-Z a-z 0-9 /]+\\.jpg");
        //System.out.println(pattern);

        String href = null;

        Matcher matcher = pattern.matcher(str1);

        if (matcher.find()) {
            href = matcher.group(1);
        }

        System.out.println(href);

    }
}

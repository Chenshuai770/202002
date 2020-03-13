package com.cs.demo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

    public static void main(String args[]) {
        String str = "<a href=\"https://s.etx365.cn/picture/202002/dc70e778ed6b90b1f20e0384ae566bb8.jpg\" target=\"_blank\"><img width=\"320\" style=\"height:360\" src=\"https://s.etx365.cn/picture/202002/thumbs/dc70e778ed6b90b1f20e0384ae566bb8.jpg\"/></ a>";

        String pattern = "https://s.etx365.cn/picture/[0-9]+/[A-Z a-z 0-9 /]+\\.jpg";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        System.out.println(m.matches());
    }

}

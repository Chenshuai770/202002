package 廖雪峰_java.加密和安全.编码算法;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * FileName: Main
 * Date: 2020/10/23 14:13
 * Author:cs
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        String url = "https://www.baidu.com/s?wd=%E4%B8%AD%E6%96%87";
        String encoded = URLEncoder.encode("中文 !");
        System.out.println(encoded);
        String decode = URLDecoder.decode(encoded);
        System.out.println(decode);
        System.out.println(URLDecoder.decode(url));


    }
}

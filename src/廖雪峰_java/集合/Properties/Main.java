package 廖雪峰_java.集合.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * FileName: Main
 * Date: 2020/10/22 14:42
 * Author:cs
 * Description:
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "gradle-wrapper.properties";
        Properties properties = new Properties();
        properties.load(new FileInputStream(filePath));
        String distributionUrl = properties.getProperty("distributionUrl");
        System.out.println(distributionUrl);
        properties.setProperty("key", "value");
        properties.store(new FileOutputStream(filePath),"Chinese can't be used here temporarily, unless the SDK is updated to 9 or above");

    }
}

package e_java.chapter8.item52.overriding;

/**
 * FileName: SparklingWine
 * Date: 2020/10/17 10:00
 * Author:cs
 * Description:起泡酒
 */
public class SparklingWine extends Wine{
    @Override
    String name() {
        return "SparklingWine";
    }
}

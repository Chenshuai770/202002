package 廖雪峰_java.stream.使用reduce;

import java.util.*;

/**
 * FileName: Main
 * Date: 2020/11/24 10:56
 * Author:cs
 * Description: reduce的详细使用
 */
public class Main {
    public static void main(String[] args) {
        List<String> props = new ArrayList<>();
        props.add("profile=native");
        props.add("debug=true");
        props.add("logging=warn");
        props.add("interval=500");

        Map<String, String> map = props.stream()
                // 把k=v转换为Map[k]=v:
                .map(kv -> {
                    String[] ss = kv.split("\\=", 2);
                    return Collections.singletonMap(ss[0], ss[1]);
                })
                .reduce(new HashMap<String, String>(), (m, kv) -> {
                    m.putAll(kv);
                    return m;
                });
        map.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });

    }
}

package alibaba.easy_coding.demo6;

import java.util.Comparator;

/**
 * Created by pc on 2020/11/8 22:21
 * Description: JavaStudy
 */
public class C6P174_SearchResultComparator implements Comparator<C6P173_SearchResult> {
    int relativeRatio;
    long count;
    int recentOrders;
    
   

    @Override
    public int compare(C6P173_SearchResult o1, C6P173_SearchResult o2) {


        //先比较相关度 (避免if-else 嵌套过多使用卫语句来实现)
        if (o1.relativeRatio!=o2.relativeRatio) {
            return o1.relativeRatio > o2.relativeRatio ? 1 : -1;
        }
        //比较订单数
        if (o1.recentOrders!=o2.recentOrders){
            return o1.recentOrders > o2.recentOrders ? 1 : -1;
        }

        //相关度相等比较浏览数

        if (o1.count!=o2.count) {
            return o1.count > o2.count ? 1 : -1;
        }

        return 0;

    }
}

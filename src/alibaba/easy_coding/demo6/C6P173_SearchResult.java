package alibaba.easy_coding.demo6;

/**
 * Created by pc on 2020/11/8 22:14
 * Description: JavaStudy
 */
public class C6P173_SearchResult implements Comparable<C6P173_SearchResult>{
    int relativeRatio;
    long count;
    int recentOrders;

    public C6P173_SearchResult(int relativeRatio, long count) {
        this.relativeRatio = relativeRatio;
        this.count = count;
    }

    @Override
    public int compareTo(C6P173_SearchResult o) {
        //先比较相关度
        if (this.relativeRatio!=o.relativeRatio) {
            return this.relativeRatio > o.relativeRatio ? 1 : -1;
        }

        //相关度相等比较浏览数

        if (this.count!=o.count) {
            return this.count > o.count ? 1 : -1;
        }

        return 0;

    }

    public void setRecentOrders(int recentOrders) {
        this.recentOrders = recentOrders;
    }
}

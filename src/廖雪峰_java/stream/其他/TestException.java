package 廖雪峰_java.stream.其他;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: Main
 * Date: 2020/11/24 11:35
 * Author:cs
 * Description:
 */
public class TestException {
    public static void main(String[] args) {
        List<Integer> mList = new ArrayList<>();
        mList.add(1);
        mList.add(2);
        mList.add(3);

        System.out.println(mList.get(5));//如果不加异常处理,那么程序到这里就执行不下去了,你可以试着把下面的注释去掉,并且把这行注释掉看看结果

        /*try {
            System.out.println(mList.get(3));//如果捕获了异常,那么程序还是可以处理下去的
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }*/

        System.out.println("如果没有异常发生,那么这行代码也就打印失败了,如果异常被捕获了,那么这行代码是可以执行到的");

    }
}

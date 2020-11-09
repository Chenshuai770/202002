package alibaba.easy_coding.demo6;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by pc on 2020/11/8 22:51
 * Description: JavaStudy
 */
public class C6179_ListEquals {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);

        if (arrayList.equals(linkedList)) {
            System.out.println("equals is true");
        }else {
            System.out.println("equals is false");

        }
    }
}

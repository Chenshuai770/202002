package e_java;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Dimension dimension = new Dimension();

    }

    public static Set union(Set set1,Set set2){
        Set result = new HashSet(set1);
        result.addAll(set2);
      
        return result;
    }
}

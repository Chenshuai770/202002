package com.cs.down;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D1 {
    public static void main(String[] args) {
        double x = 0.1;
        double y = 0.2;
        double z = 0.3;
        // 计算 svm
        double svm = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));//25

        // 计算数学期望


        double[] arr = {9.79207,
                9.986417,
                11.550121,
                9.28703,
                9.116537,
                10.040255,
                9.38607,
                9.865576,
                10.774205,
                9.266009,
                10.673595,
                8.690077,
                9.710618,
                11.024709,
                8.320084,
                9.336546,
                10.692853,
                7.214993,
                5.784318,
                8.211754,
                25.661771,
                8.611175,
                7.177289,
                13.828784,
                9.381647,
                10.710132,
                8.360952,
                10.151084,
                10.727608,
                10.003011,
                8.89073,
                10.5086,
                9.407831,
                10.4427,
                9.748923,
                9.713312};


        int count = arr.length;

        double sum_svm = 0; // 所有svm的和
        for (int i = 0; i < count; i++) {
            sum_svm += arr[i];
        }
        double e_svm = sum_svm / count;//平均值

        // 计算方差
        double sum_esvm = 0; // 所有svm期望的平方和
        for (int i = 0; i < count; i++) {
            sum_esvm += Math.pow((arr[i] - e_svm), 2);
        }
        double d_svm = sum_esvm / count; // 这就是方差
        System.out.println(d_svm);
        List<Double> mDoubleList = new ArrayList<>();
        for (double v : arr) {
            mDoubleList.add(v);
        }
        System.out.println(SenorUtils.getVariance(mDoubleList));

    }
}

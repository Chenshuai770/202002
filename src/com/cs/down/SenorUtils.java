package com.cs.down;

import java.util.List;

/**
 * FileName: SenorUtils
 * Date: 2020/8/4 15:22
 * Author:cs
 * Description: 监测跌倒数据的算法
 */
public class SenorUtils {
    public static double  getVariance(List<Double> mList){
        int count = mList.size();

        double sum_svm = 0; // 所有svm的和
        for (int i = 0; i < count; i++) {
            sum_svm += mList.get(i);
        }
        double e_svm = sum_svm / count;//平均值
        // 计算方差
        double sum_esvm = 0; // 所有svm期望的平方和
        for (int i = 0; i < count; i++) {
            sum_esvm += Math.pow((mList.get(i) - e_svm), 2);
        }
        double d_svm = sum_esvm / count; // 这就是方差
        return d_svm;
    }
}

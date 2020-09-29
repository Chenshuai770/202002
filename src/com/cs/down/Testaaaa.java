package com.cs.down;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年08月03日 1:13 下午
 */
public class Testaaaa {
    public static void main(String[] args) {

        double x = 0.1;
        double y = 0.2;
        double z = 0.3;
        // 计算 svm
        double svm = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));//25

        // 计算数学期望
        double[] arr = {0.2, 0.3, 0.4, 0.5};
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


        /*
        先获取 加速度传感器的三维数据计算出的 合加速度 a_svm 以及陀螺仪的三维数据计算出的 合角速度 g_svm。
        如果 这两个数值同时达到 设定的阈值，
        if（a_svm >= 合加速度阈值）&& (g_svm >= 合角速度阈值)
        {
            再获取合加速度的方差 d_svm
            再判断方差是否达到设定的阈值
            if (d_svm >= 合加速度方差阈值)
            {
                // 跌到了
            }
        }
        */

    }
}

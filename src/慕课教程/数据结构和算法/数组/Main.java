package 慕课教程.数据结构和算法.数组;

/**
 * FileName: Main
 * Date: 2020/11/2 10:06
 * Author:cs
 * Description:数组（Array）是一种简单的复合数据类型，它是一组有序数据的集合。数组根据维度可以分为一维数组、二维数组和多维数组。
 * 一致性：数组中的每个元素都具有相同的数据类型，我们生活中一般也只会在鸡蛋盒中放置鸡蛋而不会掺杂草莓；
 * 有序性：数组中的元素是有序的，并且可以用唯一下标来访问；鸡蛋盒也是有序的，甚至我们也可以对鸡蛋盒中的格子编号来明确快速地指出是哪一个格子的鸡蛋有裂纹；
 * 不可变性：数组在初始化的时候长度一旦确定，就不可以再变更；而鸡蛋盒子一旦需要变更容量，我们就只能买一个新的盒子了。
 */
public class Main {
    public static void main(String[] args) {
        int [] array = new int[]{};
        System.out.println(array.length);
        array[0] = 1;
    }
}

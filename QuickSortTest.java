package cn.wolfcode.Test02;

import java.util.Arrays;

public class QuickSortTest {
    //创建一个方法进行快速排序

    /**
     * 方法入参 int[] arr , int low ,int height
     */
    public static void QuickSort(int[] arr, int low, int height) {
        //定义参数 承接最低点和最高点
        int i, j, temp, t;
        i = low;
        j = height;
        if (low > height) {
            return;
        }
        //选择基准位
        temp = arr[low];
        //重复指针移动的过程
        while (i < j) {
            //右侧指针
            while (temp < arr[j] && i < j) {
                j--;
            }

            //左侧指针
            while (temp >= arr[i] && i < j) {
                i++;
            }
            //如果满足条件 进行互换
            if (i < j) {
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        //交换基准位
        arr[low] = arr[i];
        arr[i] = temp;

        //左半侧 快速排序
        QuickSort(arr, low, j - 1);

        //右半侧 快速排序
        QuickSort(arr, j + 1, height);
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 23, 89, 34, 56, 78, 19, 3};
        QuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

}

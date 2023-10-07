package com.example.demo;

/**
 * @Date: create in 17:19 2023/9/26
 * @describe:
 */
public class shellSort {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 2, 1, 6, 7, 8, 9, 3, 5, 10};
        nums = shellSort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static int[] shellSort(int[] arr) {
        int n = arr.length;

        // 计算增量（间隔）序列
        int gap = 1;
        while (gap < n / 3) {
            gap = gap * 3 + 1;
        }

        while (gap > 0) {
            // 对每个间隔进行插入排序
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] > temp) {
                    // 向右移动元素，直到找到合适的插入位置
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                arr[j] = temp;
            }

            // 缩小间隔
            gap /= 3;
        }
        return arr;
    }
}

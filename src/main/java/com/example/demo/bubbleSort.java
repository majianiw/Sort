package com.example.demo;

/**
 * @Date: create in 9:03 2023/9/26
 * @describe:
 */
public class bubbleSort {
    //冒泡排序算法
    public static void main(String[] args) {
        int[] nums = new int[]{4, 2, 1, 6, 7, 8, 9, 3, 5, 10};
        nums = bs(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static int[] bs(int[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j< arr.length - 1 - i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}

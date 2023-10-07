package com.example.demo;

/**
 * @Date: create in 10:33 2023/9/27
 * @describe:
 */
public class selectionSort {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 2, 1, 6, 7, 8, 9, 3, 5, 10};
        nums = selection(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static int[] selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }
            swap(arr,index,i);
        }
        return arr;
    }
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

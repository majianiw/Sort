package com.example.demo;

/**
 * @Date: create in 12:20 2023/9/25
 * @describe:
 */
public class quickSort {
    //快速排序算法
    public static void main(String[] args) {
        int[] nums = new int[]{4, 2, 1, 6, 7, 8, 9, 3, 5, 10};
        nums = qs(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }


    public static int[] qs(int[] arr, int left, int right) {
        if (left > right) return null;
        int l = left, r = right;
        int temp = arr[left];
        while (left < right) {
            while(left < right && arr[right] >= temp){
                right--;
            }
            arr[left] = arr[right];
            while(left < right && arr[left] <= temp){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = temp;
        qs(arr,l,right-1);
        qs(arr,right+1,r);
        return arr;
    }
}

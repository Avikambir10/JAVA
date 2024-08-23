package BLIND75;
//leetcode 153 Find Minimum in Rotated Sorted Array
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

import java.util.Scanner;

public class Min_in_Rotated_Sorted_Array {
    private static int func(int[] nums, int n) {
        if (n == 0) return -1;
        if (n == 1) return nums[0];
        int a = 0;
        int b = n - 1;
        while (a < b) {
            int mid = a + (b - a) / 2;
            if (nums[mid] < nums[mid - 1] && mid > 0) {
                return nums[mid];
            } else if (nums[a] <= nums[mid] && nums[b] < nums[mid]) {
                a = mid + 1;
            } else {
                b = mid - 1;
            }
        }
        return nums[a];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = func(arr, n);
        sc.close();
        System.out.println(min);
    }
}

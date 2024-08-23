package BLIND75;

import java.util.Scanner;
//binary search
//leetcode 33
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class search_rotated_Sorted_array {
    public static  int func(int [] nums ,int n,int target){
        if(n==0 || nums == null)
            return  -1;
        int left = 0;
        int right = n-1;
        while (left < right) {
            int mid = left + (right - left) /2;
            if(nums[mid] > nums[right]){
                left =  mid+1;
            }
            else {
                right = mid;
            }
        }
        int start = left;
        left = 0;
        right= n-1;

        if(target >= nums[start] &&  target<= nums[right]){
            left= start;
        }
        else{
            right = start;
        }
        while (left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid +1;
            }
            else{
                right = mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] arr =  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc2.nextInt();
        }
        int target = sc2.nextInt();
        int ans = func(arr,n,target);
        sc2.close();
        System.out.println(ans);
    }
}

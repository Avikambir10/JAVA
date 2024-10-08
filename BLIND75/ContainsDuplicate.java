package BLIND75;

import java.util.HashSet;
import java.util.Scanner;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: true
//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: false
//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true
public class ContainsDuplicate {
    public static boolean func(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int it : nums) {
            if (set.contains(it)) {
                return true;
            }
            set.add(it);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        boolean res = func(arr);
        System.out.println(res);
    }
}

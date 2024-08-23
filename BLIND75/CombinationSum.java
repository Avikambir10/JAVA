package BLIND75;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//https://leetcode.com/problems/combination-sum/description/
public class CombinationSum {
    public static void backtrack(int index, int[] arr, List<List<Integer>> ans, List<Integer> cur, int target) {
        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(cur));
            }
            return ;
        }
        if(arr[index] <= target){
            cur.add(arr[index]);
            backtrack(index,arr,ans,cur,target - arr[index]);
            cur.removeLast();
        }
        backtrack(index+1, arr, ans, cur, target);
    }

    public static List<List<Integer>> combination_sum(int[] arr, int t) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backtrack(0, arr, ans, cur, t);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        sc.close();
        List<List<Integer>> result = combination_sum(arr, t);
        System.out.println(result);
    }
}

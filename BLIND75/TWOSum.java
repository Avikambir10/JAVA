package BLIND75;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TWOSum {
    public int[] func(int[] nums, int target){
        Map<Integer,Integer> num_map= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if(num_map.containsKey(nums[i])){
                return new int[] {num_map.get(nums[i]),i};
            }else {
                num_map.put(comp,i);
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        sc.close();

        TWOSum obj = new TWOSum();

        int[] res = obj.func(arr,target);
        if(res.length == 2){
            System.out.println("[" + res[0]+ "," + res[1]+ "]");
        }else{
            System.out.println("No solution");
        }
    }
}

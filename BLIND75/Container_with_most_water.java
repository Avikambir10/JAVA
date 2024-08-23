package BLIND75;

import java.util.Scanner;
//9
//1 8 6 2 5 4 8 3 7
//two pointer approach
//https://leetcode.com/problems/container-with-most-water/description/?envType=study-plan-v2&envId=leetcode-75
public class Container_with_most_water
{
    public static int most_water(int[] height){
        int a_pointer = 0;
        int b_pointer = height.length - 1;
        int max_area = 0;
        while(a_pointer < b_pointer){
            if(height[a_pointer] < height[b_pointer]){
                max_area = Math.max(max_area,height[a_pointer] * (b_pointer - a_pointer));
                a_pointer += 1;
            }
            else {
                max_area = Math.max(max_area,height[b_pointer] * (b_pointer - a_pointer));
                b_pointer -= 1;
            }
        }
        return max_area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans = most_water(arr);
        System.out.println(ans);
    }
}

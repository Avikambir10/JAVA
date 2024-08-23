package ClassWork;

import java.util.Scanner;
//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//Output: 6
//Input: height = [4,2,0,3,2,5]
//Output: 9
//6
//4 2 0 3 2 5
// 9
public class Trapping_RainWater {
    public static int water_trapped(int[] height){
        int n = height.length;
        int max_area = 0, max_left = 0, max_right= 0;
        int a_pointer = 0;
        int b_pointer = n-1;
        while(a_pointer < b_pointer){
            if(height[a_pointer] <= height[b_pointer]){
                max_left = Math.max(max_left,height[a_pointer]);
                max_area += max_left - height[a_pointer];
                a_pointer++;
            }
            else {
                max_right = Math.max(max_right, height[b_pointer]);
                max_area += max_right - height[b_pointer];
                b_pointer--;
            }
        }
        return max_area;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans = water_trapped(arr);
        System.out.println(ans);
    }
}

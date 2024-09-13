package ClassWork;
//Final Array State After K Multiplication Operations I

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/description/
//easy
public class leetcode3624 {
    public static int[] getFinalState(int[] arr, int k ,int multiplier){
        int minIndex = 0;
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            arr[minIndex] *= multiplier;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k =sc.nextInt();
        int m= sc.nextInt();
        int[] res = getFinalState(arr,k,m);
        System.out.println(Arrays.toString(res));
    }
}

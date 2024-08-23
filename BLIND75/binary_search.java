package BLIND75;

import java.util.Scanner;

public class binary_search {
    public static int bs(int [] arr ,int n ,int target){
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target ) {
                left = mid +1;
            }
            else {
                right = mid-1;
            }
        }
        return  -1;
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int index = bs(arr,n,t);
        sc.close();
        System.out.println("Index at : " + t + " is : " + index);
    }
}

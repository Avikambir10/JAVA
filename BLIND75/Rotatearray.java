package BLIND75;

import java.util.Scanner;
class Solution {
    public void rotate(int[] arr ,int k){
        k = k% arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }
    private void reverse(int[] arr,int l,int r){
        while(l<r) {
            swap(arr, l++, r--);
        }
    }
    private void  swap(int [] arr,int l,int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K: ");
        int k = sc.nextInt();

        Solution obj = new Solution();
        obj.rotate(arr,k);
        for(int nums : arr){
            System.out.print( nums + " ");
        }
        sc.close();
    }
}

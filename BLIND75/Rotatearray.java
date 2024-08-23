package BLIND75;

import java.util.Scanner;

public class Rotatearray {
    public static void rotate(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    private static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            swap(arr, l++, r--);
        }
    }

    private static void swap(int[] arr, int l, int r) {
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
        System.out.println("Enter K: ");  // This should be before taking the input for k
        int k = sc.nextInt();

        Rotatearray obj = new Rotatearray();  // Corrected class name
        obj.rotate(arr, k);
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        sc.close();
    }
}

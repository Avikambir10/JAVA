package BLIND75;

import java.util.Scanner;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
//leetcode 121
public class StockBuy_Sell {
    private static int func(int[] prices) {
        int min_value = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min_value) {
                min_value = prices[i];
            } else if (max_profit < prices[i] - min_value) {
                max_profit = prices[i] - min_value;
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc1.nextInt();
        }
        int ans = func(arr);
        sc1.close();
        System.out.println(ans);
    }
}

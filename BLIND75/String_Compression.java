package BLIND75;

import java.util.Scanner;
//https://leetcode.com/problems/string-compression/description/?envType=study-plan-v2&envId=leetcode-75
public class String_Compression {
    public static int compressed(char[] chars) {
        // Initialize a counter to track the frequency of characters
        int cnt = 1;

        // StringBuilder to build the compressed string
        StringBuilder sb = new StringBuilder();

        // Append the first character to the StringBuilder
        sb.append(chars[0]);

        // Loop through the array starting from the second character
        for (int i = 1; i < chars.length; i++) {
            // If the current character is the same as the previous one, increment the counter
            if (chars[i] == chars[i - 1]) {
                cnt++;
            } else {
                // If the counter is greater than 1, append the count to the StringBuilder
                if (cnt > 1) {
                    sb.append(cnt);
                }
                // Append the current character to the StringBuilder
                sb.append(chars[i]);
                // Reset the counter for the new character
                cnt = 1;
            }
        }

        // After the loop, if the last character sequence had more than 1 character, append its count
        if (cnt > 1) {
            sb.append(cnt);
        }

        // Copy the compressed string back to the original array
        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        // Return the length of the compressed string
        return sb.length();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] chars = new char[n];
        for (int i = 0; i < n; i++) {
            chars[i] = sc.next().charAt(0);
        }
        sc.close();
        int length = compressed(chars);
        for (int i = 0; i < length; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}

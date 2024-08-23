package BLIND75;
//Reverse vowels of a string

//Example 1:
//Input: s = "hello"
//Output: "holle"

//Example 2:
//Input: s = "leetcode"
//Output: "leotcede"
// https://leetcode.com/problems/reverse-vowels-of-a-string/description/

import java.util.Scanner;

public class Reverse_vowels {

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }

    public static String function(String str) {
        int n = str.length();
        char ch[] = str.toCharArray();
        int start = 0;
        int end = n - 1;
        while (start < end) {
            if (!isVowel(ch[start])) {
                start++;
            }else if (!isVowel(ch[end])) {
                end--;
            }
            else{
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;end--;
            }
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = function(str);
        sc.close();
        System.out.println(ans);
    }

}

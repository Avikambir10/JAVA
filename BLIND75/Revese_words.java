package BLIND75;

import java.util.Scanner;
// https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75
public class Revese_words {
    public static String fun(String str){
        String[] words = str.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length -1; i >= 0; i--) 
        {
            sb.append(words[i]);
            sb.append(" ");    
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = fun(str);
        sc.close();
        System.out.println(ans);
    }
}
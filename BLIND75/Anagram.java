package BLIND75;
//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
// typically using all the original letters exactly once.
//Example 1:
//
//Input: s = "anagram", t = "nagaram"
//Output: true

//Example 2:
//
//Input: s = "rat", t = "car"
//Output: false

import java.util.Scanner;

public class Anagram {

    public static boolean func(String s,String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] char_count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char_count[s.charAt(i) - 'a']++;
            char_count[t.charAt(i) - 'a']--;

        }
        for (int count : char_count){
            if(count != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s= scanner.nextLine();
        String t = scanner.nextLine();scanner.close();
        boolean res = func(s,t);
        System.out.println(res);
    }
}

package BLIND75;
//https://leetcode.com/problems/longest-palindromic-substring/description/
//Given a string s, return the longest
//palindromic substringn s.
//
//Example 1:
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.

//Example 2:
//input: s = "cbbd"
//Output: "bb"
public class longestPalandromicSubstring {
    public static String expandAroundCenter(String s, int left ,int right){
        while(left>=0 && right < s.length()&& s.charAt(left) == s.charAt(right)){
            left--;right++;
        }
        return s.substring(left+1,right);
    }

    public static String longest(String s){
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String len1 = expandAroundCenter(s,i,i);
            String len2 = expandAroundCenter(s,i,i+1);
            if(len1.length() > res.length()){
                res = len1;
            }
            if(len2.length()>res.length()){
                res = len2;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str1 = "babad";
        String str2 = "cbbd";

        System.out.println(longest(str1));
        System.out.println(longest(str2));
    }
}

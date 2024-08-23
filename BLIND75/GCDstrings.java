package BLIND75;
//https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75
import java.util.Scanner;

//Example 1:
//
//Input: str1 = "ABCABC", str2 = "ABC"
//Output: "ABC"
//Example 2:
//
//Input: str1 = "ABABAB", str2 = "ABAB"
//Output: "AB"

public class GCDstrings {
    public static String gcdofStrings(String str1,String str2){
        if(str2.equals(str1)){
            return str1;
        }
        if(str2.length() > str1.length()){
            return gcdofStrings(str2,str1);
        }
        if (str1.startsWith(str2)){
            return gcdofStrings(str1.substring(str2.length()),str2);
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        String res = gcdofStrings(a,b);
        System.out.println(res);
    }
}

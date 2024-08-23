package BLIND75;
//leetcode 125
import java.util.Scanner;

public class validPalindrome {

    public static Boolean checkPali(String s){
        String str = "";
        for(char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                str += c;
            }
        }
        str = str.toLowerCase();
        int a = 0;
        int b = str.length()-1;
        while(a <= b){
            if(str.charAt(a) != str.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Boolean ans = checkPali(s);
        sc.close();
        System.out.println(ans);
    }
}

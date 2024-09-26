package End_Term;
//Find occurrences of palindrome words in a string
//Write a function which given a string, count and return the palindrome words present in the string. A word in a string is separated with space(s).
//
//Sample Input 1
//
//Mom and Dad are my best friends
//Sample Output 1
//2
//Explanation 1
//This string contains two palindrome words (i.e., Mom, Dad) so the count is 2.
//
// Sample Input 2
//
//mohit speaks english
//Sample Output 2
//0
//Explanation 2
//This string contains no palindrome words
public class StringPalindrome {
    public static boolean isPali(String word){
        int n = word.length();
        int left = 0;
        int right = n -1;
        for (int i = 0; i < n; i++) {
            if(Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(right))){
                return false;
            }
            left++;right--;
        }

        return true;
    }
    public static int countPali(String str){
        String[] words = str.split("\\s+");

        int cnt = 0;
        for(String word:words){
            if(isPali(word)){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String str = "Mom and Dad are my best friends";
        System.out.println(countPali(str));
    }
}

package End_Term;

import java.util.Scanner;

/*Title:  Counting 1’s (bit masking)
Difficulty: - Medium

Problem Statement
In the bustling city of Technoville, there was a team of brilliant software engineers working on a groundbreaking project. They were tasked with developing an innovative algorithm that would analyse the binary representation of numbers.
Their mission was to create a function that could take any integer input, from 0 to n, and return an array. This array would contain counts representing the number of 1's in the binary representation of each integer from 0 to n.
With their laptops humming and minds buzzing with excitement, the team dove into the project, eager to unravel the mysteries of binary digits. Can you join them on their journey and help craft this modern-day algorithm?

Input:
Input Format:-     first line: Integer n
output
Output Format:-  array containing the integers representing the number of 1’s in the binary representation of each integer between 0 to n;
Constraint
0 <= n <= 10^5

Sample Input :
5
Sample Output :  0 1 1 2 1 2  */
public class CountingOnes {
    private static int[] count(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            res[i] = res[i >> 1] + (i & 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = count(n);
        for (int count : ans) {
            System.out.print(count + " ");
        }
    }
}

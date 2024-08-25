package ClassWork;

import java.util.Scanner;

//Java code to find the maximum possible number with a given sum of digits and a specified number of digits:
//Example: sum = 8, numDigits = 2
//maxNumber = "80"
public class find_max_number {
    public static String max_no(int sum , int no_of_digits){
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < no_of_digits; i++) {
            if(sum >= 9){
                sb.append(9);
                sum-=9;
            }else{
                sb.append(sum);
                sum = 0;
            }
        }
        while(sb.length() < no_of_digits){
            sb.append(0);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sum of digits: ");
        int Sum = sc.nextInt();
        System.out.println("Enter no of digits: ");
        int no_of_digits = sc.nextInt();

        String ans = max_no(Sum,no_of_digits);
        System.out.println(ans);
    }
}

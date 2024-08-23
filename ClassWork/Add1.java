package ClassWork;

import java.util.Scanner;

//Add one to each digit of a 4 digit
public class Add1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()){
            int digit = Character.getNumericValue(ch);
            digit = (digit+1)%10;
            sb.append(digit);
        }
        int ans = Integer.parseInt(sb.toString());

        System.out.println(ans);
    }
}

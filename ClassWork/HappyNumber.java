package ClassWork;

import java.util.Scanner;

public class HappyNumber {
    public static boolean function(int n){
        int slow = n;
        int fast = n;
        slow = square(slow);
        fast = square(square(fast));
        while(slow != fast){
            slow = square(slow);
            fast = square(square(fast));
        }
        return slow == 1;

    }
    public static int square(int num){
        int ans = 0;
        while (num > 0){
            int remainder = num %10;
            ans += remainder * remainder;
            num = num / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean res = function(n);
        System.out.println(res);
    }
}

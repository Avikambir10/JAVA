package ClassWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prime_number {
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if(num %i == 0){
                return false;
            }
        }
        return true;
    }
    public static List<Integer> n_primes(int n){
        List<Integer> primes = new ArrayList<>();
        int num = 2;
        while (primes.size() < n){
            if(isPrime(num)){
                primes.add(num);
            }
            num++;
        }
        return primes;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> primes = n_primes(n);
        System.out.println(primes);
    }
}

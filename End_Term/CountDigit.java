package End_Term;

public class CountDigit {
    public static int countdig(int num) {
        if (num < 0) {
            num = Math.abs(num);
        }
        if (num == 0) {
            return 1;
        }
        int cnt = 0;
        while (num > 0) {
            num /= 10;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int num = 123455;
        System.out.println(countdig(num));
    }
}

package ClassWork;

public class Kaprekar_number
{
    public static boolean iskaprekar(int n){
        if(n==1){
            return true;
        }
        int sq = n * n;
        String str = String.valueOf(sq);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            String leftpart= str.substring(0,i);
            String rightpart= str.substring(i);

            int left = Integer.parseInt(leftpart);
            int right = Integer.parseInt(rightpart);

            if(right != 0 && left + right== n){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int n  = 45;
        if(iskaprekar(n)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

}

import java.util.Scanner;
// import java.util.ArrayList;
public class class12
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();

        int[] arr =  new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i+=2) {
            arr[i] = arr[i]*arr[i];
        }
        sc.close();
        System.out.println("Square of alternate elements is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

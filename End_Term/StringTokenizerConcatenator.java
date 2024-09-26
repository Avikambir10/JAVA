package End_Term;

//Input                     Output
//hello world welcome
//-                         hello-world-welcome
//this is a test
//,                         this, is, a, test
//singleword
//,                         singleword
// tokenize this
// /                        tokenize|this
//another test case
// ->                       another->test->case
//



import java.util.Scanner;
import java.util.Stack;

public class StringTokenizerConcatenator {
    public static  String tokenizeAndConcatenate(String s,String delim){
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            res.append(words[i]);
            if(i< words.length -1){
                res.append(delim);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String delim = scanner.nextLine();
        // Process the input and display the result
        String result = tokenizeAndConcatenate(s, delim);
        System.out.println(result);
        scanner.close();
    }

}

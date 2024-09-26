package End_Term;

import java.util.Stack;

public class SecretMessageDecoder {
    public static String decodeString(String s) {
        int k = 0;
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');

            } else if (ch == '[') {
                countStack.push(k);
                stringStack.push(currentString);
                k = 0;
                currentString = new StringBuilder();
            } else if (ch == ']') {
                int repeattimes = countStack.pop();
                StringBuilder decoded = stringStack.pop();
                for (int i = 0; i < repeattimes; i++) {
                    decoded.append(currentString);
                }
                currentString = decoded;
            }
            else {
                currentString.append(ch);
            }
        }
        return currentString.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[b]")); // Output: aaabb
        System.out.println(decodeString("3[a]2[bc]")); // Output: aaabcbc
        System.out.println(decodeString("3[a2[c]]")); // Output: accaccacc
        System.out.println(decodeString("2[abc]3[cd]ef")); // Output: abcabccdcdcdef
        System.out.println(decodeString("1[a1[c2[d]]]"));
    }
}

import java.util.HashSet;

public class hashsetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Avikam");
        hashSet.add("A");
        hashSet.add("Avi");
        hashSet.add("Avm");
        // it is like set in c++
        //doesnot add two same ele like;-
        hashSet.add("c");
        hashSet.add("c");
        System.out.print(hashSet);
    }
}

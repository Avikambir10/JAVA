import java.util.LinkedList;

public class LinkedlistDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.addFirst("D");
        list.addLast("c");
        list.add(2, "t");
        System.out.print(list);
    }
}

import java.util.TreeSet;

public class TreesetDemo
{
    public static void main(String[] args) {

        //it is like unordered set in c++
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("c");
        treeSet.add("b");
        treeSet.add("d");
//        treeSet.
        //elements will come in sorted order
        System.out.print(treeSet);
    }
}

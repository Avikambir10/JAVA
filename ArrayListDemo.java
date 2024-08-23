import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(5);
        for (int i = 1; i <= 5; i++) {
            arrayList.add(i);
        }

        //Printing elements
        System.out.println(arrayList);

        //Remove elements
        arrayList.remove(3);

        System.out.println(arrayList);
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }

    }
}

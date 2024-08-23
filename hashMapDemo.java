import java.util.HashMap;
import java.util.Map;

public class hashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();
        mp.put("a",10);
        mp.put("v",40);
        mp.put("y",60);
        System.out.println("Size of Map is:-" + mp.size());
        System.out.println(mp);

        if (mp.containsKey("a")){
            Integer a = mp.get("a");
            System.out.println(a);
        }
    }
}

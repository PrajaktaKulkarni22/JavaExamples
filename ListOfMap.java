import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMap {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("A", 11);
        m1.put("B", 20);
        m1.put("C", 30);

        Map<String, Integer> m2 = new HashMap<>();
        m2.put("D", 45);
        m2.put("E", 58);
        m2.put("F", 60);

        Map<String, Integer> m3 = new HashMap<>();
        m3.put("G", 13);
        m3.put("H", 90);
        m3.put("I", 85);

        Map<String, Integer> m4 = new HashMap<>();
        m4.put("J", 83);
        m4.put("K", 44);
        m4.put("L", 39);

        List<Map<String, Integer>> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

      //  System.out.println(list);

        System.out.println("Traditional java");
        /*for (Map<String, Integer> s : list) {
            System.out.println(s);
        }*/

        for(Map<String,Integer> map:list){
            for (Map.Entry<String,Integer> entry:map.entrySet()){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }

        System.out.println("Using java 8");
        list.forEach(a ->
            a.forEach((k, v) -> System.out.println(k+" : "+v))
        );
    }
}
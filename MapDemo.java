import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Object> map=new HashMap<>();
        map.put("abc",1);
        map.put("pqr",2);
        map.put("lmn",3);
        map.put("opr",4);

        for (Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}

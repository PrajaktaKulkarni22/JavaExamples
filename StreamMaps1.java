import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMaps1 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("a","b","c","d");
        List<String> list1=new ArrayList<>();

        //before java 8
        for (String s:list){
            list1.add(s.toUpperCase());
        }

        System.out.println("List:"+list);
        System.out.println("List 1:"+list1);

        //java 8
        List<String> list2=list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(list2);

        List<Integer> list3=Arrays.asList(1,2,3,4,5);
        List<Integer> list4=list3.stream()
                .map(n->n*2)
                .collect(Collectors.toList());

        System.out.println(list4);
    }
}

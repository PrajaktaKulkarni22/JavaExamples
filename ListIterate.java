import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterate {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("While loop using Iterator");
        Iterator itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("For loop");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("Enhanced for loop");
        for (int i:list){
            System.out.println(i);
        }

        System.out.println("Foreach loop");
        list.forEach(a-> System.out.println(a));

        System.out.println("Method reference");
        list.forEach(System.out::println);


    }
}

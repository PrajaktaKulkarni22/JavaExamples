import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original list:"+list);

        List<Integer> list1=new ArrayList<>();
        list1.addAll(list);
        System.out.println("New list:"+list1);

        list1.add(list.get(1));
        System.out.println("Add element:"+list1);

        list1.add(1,70);
        System.out.println("Add at specific index:"+list1);

        list1.remove(list.get(1));
        System.out.println("Remove element:"+list1);

        int in=list1.indexOf(20);
        System.out.println("Index of:"+in);

        list1.removeAll(list);
        System.out.println("Remove all:"+list1);


    }
}

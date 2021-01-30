import java.util.Arrays;
import java.util.List;

public class MethodReference1 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("India","US","France","Japan");
       list.forEach(DemoReference::display);

    }
}

class DemoReference{
    static void display(String str){
        System.out.println(str);
   }
}
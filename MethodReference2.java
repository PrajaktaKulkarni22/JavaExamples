import java.util.Arrays;
import java.util.List;

public class MethodReference2 {
        public static void main(String[] args) {
            List<String> list= Arrays.asList("India","US","France","Japan");
            DemoReference1 dr=new DemoReference1();
            list.forEach(dr::display1);
        }
    }

class DemoReference1{
    void display1(String str){
        System.out.println(str);
    }
}

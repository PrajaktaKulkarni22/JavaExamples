import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExamples {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("abc","xyz","lmn");

        List<String> result=list.stream().filter(list1->!"abc".equals(list1)).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}

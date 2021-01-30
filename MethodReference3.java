import java.util.Arrays;

public class MethodReference3 {
    public static void main(String[] args) {
        String[] strArr={"India","US","France","Germany"};
        Arrays.sort(strArr,String::compareTo);

        for (int i=0;i< strArr.length;i++){
            System.out.println(strArr[i]);
        }
    }
}

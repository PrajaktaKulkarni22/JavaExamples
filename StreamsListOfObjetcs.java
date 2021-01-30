import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsListOfObjetcs {
    public static void main(String[] args) {
        List<Staff> list= Arrays.asList(
                new Staff("abc",50,new BigDecimal(10000)),
                new Staff("pqr",25,new BigDecimal(80000)),
                new Staff("xyz",30,new BigDecimal(25000))

        );

        //before java 8
        List<String> result=new ArrayList<>();
        for (Staff x:list){
            result.add(x.getName());
        }
        System.out.println(result);

        //java 8
        List<String> collect=list.stream()
                .map(x->x.getName())
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}

class Staff{
    private String name;
    private int age;
    private BigDecimal sal;

    public Staff(String name,int age,BigDecimal sal){
        this.name=name;
        this.age=age;
        this.sal=sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                '}';
    }
}

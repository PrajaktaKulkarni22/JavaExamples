import java.util.Arrays;
import java.util.List;

public class StreamsMultCondition {
    public static void main(String[] args) {
        List<Person1> persons1= Arrays.asList(
                new Person1("abc",50),
                new Person1("xyz",20),
                new Person1("lmn",25)
        );

        Person1 result=persons1.stream()
                .filter(p->"abc".equals(p.getName()) && 50 == p.getAge())
                .findAny()
                .orElse(null);

        System.out.println(result);

        // second method

        Person1 result2=persons1.stream()
                .filter(p->{
                    if("abc".equals(p.getName()) && 50== p.getAge()){
                        return true;
                    }
                    return false;
                }).findAny()
                .orElse(null);

        System.out.println(result2);

    }
}
class Person1{
    private String name;
    private int age;

    public Person1(String name, int age){
        this.name=name;
        this.age=age;
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

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
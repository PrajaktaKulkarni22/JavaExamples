import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMap {
    public static void main(String[] args) {
        List<Person2> persons2= Arrays.asList(
                new Person2("abc",50),
                new Person2("xyz",20),
                new Person2("lmn",15)
        );

        String name=persons2.stream()
                .filter(p->"abc".equals(p.getName()))
                .map(Person2::getName)
                .findAny()
                .orElse("");

        System.out.println(name);

        List<String> collect=persons2.stream()
                .map(Person2::getName)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }

}
class Person2{
    private String name;
    private int age;

    public Person2(String name, int age){
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
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

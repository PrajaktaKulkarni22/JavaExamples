import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {
    public static void main(String[] args) {
        List<Person> persons= Arrays.asList(
                new Person("abc",50),
                new Person("xyz",20),
                new Person("lmn",25)
        );

        Person result=persons.stream()
                .filter(p->"xyz".equals(p.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result);

        Person result1=persons.stream()
                .filter(x->"hfkff".equals(x.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result1);
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

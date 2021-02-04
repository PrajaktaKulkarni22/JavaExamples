import java.util.ArrayList;
import java.util.List;

public class ListOfObjsortjava8 {
    public static void main(String[] args) {
        List<Student2>list=new ArrayList<Student2>();
        list.add(new Student2(10,"a","Pune",15));
        list.add(new Student2(11,"b","Mumbai",10));
        list.add(new Student2(12,"c","Nashik",25));
        list.add(new Student2(13,"d","Kolhapur",20));

        System.out.println("Before sorting:"+list);

        list.sort((Student2 s,Student2 ss)->
                s.getAge()-ss.getAge());

        System.out.println("After sorting:"+list);
    }
}

class Student2{
    private int id;
    private String name;
    private String city;
    private int age;

    public Student2(int id, String name, String city, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}

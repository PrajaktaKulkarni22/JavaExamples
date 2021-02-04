import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOfObjComparator {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<Student>();
        list.add(new Student(10,"abc","Pune",25));
        list.add(new Student(14,"pqr","Mumbai",15));
        list.add(new Student(11,"lmn","Delhi",10));
        list.add(new Student(15,"xyz","Nashik",12));
        list.add(new Student(20,"ijt","Thane",17));

        System.out.println("Before sorting:"+list);

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        System.out.println("After sorting:"+list);
    }
}

class Student{
    private int id;
    private String name;
    private String city;
    private int age;

    public Student(int id, String name, String city, int age) {
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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}

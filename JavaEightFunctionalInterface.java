import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class JavaEightFunctionalInterface {
    public static void main(String[] args) {
       //Function Interface
        Function<String,Integer>f=str->str.length();
        Integer length=f.apply("Prajakta");
        System.out.println("Length is:"+length);

        //BiFunction Interface
        BiFunction<Integer,Integer,Integer>f1=(a,b)->a+b;
        Integer total=f1.apply(40,50);
        System.out.println("Total is:"+total);

        //Function Chaining
        Function<String,Integer> f2=str->str.length();
        Function<Integer,Integer> f3=val->val*10;
        Integer result=f2.andThen(f3).apply("abc");
        System.out.println("Result is:"+result);

        //BinaryOperator
        BinaryOperator<Integer> f4=(x,y)->x+y;
        Integer biop=f4.apply(60,70);
        System.out.println("Value is:"+biop);

        //UnaryOperator
        UnaryOperator<Integer> f5=value->value+10;
        Integer i=f5.apply(50);
        System.out.println("Unary Operator:"+i);

        //Predicate Interface
        List<Integer> list= Arrays.asList(10,5,15,20,25,30);
        Predicate<Integer> p=x->x>10;
        List <Integer> newList=list.stream().filter(p).collect(Collectors.toList());
        System.out.println("New List:"+newList);

        //BiPredicate Interface
        BiPredicate<String,Integer> bp=(str,val)->{
            return str.length()==val;
        };
        boolean flag=bp.test("Pune",4);
        System.out.println("Flag:"+flag);

        //Consumer Interface
        Consumer<Integer> c=val-> System.out.println(val);
        c.accept(10);

        //BiConsumer Interface
        BiConsumer<Integer,Integer> c1=(a,b)-> System.out.println(a+b);
        c1.accept(30,40);

        //Method reference
        List<Integer> l1=Arrays.asList(5,10,15,20,25,30);
        l1.forEach(System.out::println);

        List<String> values=Arrays.asList("b","a","d","c","e");
        List<String> newValues=values.stream().map(s->s.toUpperCase()).sorted().collect(Collectors.toList());
        System.out.println("New values are:"+newValues);

        Student1 s1=new Student1("A","Pune");
        Student1 s2=new Student1("B","Pune");

        List<Student1> stulist=new ArrayList<>();
        stulist.add(s1);
        stulist.add(s2);

        List<String> names=stulist
                .stream()
                .map(stud->stud.getName())
                .collect(Collectors.toList());

        System.out.println("Names:"+names);

    }
}

class Student1{
   private String name;
   private String city;

    public Student1(String name, String city) {
        this.name = name;
        this.city = city;
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
}

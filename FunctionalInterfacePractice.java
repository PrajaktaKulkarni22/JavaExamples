import java.util.function.*;

public class FunctionalInterfacePractice {
    public static void main(String[] args) {

        Function<Integer, Integer> f = val -> val * 10;
        int result = f.apply(10);
        System.out.println("Result is:"+result);

        Function<String,String> f1=str->str.toUpperCase();
        String result3=f1.apply("praju");
        System.out.println(result3);

        BiFunction<Integer,Integer,Integer> bifun1=(a,b)->(a+b);
        bifun1=bifun1.andThen(a->2 * a);
        int result1=bifun1.apply(2,3);
        System.out.println("Add result:"+result1);

        BiFunction<Integer,Integer,Integer> bifun2=(a,b)->(a*b);
        bifun2=bifun1.andThen(a->a*4);
        int result2=bifun2.apply(2,3);
        System.out.println("Multiplication result:"+result2);

        BinaryOperator<Integer> biop=BinaryOperator.maxBy((a,b)->(a>b)?1:(a==b)?0:-1);
        int greater=biop.apply(10,20);
        System.out.println("Greater num is:"+greater);

        UnaryOperator<Integer> unop=val->val+5;
        int value=unop.apply(10);
        System.out.println("Value is:"+value);

        Predicate<Integer> p=i->i<18;
        System.out.println(p.test(20));

        BiPredicate<String,String> bipr=(str1,str2)->{
            return str1.equals(str2);
        };

        boolean flag=bipr.test("Pune","Punee");
        System.out.println("Flag:"+flag);

        Consumer<String> con=str-> System.out.println(str);
        con.accept("Prajakta");

        Consumer<Integer> con1=val-> System.out.println(val*10);
        con1.accept(2);

        BiConsumer<Integer,Integer> bic=(a,b)-> System.out.println(a*b);
        bic.accept(10,5);

        Supplier<Double> sup=()->Math.random();
        System.out.println(sup.get());

    }
}

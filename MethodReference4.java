interface MyInterface3{
    void display(String str);
}

class Hello1{
    public Hello1(String str){
        System.out.println(str);
    }
}

public class MethodReference4 {
    public static void main(String[] args) {
        MyInterface3 ref=Hello1::new;
        ref.display("Helloooo");
    }
}

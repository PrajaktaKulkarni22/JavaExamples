interface hello{
    void print();
}
public class InterfaceDemo {
    public void print(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
       InterfaceDemo id=new InterfaceDemo();
        id.print();
    }
}

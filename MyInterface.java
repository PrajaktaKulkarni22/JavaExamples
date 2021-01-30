public interface MyInterface {
    void withdraw();
    void deposit();
}

interface MyInterface1{
    void display();
}

interface MyInterface2 extends MyInterface,MyInterface1{
    void display1();
}

class MyDemo{
    void check(){
        System.out.println("In check method");
    }
}
class Sbi extends MyDemo implements MyInterface,MyInterface1,MyInterface2{

    @Override
    public void withdraw() {
        System.out.println("In withdraw");
    }

    @Override
    public void deposit() {
        System.out.println("In deposit");
    }

    @Override
    public void display() {
        System.out.println("In display");
    }

    @Override
    public void display1() {
        System.out.println("In display1");
    }
    public static void main(String[] args) {
        Sbi s=new Sbi();
        s.deposit();
        s.withdraw();
        s.display();
        s.display1();
    }
}



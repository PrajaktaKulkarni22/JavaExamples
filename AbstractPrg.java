public abstract class AbstractPrg {
    abstract void getData();

    public void display(){
        System.out.println("In display method");
    }
}

abstract class AbstractPrg1 extends AbstractPrg{
    abstract void display1();
}

class ImplAbstract extends AbstractPrg1{

    @Override
    void getData() {
        System.out.println("In getData");
    }

    void checkData(){
        System.out.println("In checkdata");
    }

    @Override
    void display1() {
        System.out.println("In display1");
    }

    public static void main(String[] args) {
        ImplAbstract impl=new ImplAbstract();
        impl.display();
        impl.getData();
        impl.checkData();
        impl.display1();

        AbstractPrg ap=new ImplAbstract();
        ap.display();
        ap.getData();
        System.out.println("checkdata and display1 cannot be accessed from parent class");

        AbstractPrg1 ap1=new ImplAbstract();
        ap1.display1();
        ap1.display();
        ap1.getData();
    }


}

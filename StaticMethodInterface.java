public interface StaticMethodInterface {
    void absmethod();

    static void statmethod(){
        System.out.println("In static method");
    }
}

class A1 implements StaticMethodInterface{

    @Override
    public void absmethod() {
        System.out.println("Abstract method A1 class");
    }
}

class B1 implements StaticMethodInterface{

    @Override
    public void absmethod() {
        System.out.println("Abstract method B1 class");
    }

    public static void main(String[] args) {
        StaticMethodInterface a1=new A1();
        a1.absmethod();

        StaticMethodInterface b1=new B1();
        b1.absmethod();

        StaticMethodInterface.statmethod();
    }
}

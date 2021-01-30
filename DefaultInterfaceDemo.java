public interface DefaultInterfaceDemo {
    void absmethod();

    default void defmethod(){
        System.out.println("In default method");
    }
}

class A implements DefaultInterfaceDemo{

    @Override
    public void absmethod() {
        System.out.println("Abstract method A class");
    }
}

class B implements DefaultInterfaceDemo{

    @Override
    public void absmethod() {
        System.out.println("Abstract method B class");
    }

    public static void main(String[] args) {
        DefaultInterfaceDemo a=new A();
        a.absmethod();
        a.defmethod();

        DefaultInterfaceDemo b=new B();
        b.absmethod();
        b.defmethod();
    }
}

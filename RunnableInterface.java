public class RunnableInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread has started");
    }

    public static void main(String[] args) {
        RunnableInterface ri=new RunnableInterface();
        Thread t1=new Thread(ri);
        t1.run();
        System.out.println("Helllo");
    }
}



public class Multithreads {
        public synchronized void displayData(){
            for (int i=0;i<=5;i++){
                try {
                    System.out.println(i);
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
}

class MyThread1 extends Thread{

    Multithreads mul;
    public MyThread1(Multithreads mul){
    this.mul=mul;    }

    public void run(){
        mul.displayData();
    }
}

class MyThread2 extends Thread{

    Multithreads mul;
    public MyThread2(Multithreads mul){
    this.mul=mul;    }

    public void run(){
        mul.displayData();
    }
}

class MainThread{
    public static void main(String[] args) {
        Multithreads m=new Multithreads();
        MyThread1 m1=new MyThread1(m);
        MyThread2 m2=new MyThread2(m);
        m1.start();
        m2.start();
    }
}
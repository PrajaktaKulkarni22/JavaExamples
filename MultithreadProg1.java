public class MultithreadProg1 extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MultithreadProg1 mt1=new MultithreadProg1();
        mt1.start();
        System.out.println("hii");
    }
}

public class MultithreadProg extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MultithreadProg mt=new MultithreadProg();
        mt.run();
        System.out.println("Hi");
    }
}

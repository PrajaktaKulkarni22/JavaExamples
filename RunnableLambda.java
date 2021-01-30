public class RunnableLambda {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            System.out.println("Runnable interface using lambda expression");
        };

        new Thread(r1).start();
    }
}

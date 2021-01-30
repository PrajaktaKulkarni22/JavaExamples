public class ExceptionDemo {
    public static void main(String[] args) {
        int a=5;
        int result=a/1;
        String s="Prajakta";

        try{
            System.out.println("Result is:"+result);
            System.out.println("Length is:"+s.length());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

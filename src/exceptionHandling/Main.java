package exceptionHandling;

public class Main {

    static int divide(int a,int b) throws ArithmeticException{
        if (b==0) throw new ArithmeticException("can not divide by 0");
        else return a/b;
    }
    public static void main(String[] args) {
//        System.out.println (5/0);
        try {
            System.out.println(5/0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally block");
        }

        System.out.println(divide(7,0));


    }
}

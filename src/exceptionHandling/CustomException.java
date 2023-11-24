package exceptionHandling;

public class CustomException extends Exception{

    public CustomException(String msg) {
        super(msg  );
    }

    public static void main(String[] args) throws Exception {
        String name="java";
        if(name.equals("java")) {
            throw new CustomException("Custom Exception thrown");
        }

    }
}

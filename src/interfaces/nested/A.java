package interfaces.nested;

public class A {
    public interface nested{
        boolean isEven(int num);
    }
}
class B implements A.nested{

    @Override
    public boolean isEven(int num) {
        return num%2==0;
    }
}

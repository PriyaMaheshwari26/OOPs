package generics;

public class Main implements GenericInterface<Integer>{

    @Override
    public void display(Integer val) {
        System.out.println("Hello");
    }
}

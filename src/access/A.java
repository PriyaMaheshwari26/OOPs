package access;

public class A {
    public A() {
    }

    //public- access from anywhere
    //private- within same class
    //protected- within same pkg and subclass in diff pkg
    //default- within same pkg
//    private int num;
    protected int num;
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    String name;
    int[] arr;

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}

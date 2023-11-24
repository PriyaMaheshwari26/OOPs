package generics;

import java.util.Arrays;
import java.util.List;

public class WildCardExample<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public WildCardExample() {
        this.data=new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        Object[] temp= Arrays.copyOf(data,data.length*2);
        data=temp;
    }
    public T remove(){
        return (T)data[--size];
    }

    private boolean isFull() {
        return (size==data.length);
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomGenericArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }


    //wildcard
//    These wildcards can be used when you want to
//    relax the restrictions on a variable.
//    For example, say you want to write a method that works on
//    List < Integer >, List < Double >, and List < Number >,
//    you can do this using an upper bounded wildcard.
    private static double sum(List<? extends Number> list)
    {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        WildCardExample<Integer> list=new WildCardExample();
        list.add(3);
        list.add(8);
        list.add(6);
        list.add(5);
        list.add(9);
        list.add(7);
        System.out.println(list);
        System.out.println( list.size());
        System.out.println(list.get(2));
        list.set(2,10);
        System.out.println(list.get(2));
        System.out.println(list.remove());

        //it'll give error
//        WildCardExample<String> list2=new WildCardExample<>();
//        list2.add("Priya");
//        System.out.println(list2);
        WildCardExample<Float> list3=new WildCardExample<>();
        list3.add(9.0f);
        System.out.println(list3);



    }

}


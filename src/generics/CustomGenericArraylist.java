package generics;

import java.util.Arrays;

public class CustomGenericArraylist<T> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomGenericArraylist() {
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

    public static void main(String[] args) {
        CustomGenericArraylist<Integer> list=new CustomGenericArraylist();
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

        CustomGenericArraylist<String> list2=new CustomGenericArraylist<>();
        list2.add("Priya");
        System.out.println(list2);
        CustomGenericArraylist<Float> list3=new CustomGenericArraylist<>();
        list3.add(9.0f);
        System.out.println(list3);



    }

}

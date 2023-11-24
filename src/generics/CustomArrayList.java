package generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayList() {
        this.data=new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int[] temp=Arrays.copyOf(data,data.length*2);
        data=temp;
    }
    public int remove(){
        return data[--size];
    }

    private boolean isFull() {
        return (size==data.length);
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list=new CustomArrayList();
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


    }

}

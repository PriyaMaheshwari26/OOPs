package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human john=new Human(23,"John");
//        Human twin=new Human(john);//slower
        Human twin=(Human) john.clone();
        System.out.println(twin.age+" "+twin.name+" "+ Arrays.toString(twin.arr));
        twin.name="Bob";
        System.out.println(twin.name);
        twin.arr[0]=100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(john.arr));

    }
}

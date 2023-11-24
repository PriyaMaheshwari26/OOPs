package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(9);
        list.get(0);
        list.remove(0);
        System.out.println(list);

        //Vector
        List<String> vc=new Vector<>();
        vc.add("abc");
        vc.add("def");
        System.out.println(vc);
    }


}

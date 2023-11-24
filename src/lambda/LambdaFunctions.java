package lambda;

import java.util.ArrayList;

public class LambdaFunctions {
//    int sum(int a,int b){
//        return a*b;
//    }
    //convert it in Lambda exp

    private int operate(int a,int b,Operation op){
        return op.op(a,b);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i*2);
        }
//        list.forEach((item)->System.out.println(item*2));

        Operation sum=((a, b) -> a+b);
        Operation sub=((a, b) -> a-b);
        Operation prod=((a, b) -> a*b);
        Operation div=((a, b) -> a/b);

        LambdaFunctions fun=new LambdaFunctions();
        System.out.println(fun.operate(5,3,sum));
        System.out.println(fun.operate(5,3,sub));
        System.out.println(fun.operate(5,3,prod));
        System.out.println(fun.operate(5,3,div));

    }

}

interface Operation{
    int op(int a,int b);

}
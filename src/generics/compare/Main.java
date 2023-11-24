package generics.compare;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student(5,90.7f);
        Student s2=new Student(13,68.9f);
        Student s3=new Student(20,88f);
        Student s4=new Student(35,69.0f);
        Student s5=new Student(26,78.9f);
        Student s6=new Student(64,89.6f);
       Student s[]={s1,s2,s3,s4,s5,s6};
//        if(s1.compareTo(s2)>0){
//            System.out.println(s1.compareTo(s2));
//            System.out.println("s1 is bigger");
//        }
//        else if(s1.compareTo(s2)<0){
//            System.out.println(s1.compareTo(s2));
//            System.out.println("s2 is bigger");
//        }
//        else System.out.println("Both are equal");

        //will give exception until comparator method is overridden
        Arrays.sort(s, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.marks-o2.marks);
            }
        });
        //above code can be converted into lambda exp
        Arrays.sort(s,(o1,o2)->(int)(o1.marks-o2.marks));

        System.out.println(Arrays.toString(s));
    }
}

package introduction;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student();
        System.out.println("Student before initialization: "+student1);
        System.out.println("Properties of student object before initialization: ");
        System.out.println(student1.rollno+" "+student1.name+" "+student1.marks);
        student1.rollno=1;
        student1.name="James";
        student1.marks=65;
        System.out.println("Properties of student object After initialization: ");
        System.out.println(student1.rollno+" "+student1.name+" "+student1.marks);
        System.out.println("Student After initialization: "+student1);
        System.out.println("\n");
        System.out.println("Use of constructor");
        Student student2=new Student(20,"Rahul");
        System.out.println(student2.rollno+" "+student2.name);
        System.out.println("\n");
        System.out.println("Use of this keyword");
        Student student3=new Student(20,"Rahul",70);
        System.out.println(student3.rollno+" "+student3.name+" "+student3.marks);

        //if two object are pointing to same
        Student one=new Student();
        Student two=one;
        one.name="Diya";//it'll also change it to diya
        System.out.println(two.name);

    }
}
class Student {
    int rollno=10;
    String name;
    float marks;
    //Constructor
    //calling a constructor using another constructor
    Student(){
        this(100,"default",100.0f);
    }
    //op- 10 null that's why this keyword is important
    Student(int rollno,String name){
        rollno=rollno;
        name=name;
    }

    Student(int rollno,String name,float marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }

    //the above constructor is an example of "CONSTRUCTOR-OVERLOADING"
}


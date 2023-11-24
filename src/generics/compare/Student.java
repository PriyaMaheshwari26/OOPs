package generics.compare;

//implements Comparable<Student>
public class Student {
    int rollno;

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }

    float marks;
    public Student(int rollno,float marks){
        this.rollno=rollno;
        this.marks=marks;
    }


//    @Override
//    public int compareTo(Student o) {
//        return (int) (this.marks-o.marks);
//    }
}

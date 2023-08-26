class Student{
    int rollno;
    String name;
    int marks;
}

public class ArrayOfObject {
    public static void main(String[] args){

        Student s1 = new Student();
        s1.rollno = 101;
        s1.name = "Ari";
        s1.marks = 99;

        Student s2 = new Student();
        s2.rollno = 102;
        s2.name = "Arun";
        s2.marks = 95;

        Student s3 = new Student();
        s3.rollno = 103;
        s3.name = "Aadhi";
        s3.marks = 94;

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for (int i=0; i < students.length; i++){
        //     System.out.println(students[i].name + " " + students[i].marks);
        // }

        // for each loop
        for (Student stud : students){
            System.out.println(stud.name + " " + stud.marks);
        }
    }
}

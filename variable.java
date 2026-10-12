package dsecjavacourse;

public class variable {
    public static void main(String args[]){
        int StudID=1001;
        String StudName="Hariesh";
        int age;
        String dept="CSE";
        System.out.println(StudName);
        System.out.println(dept);
        System.out.println(19);
        student s1= new student();
        s1.marks=90;
        System.out.println(s1.marks);
        System.out.println(student.college);

    }
    public static class student{
        static String college="DSEC - A";
        int marks;

    }
}

import BTech.Student;
import java.util.*;

public class e1{
    public static void main(String[] args) {
        String nm;
        int roll;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rollno");
        roll = sc.nextInt();
        nm=sc.next();
        int m1,m2,m3;
        System.out.println("Enter Sub marks");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        Student s = new Student(roll, nm, m1, m2, m3);
        s.display();
        
    }
}
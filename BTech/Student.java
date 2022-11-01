package BTech;
public class Student {
   int rollno;
   String name;
   int a,b,c;
   int sum=0;
   public Student(int roll,String nm,int m1,int m2,int m3){
    rollno = roll;
    name= nm;
    a= m1;
    b= m2;
    c=m3;
    sum=a+b+c;
   }
   public void display(){
    System.out.println("Rollno is"+ rollno);
    System.out.println("Name is"+name);
    System.out.println("-----Marks-----");
    System.out.println("Sub 1"+a);
    System.out.println("Sub 2"+ b);
    System.out.println("Sub 3"+c);
    System.out.println("Total"+sum);
    System.out.println("Percentage"+sum/3);
   }

}
import java.io.*;
class Fibonacci extends Thread
{
     public void run()
     {
          try
          {
               int a=0, b=1, c=0;

               System.out.println("\n=================================");
               System.out.println("Fibonacci series:");
               for(int i= 0;i<10;i++)
               {
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                    c=a+b;
               }
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}


class Reverse extends Thread
{
     public void run()
     {
          try
          {
               System.out.println("\n=================================");
               System.out.println("\nReverse is: ");
               System.out.println("=================================");
               for (int i=10; i >= 1 ;i-- )
               {
                    System.out.print(i+"  ");
               }
               System.out.println("\n=================================\n\n");
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}



class e3
{
     public static void main(String[] args)
     {
          try
          {
               Fibonacci fib = new Fibonacci();
               fib.start();
               Thread.sleep(4000);
               Reverse rev = new Reverse();
               rev.start();
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}
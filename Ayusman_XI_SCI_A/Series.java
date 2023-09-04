import java.util.*;
class Series extends Number
{
   int sum;
   Series(int b)
   {
       super(b);
       sum=0;
   }
   void calsum()
   {
       for(int i=1;i<=n;i++)
       {
           sum+=super.fact(i);
       }
   }
   void display()
   {
       super.display();
       System.out.println("Factorial: "+sum);
   }
   public static void main()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of terms:");
       int m=sc.nextInt();
       Series ob=new Series(m);
       ob.calsum();
       ob.display();
   }
}

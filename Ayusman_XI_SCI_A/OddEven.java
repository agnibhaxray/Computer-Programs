import java.util.*;
public class OddEven
{
   int arr[];
   int m;
   OddEven(int mm)
   {
       m=mm;
       arr=new int[m];
   }
   void fillarray()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the elements: ");
       for(int i=0;i<m;i++)
       {
           arr[i]=sc.nextInt();
       }
   }
   OddEven arrange(OddEven P)
   {
       int m3= this.arr.length + P.arr.length;
       OddEven Q=new OddEven(m3);
       int k=0;
       for(int i=0;i<this.arr.length;i++)
       {
           if(this.arr[i]%2!=0)
           Q.arr[k++]=this.arr[i];
       }
       for(int i=0;i<P.arr.length;i++)
       {
           if(P.arr[i]%2!=0)
           Q.arr[k++]=P.arr[i];
       }
       for(int i=0;i<this.arr.length;i++)
       {
           if(this.arr[i]%2==0)
           Q.arr[k++]=this.arr[i];
       }
       for(int i=0;i<P.arr.length;i++)
       {
           if(P.arr[i]%2==0)
           Q.arr[k++]=P.arr[i];
       }
       return Q;
   }
   void display()
   {
       System.out.print("Elements: ");
       for(int i=0;i<m;i++)
       {
           System.out.print(arr[i]+"  ");
       }
       System.out.println();
   }
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array 1:");
       int m1=sc.nextInt();
       OddEven ob1=new OddEven(m1);
       ob1.fillarray();
       System.out.println("Enter the size of array 2:");
       int m2=sc.nextInt();
       OddEven ob2=new OddEven(m2);
       ob2.fillarray();
       OddEven ob3=ob1.arrange(ob2);
       ob3.display();
   }
}

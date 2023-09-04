import java.util.*;
public class DeciOct
{
    int n;
    int oct;
    int temp;
    int i;
    DeciOct()
    {
        n=0;
        oct=0;
        temp=0;
        i=0;
    }
    void getNum(int nn)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal no.");
        nn=sc.nextInt();
    }
    void dec_oct()
    {
        temp=n;
        if(temp!=0)
        {
             int rem=n%10;
             oct+=rem*(int)Math.pow(10,i++);
             dec_oct();
        }
    }
    void display()
    {
        System.out.println("Decimal no: "+n);
        System.out.print("Octal no: ");
        dec_oct();
    }
    public static void main(String []args)
    {
        DeciOct ob=new DeciOct();
        ob.getNum(ob.n);
        ob.display();
    }
}

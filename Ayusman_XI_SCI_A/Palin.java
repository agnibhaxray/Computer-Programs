import java.util.*;
public class Palin
{
    int num;
    int revnum;
    Palin()
    {
        num=0;
        revnum=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        num=sc.nextInt();
    }
    int reverse(int y)
    {
        if(y==0)
        return revnum;
        else
        {
            revnum=(revnum*10)+(y%10);
            return reverse(y/10);
        }
    }
    void check()
    {
        int temp=num;
        reverse(temp);
        if(num==revnum)
        System.out.println("It is a Palindrome");
        else
        System.out.println("It is not a Palindrome");
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        Palin ob=new Palin();
        ob.accept();
        ob.check();
    }
}

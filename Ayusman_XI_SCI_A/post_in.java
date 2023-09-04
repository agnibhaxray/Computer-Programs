import java.util.*;
public class post_in
{
    static String arr[];
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the postfix notation:");
        String s=sc.next();
        arr=new String[s.length()];
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i))==false)
            c++;
        }
        infix(s,c);
    }
    public static void infix(String a,int count)
    {
        if(count==0)
        return a;
        else
        {
            
            return infix(a,count-1);
        }
    }
}

import java.util.*;
public class encode
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the encoded text:");
        String s=sc.next();
        encode ob=new encode();
        String x=ob.code(s);
        for(int i=0;i<x.length();i++)
        {
            x=x.replace("  "," ");
        }
        for(int i=0;i<x.length()-1;i++)
        {
            if(x.charAt(i)==' ')
            {
                char c=x.charAt(i+1);
                x=x.replace(c,Character.toUpperCase(c));
            }
            else
            {
                char c=x.charAt(i+1);
                x=x.replace(c,Character.toLowerCase(c));
            }
        }
        if(x=="#")
        System.out.println("Invalid Output");
        else
        System.out.println("Decoded Text:"+x);
    }
    public String code(String a)
    {
        String b="";
        while(a.length()>3)
        {
            String a1=a.substring(0,2);
            String a2=a.substring(0,3);
            int n1=Integer.parseInt(a1);
            int n2=Integer.parseInt(a2);
            if(n1>=65 && n1<=90)
            {
                b+=(char)n1;
                a=a.substring(2);
            }
            else if(n2>=97 && n2<=122)
            {
                b+=(char)n2;
                a=a.substring(3);
            }
            else if(n1==32)
            {
                b+=" ";
                a=a.substring(2);
            }
            else
            {
                b="#";
                return b;
            }
        }
        int n=Integer.parseInt(a);
        b+=(char)n;
        return b;
    }
}

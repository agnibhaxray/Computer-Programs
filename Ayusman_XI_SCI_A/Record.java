import java.util.*;
class Record
{
    String n[];
    int m[];
    int size;
    Record(int cap)
    {
        size=cap;
        m=new int[size];
        n=new String[size];
    }
    void readarray()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the name of student "+(i+1));
            n[i]=sc.next();
            System.out.println("Enter the marks of student "+(i+1));
            m[i]=sc.nextInt();
        }
    }
    void display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println("The name of student "+(i+1)+" is "+n[i]);
            System.out.println("The marks of student "+(i+1)+" is "+m[i]);
        }
    }
}

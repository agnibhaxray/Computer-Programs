import java.util.*;
class Highest extends Record
{
    int ind;
    Highest(int x)
    {
        super(x);
        ind=0;
    }
    void find()
    {
        super.readarray();
        for(int i=0;i<m.length;i++)
        {
            if(m[i]>m[ind])
            ind=i;
        }
    }
    void display()
    {
        super.display();
        System.out.print("The Highest Marks "+m[ind]+" is obtained by ");
        for(int i=0;i<m.length;i++)
        {
            if(m[i]==m[ind])
            {
                System.out.print(n[i]+", " );
            }
        }
        System.out.println();
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of students: ");
        int y=sc.nextInt();
        Highest ob=new Highest(y);
        ob.find();
        ob.display();
    }
}

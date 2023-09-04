import java.util.*;
class teacher
{
    String name[];
    String dob[];
    String doj[];
    int size;
    teacher(int cap)
    {
        size=cap;
        name=new String[size];
        dob=new String[size];
        doj=new String[size];
    }
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the name of teacher "+(i+1));
            name[i]=sc.next();
            System.out.println("Enter the date of birth: ");
            dob[i]=sc.next();
            System.out.println("Enter the date of joining: ");
            doj[i]=sc.next();
        }
    }
    void showdata()
    {
        System.out.println("Teacher"+"\t"+"Date of birth"+"\t"+"Date of joining");
        for(int i=0;i<size;i++)
        {
            System.out.println(name[i]+"\t"+"\t"+dob[i]+"\t"+"\t"+doj[i]);
        } 
    }
}

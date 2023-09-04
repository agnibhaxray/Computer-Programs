import java.util.*;
class principal extends teacher
{
    principal(int x)
    {
        super(x);
    }
    void sortdata()
    {
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-1-i;j++)
            {
                if(name[j].compareTo(name[j+1])>0)
                {
                    String temp1=name[j+1];
                    name[j+1]=name[j];
                    name[j]=temp1;
                    
                    String temp2=dob[j+1];
                    dob[j+1]=dob[j];
                    dob[j]=temp2;
                    
                    String temp3=doj[j+1];
                    doj[j+1]=doj[j];
                    doj[j]=temp3;
                }
            }
        }
    }
    void searchdata()
    {
        super.showdata();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the list no. of the teacher:");
        int n=sc.nextInt();
        System.out.println("Teacher: "+name[n-1]);
        System.out.println("Date of Birth: "+dob[n-1]);
        System.out.println("Date of Joining: "+doj[n-1]);
    }
}

import java.util.*;
class Merger
{
    long n1,n2,MergeNumber;
    Merger()
    {
        n1=0;
        n2=0;
    }
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Two Numbers :- ");
        n1=sc.nextLong();
        n2=sc.nextLong();
    }
    void join()
    {
        MergeNumber=Long.parseLong(Long.toString(n1)+Long.toString(n2));
    }
    void show()
    {
        System.out.println(" Original Numbers  :   "+n1+" \t "+n2+".");
        System.out.println(" Merged Number     :   "+MergeNumber);
    }
}
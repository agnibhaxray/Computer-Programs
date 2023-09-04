import java.util.*;
public class TransMat
{
    int arr[][];
    int m,n;
    public TransMat(int mm,int nn)
    {
        m=mm;
        n=nn;
        arr=new int[m][n];
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        TransMat ob=new TransMat(a,b);
    }
}

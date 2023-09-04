public class Number
{
    int n;
    Number(int nn)
    {
        n=nn;
    }
    int fact(int a)
    {
        if(a==0)
        return 1;
        else
        return a*fact(a-1);
    }
    void display()
    {
        System.out.println("The Input is: "+n);
    }
}

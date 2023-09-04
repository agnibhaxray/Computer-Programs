import java.util.*;
public class Mixer
{
    int n; int arr[][];
    Mixer(int nn)
    {
        n=nn;
    }
    Mixer mix(Mixer A)
    {
        int m3=this.arr.length+A.arr.length;
        Mixer B=new Mixer(m3);
        for(int i=0;i<B.arr.length;i++)
        {
            B.arr
        }
    }
    void display()
    {
        
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sizes: ");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        Mixer ob1=new Mixer(m1);
        Mixer ob2=new Mixer(m2);
        Mixer ob3=ob1.mix(ob2);
        System.out.println("Output: ");
        ob3.display();
    }
}

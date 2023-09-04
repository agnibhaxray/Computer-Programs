import java.util.*;
public class odd_even
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int count=0;
        int temp=n;
        int odd=0,even=0;
        while(temp!=0)
        {
            temp=temp/10;
            count++;
        }
        while(n!=0)
        {
            int rem=n%10;
            if(count%2==0)
            even+=rem;
            else
            odd+=rem;
            count--;
            n=n/10;
        }
        System.out.println("Sum of evens: "+even);
        System.out.println("Sum of odds: "+odd);
    }
}

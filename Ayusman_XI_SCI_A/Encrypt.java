import java.util.*;
public class Encrypt
{
   String wrd;
   int len;
   String newwrd;
   Encrypt()
   {
       wrd="";
       newwrd="";
       len=0;
   }
   void accept_word()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the word in uppercase:");
       wrd=sc.next();
       len=wrd.length();
   }
   void freqvowcon()
   {
       int c1=0,c2=0;
       for(int i=0;i<len;i++)
       {
           char c=wrd.charAt(i);
           if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
           c1++;
           else
           c2++;
       }
       System.out.println("No. of vowels: "+c1);
       System.out.println("No. of consonants: "+c2);
   }
   void nextVowel()
   {
       String arr="AEIOU";
       for(int i=0;i<len;i++)
       {
          char c=wrd.charAt(i);
          if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
          {
             newwrd+=arr.charAt((arr.indexOf(c)+1)%5);
          }
          else
          newwrd+=wrd.charAt(i);
       }
       System.out.println(newwrd);
   }   
   public static void main(String []args)
   {
       Encrypt ob=new Encrypt();
       ob.accept_word();
       ob.freqvowcon();
       ob.nextVowel();
   }
}
import java.util.*;
public class Stock
{
    String item;
    int qty;
    int rate;
    int amt;
    Stock(String it, int qt, int rt)
    {
        item=it;
        qty=qt;
        rate=rt;
        amt=qty*rate;
    }
    void display()
    {
        System.out.println("BEFORE UPDATION:");
        System.out.println("NAME: "+item);
        System.out.println("QUANTITY: "+qty);
        System.out.println("RATE: "+rate);
        System.out.println("NET AMOUNT: "+amt);
    }
}

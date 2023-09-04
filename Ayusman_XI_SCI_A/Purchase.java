import java.util.*;
public class Purchase extends Stock
{
    int pqty,prate;
    Purchase(String it, int qt, int rt, int nqt, int nrt)
    {
        super(it,qt,rt);
        pqty=nqt;
        prate=nrt;
    }
    void update()
    {
        qty+=pqty;
        if(rate!=prate)
        rate=prate;
        amt=qty*rate;
    }
    void display()
    {
        super.display();
        update();
        System.out.println();
        System.out.println("AFTER UPDATION:");
        System.out.println("NAME: "+item);
        System.out.println("QUANTITY: "+qty);
        System.out.println("RATE: "+rate);
        System.out.println("NET AMOUNT: "+amt);
    }
}

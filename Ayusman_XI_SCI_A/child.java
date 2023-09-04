class child extends parent
{
    char c;
    child(int m,float n,char p)
    {
        super(m,n);
        c=p;
    }
    void display()
    {
        System.out.println("c is "+c);
        super.display();
    }
    public static void main(String []args)
    {
        child ob= new child(5,6.0f,'a');
        
        ob.display();
        
    }
}

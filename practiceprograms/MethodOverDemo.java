class superclass
{
    int a;
    superclass(int x)
    {
        a=x;
    }
    void display()
    {
        System.out.println("a="+a);
    }
}
class subclass extends superclass
{
    int b;
    subclass(int x, int y)
    {
        super(x);
        b=y;
    }
    void display()
    {
        System.out.println("a=" +a+ "b="+b);
     }

}

class SubSuper
{
    public static void main(String args[])
    {
        subclass o = new subclass();
        o.display();
    }

}

    

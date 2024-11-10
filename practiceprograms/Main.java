class Superclass
{
    int x;
    Superclass(int m)
    {
        x=m;
    }
}
class Subclass extends Superclass
{
    int y;
    Subclass(int m, int n)
    {
        super(m);
        y=n;
    }
    void display()
    {
        System.out.println("x="+ x+ "y="+y);
    }
}

public class Main
{
    public static void main(String args[])
    {
        Subclass obj = new Subclass(10,20);
        obj.display();
    }
}    
    

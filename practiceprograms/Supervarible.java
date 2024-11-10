class Superclas
{
    int x=100;
}
class subclass extends superclass
{
    int x=200;
    void display()
    {
        System.out.println("Super Class x="+super.x);
        System.out.println("Sub class: x="+x);
    }
}

class Supervarible
{
    public static void main(String args[])
    {
            subclass S2 = new subclass();
            S2.display();
    }
}



class num
{
    public void display()
    {
        System.out.println("i am in nunber class");
    }
}

class AnonymousDemo
{
    public void create()
    {
        num n = new num()
        {
            public void display()
            {
                System.out.println("i am in anynomous class.");
            }
        };

        n.display();
        }
}

class Demo
{
    public static void main(String args[])
    {
        AnonymousDemo obj = new AnonymousDemo();
        obj.create();
    }
}

    

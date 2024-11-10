class Number
{
    int a,b;
    void display()
    {
        System.out.println(a + "" +b);
    }
}

class CDemo  //Main Class
{
    public static void main(String args[])
    {
        Number  obj = new Number();
        obj.a=10;
        obj.b=20;
        obj.display();
    }
}


    

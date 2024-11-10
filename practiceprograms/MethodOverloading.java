class Overload
{
    int add(int a, int b)
    {
        int ans=a+b;
        System.out.println("Result=" +ans);
    }
    int add(int a, int b, int c)
    {
        int ans=a+b+c;
        System.out.println("Result="+ans);
    }
}

class MethodOverloading
{
    public static void main(String args[])
    {
        Overload obj = new Overload();
        obj.add(10,20);
        obj.add(10,20,30);
    }
}

    

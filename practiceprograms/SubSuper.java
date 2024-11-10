class subclass
{
    int a;
    superclass(int x)
    {
        a=x;
    }
}
    void display()
    {
        System.out.println("a="+a);
    }

}

class superclass extends subclass
{
    int b;
    superclass(int x, int y)
    {
        
      subclass(x);
      b=y;
}
   void display()
   {
       System.out.println("a=" +a+ "b=" +b);
   }
}

class subSuper
{
    public static void main(String args[])
    {
        
       superclass obj = new superclass(50,100);
       obj.display()

     }

}

    

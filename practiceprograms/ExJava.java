class outer 
{
     int x=100;
     class inner
      {
          int y=200;
          void display()
          {
            System.out.println("x="+x);
            System.out.println("y="+y);
          }
      }
      void show()
       {
           inner i = new inner();
           System.out.println("Innner Show");
           i.display();
       }
}

class ExJava
{
   public static void main(String args[])
    {
         outer o=new outer();
         System.out.println("outer show");
         o.show();
    }
}

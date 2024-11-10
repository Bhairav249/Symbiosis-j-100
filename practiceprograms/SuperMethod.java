class Superclass
{
    int x=100;
    void display()
    {
          System.out.println("Super Class:x="+x);
    }
}

class Subclass extends Superclass
{
    int x=200;
    void display()
     {
           super.display();
           System.out.println("Sub Class is x="+x);
     }
}
  

class SuperMethod 
 {
       public static void main(String args[])
         {
            Subclass obj = new Subclass();
            obj.display();
         }
}  
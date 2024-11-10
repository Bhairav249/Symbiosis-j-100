class outer 
{
    int x=20;
    class inner
       {
           void display()
            { 
               System.out.println("inner x is"+x);
            }
       }
void show()
       {
           inner o = new inner();
           o.disp();
        }
}

class example
{
      public static void main(String args[])
       {
            outer obj = new outer();
            obj.show();
            outer.inner obj2 = new inner();
            obj2.disp();
       }

}
 
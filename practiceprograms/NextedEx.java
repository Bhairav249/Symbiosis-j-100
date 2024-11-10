class outer
{
    int x=10;
    class inner
    {
        int y=20;
        void display()
        {
            System.out.println("x="+x);
            System.out.println("y="+y);
        }
   }

    void show()
    {
        inner i = new inner();
        System.out.println("Show Inner");
        i.display();
     }
}
class NextedEx
{
    public static void main(String args[])
    {
        outer o = new outer();
        System.out.println("Show outer");
        o.show();
     }
}

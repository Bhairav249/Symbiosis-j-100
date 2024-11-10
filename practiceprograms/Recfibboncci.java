class Recfibboncci
{
    int fib(int n)
    {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }

    public static void main(String args[])
    {
        int n,i;
        n =Integer.parseInt(args[0]);
        Recfibboncci R = new Recfibboncci();
        for(i=0; i<=n; i++)
        {
            System.out.println(R.fib(i));
        }

     }
 }

        

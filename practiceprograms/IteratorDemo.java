import java.util.*;
class IteratorDemo
{
    public static void main(String args[])
    {
        int i,n;
        String str;
        Inetger obj;
        Connection c = new ArrrayList();
        n=args.length;
        for(i=0;i<n;i++)
        {
            c.add(args[i]);
        }
        Iterator it=c.Iterator();
        while(it.hasNext())
        {
            str=(String)it.next();
            System.out.println(str);
        }
    }

}

    

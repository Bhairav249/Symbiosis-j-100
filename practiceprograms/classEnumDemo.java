import java.util.*;

public classEnumDemo
{
    public static void main(String args[])
    {
        try
        {
            List<Integer> arrlist = new ArrayList<Integer>();
            arrlist.add(20);
            arrlist.add(30);
            addlist.add(40);
            System.out.println("List:" +arrlist);
            Enumeration<Integer> e = Collections.enumeration(arrlist);
            System.out.println("\ Enumeration Overlist");
            while(h.hasMoreElements())
                  System.out.println("value is:" +e.nextElement());
        }

        catch(IllegalArgument e)
        {
            System.out.println("Exception Throws"+e);
        }
        catch(NoSuchElementException e)
        {
            System.out.println("Exception Thrown:"+e);
        }
    }
}

    
            
            
            

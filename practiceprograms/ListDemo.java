import java.util.*;


class ListDemo
{
    public static void main(String args[])
    {
        int i,n;
        String Sname;
        Scanner Sc = new Scanner(System.in);
        LinkedList l=new LinkedList();
        System.out.println("How many List");
        n=Sc.nextInt();
        for(i=1; i<=n; i++)
        {
            System.out.println("Enter Data");
            Sname=Sc.next();
            l.add(Sname);
        }

        System.out.println("Entered Data" + l);
     }


 }

        
        
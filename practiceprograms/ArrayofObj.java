import java.util.*;


class student
{
    int sid;
    String sname;
    void accept(int id, String name)
    {
        sid=id;
        sname=name;
    }
    void display()
    {
       System.out.println("sid="+sid);
       System.out.println("sname="+sname);
    }
}

class ArrayOfObj
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        student S1[] = new student[3];
        for(int i=0; i<3; i++)
        {
            S1[i]=new student();
            System.out.println("Enter Id");
            S1[i].sid=sc.nextInt();
            System.out.println("Enter Name");
            S1[i].sname=sc.next();
            S1[i].accept(S1[i].sid, S1[i].sname);
        }
        for(int i=0; i<3; i++)
        {
            S1[i].display();
        }
     }
}

        

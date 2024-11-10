import java.util.*;

class student
{
    int sid;
    String Sname;
    void accept(int sid, String Sname);
    {
        sid=id;
        Sname=name;
    }
    void display()
    {
        System.out.println("student id="+sid);
        System.out.println("student name="+Sname);
    }
    
}

class ArrayObject
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        student S1[] = new student[3];

        for(int i=0; i<3; i++)
        {
            S1[i]=new student();
            System.out.println("Enter id");
            S1[i].sid=Sc.nextInt();
            System.out.println("Enter Sname");
            S1[i].Sname=Sc.next();
            S1[i].accept(S1[i].sid, S1[i].Sname);
        }
        for(int i=0; i<3; i++)
        {
            S1[i].display();
        }
     }
}

 






            

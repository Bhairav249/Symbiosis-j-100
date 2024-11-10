import java.util.*;

class Employee
{
    public static void main(String args[])
    {
        int eid;
        String Empname;
        int salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Eno, Ename and Salary");

        eid=sc.nextInt();
        Empname=sc.next();
        salary=sc.nextInt();

        System.out.println("Emp id is"+eid);
        System.out.println("Empname is"+Empname);
        System.out.println("Salary is"+salary);

        }
    }

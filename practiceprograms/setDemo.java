import java.util.*;
class setDemo
{
    public static void main(String args[])
    {
        Set C1 = new HashSet();
        C1.add(2);
        C1.add(3);
        System.out.println("Set1: " +C1);


        Set C2 = new HashSet();
        C2.add(1);
        C2.add(2);
        System.out.println("Set2:"+ C2);


        C2.addAll(C1);
        System.out.println("Union Is:" +C2);
    }
}

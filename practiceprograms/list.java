import java.util*;

public class Slip28A
{
    public static void main(String args[])
    {
        int count=0;
        List<String> a1 = new ArrayList<>();
        for(int i=0; i<args.length; i++)
        {
            a1.add(args[i])
        }

        for(int i=0; i<a1.size(); i++)
        {
           String element = a1.get(i);
            try{

                int j =Integer.parseInt(element);
                count++;
              }
            catch(NumberFormatException e){}
           }
        }
    System.out.println(count + "integer Present in list");
    }
}

import java.io.*;
public class silp1B{
   public static void main(String args[])throws
	IoException{
   char ch;
   FileReader fr = new FileReader("a.txt");
   FileWriter fw = new FileWriter("b.txt");
   int c;
   while((c=fr.read())!=-1){
    ch=(char)c;
    if(Character.isDigit(ch)==false){
     fw.write(c);
     
  }
    
}
  fr.close();
  fw.close();

  }

}

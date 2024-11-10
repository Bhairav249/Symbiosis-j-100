//write a java program to display all the vowels of the given string.

import java.util.*;
public class Slip2A
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enater A String");
        String str = scanner.next();

        Set<Character> set = new HashSet<Character>();
        for(int i=0; i<str.length(); i++){
            char c=str.charAt(i);
            if(vowels(c))
            {
                 set.add(c);
                 
            }
        }
        System.out.print("Vowels are:");
        for(Character c:set){
            System.out.println("  "+ c);
            }
        scanner.close();
    }

    public static boolean vowel(char character)
    {
        if(character=='a' || character=='A' || character=='e' || character=='E' ||character=='i' || character=='I'
             character=='o' || character=='O' || character=='u' || character=='U'){
              return true;
        }else{
              return false;
        }
    }

}
        



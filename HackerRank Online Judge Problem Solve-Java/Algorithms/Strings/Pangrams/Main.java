import java.io.*;
import java.util.*;

/* 
* =====================
* => D Y N A M I T E <=
* =====================
*  The Dynamite Group
* By,
* N3o D4rk3r
* https://github.com/n3o-d4rk3r
*======================
* Java 8
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        
        String[] alphabet = new String[]{"A","B","C","D","E",
                                         "F","G","H","I","J",
                                         "K","L","M","N","O",
                                         "P","Q","R","S","T",
                                         "U","V","W","X","Y","Z"};
        Set<String> pangramTracker = new HashSet<>(Arrays.asList(alphabet));
        
        for(char letter : s.toCharArray())
        {
            if(pangramTracker.contains(Character.toString(letter).toUpperCase()))
            {
                pangramTracker.remove(Character.toString(letter).toUpperCase());       
            }
            
            if(pangramTracker.isEmpty())//Our tracker is empty meaning we have see every letter
            {
                System.out.println("pangram");
                System.exit(0);
            }
        }
        
        //We never saw every letter of the alphabet
        System.out.println("not pangram");
    }
}